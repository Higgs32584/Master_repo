import java.util.ArrayList;
import java.util.LinkedList;

public class DiningHall {

    LinkedList<Table> tables;


    public void addTable(Table t){

        tables.add(t);

    }



    public DiningHall(){

    tables =new LinkedList<>();
    }

    public Table findTable(Person p) {

        for (Table t : tables) {

            if (t.lookupPerson(p))

                return t;

        }
        return null;
    }


    public void placeGroup(Group g) {

        Table t = ageMatch(g.averageAge(), g.size());

        if (t == null){

            t = findTableEmpty();
        }

        if (t == null){

            t = findTableWithFreeSeats(g.size());}

        if (t == null){

            return;

        }

        for( Person p : g.people){

            t.addPerson(p);
        }

    }
    public String seatingChart(){

        ArrayList<String> l = new ArrayList<>();

        for(Table t : tables){

            l.add(t.display());

        }
        return "SEATING CHART: " + l.toString();
    }

    public Table ageMatch(double targetAge, int seatsNeeded){

        for(Table current : tables){

            if(current.checkaverageAge(targetAge) && current.spaceForGroup(seatsNeeded)) return current;

        }
        return null;

    }

    /*spaceFor(seatsNeeded) and

    t.averageAge=targetAge ± 5
    zeroOccupants -(private)*/

    public Table findTableEmpty(){

        for (Table t :tables) {
            if (t.isEmpty()) {
                return t;
            }
        }
        return null;
    }

    public Table findTableWithFreeSeats(int seatsNeeded) {

            return tables.stream().filter(t -> t.spaceForGroup(seatsNeeded)).findFirst().orElse(null);
    }
}