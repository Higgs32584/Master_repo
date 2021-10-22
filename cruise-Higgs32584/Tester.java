import org.junit.Test;
/*
        * This is Michaels code!  It's goal is to test the Dining Hall code
        * using jUnit.
        * CS 312 - Assignment 8
        * @author Michael Higgins
        * @version 1  11/22/2020
        */

        import static org.junit.Assert.*;
// for main
        import org.junit.runner.JUnitCore;
        import org.junit.runner.Result;
        import org.junit.runner.notification.Failure;

// for listener
        import org.junit.runner.Description;
        import org.junit.runner.notification.RunListener;

public class Tester
{
    public Tester() {}

    @Test
    public void personTest() // might go on to test a range of powers
    {
        Person p = new Person("Harry Warden",31);
        assertEquals(p.display(),
                "Harry Warden : 31.0");
    }

    @Test
    public void addGroupTest()
    {
        Person p1 = new Person("Sarah Mercer",21);
        Person p2 = new Person("Axel Palmer", 22);
        Group g1 = new Group();
        g1.addPerson(p1);
        g1.addPerson(p2);
        assertEquals(g1.display(), "AVERAGE: 21.5 CURRENT MEMBERS: [Sarah Mercer : 21.0, Axel Palmer : 22.0]");
    }
    @Test
    public void addPersonTable(){
        Person p = new Person("Chief Jake Newby",62 );
        Table t = new Table(5, "Table one");
        t.addPerson(p);
        assertEquals(t.display(),"TABLE NAME: Table one CURRENT MEMBERS: [Chief Jake Newby : 62.0]");
    }
    @Test
    public void checkifTableEmpty(){
        Table t = new Table(5, "Table TWO");
        assertTrue(t.isEmpty());
    }
    @Test
    public void AddTableToDininghall(){
        DiningHall d = new DiningHall();
        Table t = new Table(8, "Table THREE!");
        d.addTable(t);
        assertEquals(d.seatingChart(),"SEATING CHART: [TABLE NAME:Table THREE! CURRENT MEMBERS: N/A]");
    }
    @Test
    public void lost(){

        DiningHall d = new DiningHall();
        Person p = new Person("Axel Palmer",26);

        Table t1 = new Table(5,"Table One");
        t1.addPerson(new Person("Tom Jesse",22));
        t1.addPerson(new Person("Sarah Mercer",20));
        t1.addPerson(new Person("Axel Palmer",26));

        Table t2= new Table(5,"Table One");
        t2.addPerson(new Person("Patty",52));
        t2.addPerson(new Person("Chief Jake Newby",20));
        t2.addPerson(new Person("Hollis",29));

        Table t3 = new Table(5,"Table One");
        t3.addPerson(new Person("Howard Landers",22));
        t3.addPerson(new Person("Harriet",23));
        t3.addPerson(new Person("Mike Stavinski",19));

        d.addTable(t1);
        d.addTable(t2);
        d.addTable(t3);

        assertEquals(d.findTable(p),t1);

    }
    @Test
    public void placeGroup(){

        DiningHall d = new DiningHall();

        Table t1= new Table(8,"Table One");

        t1.addPerson(new Person("Patty",52));

        t1.addPerson(new Person("Chief Jake Newby",20));

        t1.addPerson(new Person("Hollis",29));

        Table t2 = new Table(8,"Table Two");

        t2.addPerson(new Person("Howard Landers",22));

        t2.addPerson(new Person("Harriet",23));

        t2.addPerson(new Person("Mike Stavinski",19));

        Group g1 = new Group();

        g1.addPerson(new Person("Tom Jesse",22));

        g1.addPerson(new Person("Sarah Mercer",20));

        g1.addPerson(new Person("Axel Palmer",26));

        d.addTable(t1);

        d.addTable(t2);

        d.placeGroup(g1);

        assertEquals(t2.display(), "TABLE NAME: Table Two CURRENT MEMBERS: [Howard Landers : 22.0, Harriet : 23.0, Mike Stavinski : 19.0, Tom Jesse : 22.0, Sarah Mercer : 20.0, Axel Palmer : 26.0]");

    }
    @Test
    public void checkAgeMatch(){

        DiningHall d = new DiningHall();

        Table t1= new Table(8,"Table One");

        t1.addPerson(new Person("Patty",52));

        t1.addPerson(new Person("Chief Jake Newby",20));

        t1.addPerson(new Person("Hollis",29));

        Table t2 = new Table(8,"Table Two");

        t2.addPerson(new Person("Howard Landers",22));

        t2.addPerson(new Person("Harriet",23));

        t2.addPerson(new Person("Mike Stavinski",19));

        Group g1 = new Group();

        g1.addPerson(new Person("Tom Jesse",22));

        g1.addPerson(new Person("Sarah Mercer",20));

        g1.addPerson(new Person("Axel Palmer",26));

        d.addTable(t1);

        d.addTable(t2);

        d.ageMatch(22.6,5);

        assertEquals( d.ageMatch(22.6,5),t2);

    }

    @Test
    public void findTableEmpty(){

        DiningHall d = new DiningHall();

        Table t1= new Table(8,"Table One");

        t1.addPerson(new Person("Patty",52));

        t1.addPerson(new Person("Chief Jake Newby",20));

        t1.addPerson(new Person("Hollis",29));

        Table t2 = new Table(8,"Table Two");

        t2.addPerson(new Person("Howard Landers",22));

        t2.addPerson(new Person("Harriet",23));

        t2.addPerson(new Person("Mike Stavinski",19));
        Table t3 = new Table(4,"Table Three");

        d.addTable(t1);

        d.addTable(t2);

        d.addTable(t3);

        assertEquals(d.findTableEmpty().tableName,"Table Three");
    }
    @Test
    public void findEnoughSpace(){

    DiningHall d = new DiningHall();

    Table t1= new Table(8,"Table One");

    t1.addPerson(new Person("Patty",52));

    t1.addPerson(new Person("Chief Jake Newby",20));

    t1.addPerson(new Person("Hollis",29));

    Table t2 = new Table(8,"Table Two");

    t2.addPerson(new Person("Howard Landers",22));

    t2.addPerson(new Person("Harriet",23));

    t2.addPerson(new Person("Mike Stavinski",19));
    Table t3 = new Table(4,"Table Three");

    d.addTable(t1);

    d.addTable(t2);

    d.addTable(t3);

    assertEquals(d.findTableWithFreeSeats(3).tableName,"Table One");
}
@Test
    public void displayChart(){

    DiningHall d = new DiningHall();

    Table t1= new Table(8,"Table One");

    t1.addPerson(new Person("Patty",52));

    t1.addPerson(new Person("Chief Jake Newby",60));

    t1.addPerson(new Person("Hollis",29));

    Table t2 = new Table(8,"Table Two");

    t2.addPerson(new Person("Howard Landers",22));

    t2.addPerson(new Person("Harriet",23));

    t2.addPerson(new Person("Mike Stavinski",19));

    Table t3 = new Table(4,"Table Three");
    t3.addPerson(new Person("Tom Jesse",22));

    t3.addPerson(new Person("Sarah Mercer",20));

    t3.addPerson(new Person("Axel Palmer",26));

    d.addTable(t1);

    d.addTable(t2);

    d.addTable(t3);

    assertEquals(d.seatingChart(),"SEATING CHART: [TABLE NAME: Table One CURRENT MEMBERS: [Patty : 52.0, Chief Jake Newby : 60.0, Hollis : 29.0], TABLE NAME: Table Two CURRENT MEMBERS: [Howard Landers : 22.0, Harriet : 23.0, Mike Stavinski : 19.0], TABLE NAME: Table Three CURRENT MEMBERS: [Tom Jesse : 22.0, Sarah Mercer : 20.0, Axel Palmer : 26.0]]");
}
    public static void main(String[] args)
    {
        JUnitCore runner = new JUnitCore();

        runner.addListener(new TestListener());

        Result result = runner.run(Tester.class);

    }
}


class TestListener extends RunListener
{
    public void testStarted(Description description) { }

    public void testFinished(Description description)
    {
        // System.out.println("Finished "+ description.getMethodName());
    }

    public void testRunFinished(Result result)
    {
        int ran = result.getRunCount();

        int failed = result.getFailureCount();


        System.out.println("Ran " + ran + " SUCCESSES: " + (ran-failed) + (result.wasSuccessful() ? " passed ":" "));

        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

    }
}
