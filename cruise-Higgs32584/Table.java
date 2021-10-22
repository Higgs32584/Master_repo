import java.util.ArrayList;
import java.util.List;
public class Table {

    protected List<Person> occupants;

    protected int seatsAvailable;

    protected String tableName;


    // adds a person to the table, and updates occupants & seatsAvailable

    public void addPerson(Person p) {

        occupants.add(p);

        seatsAvailable -= 1;

    }

    //Compute a derived result, the average age of the table

    public boolean checkaverageAge(double currentAge) {

        int sum = 0;

        for (Person p : occupants) sum += p.age;

        int average = sum / occupants.size();

        if(average - currentAge <= 5 && average - currentAge >= -5){
            return true;
        }
        return false;
    }


    public Table(int seatsAvailable, String tableName) {

        this.tableName = tableName;

        this.seatsAvailable = seatsAvailable;

        occupants = new ArrayList<>();

    }
    public String display(){
        ArrayList<String> l = new ArrayList<>();

        for(Person p : occupants){

            l.add(p.display());

        }
        if(l.size()==0){
            return "TABLE NAME:"+tableName+ " CURRENT MEMBERS: N/A";
        }
        return "TABLE NAME: "+ tableName+" CURRENT MEMBERS: "+l.toString();
    }






    public boolean isEmpty(){

        return occupants.isEmpty();

    }



    public boolean lookupPerson(Person lost){

        for(Person p: occupants){

            if(p.compareTo(lost)){

                return true;

            }

        }
        return false;
    }


    public boolean spaceForGroup(int seatsAvailable){

        return this.seatsAvailable >= seatsAvailable;

    }

}
/*attributes:
        [ not included: seats - the number of seats at this table -- it’s a derived result]
        people - people currently assigned to this table
        seats available - the number of seats still available at this table
        name - name (identifier) of this table
        services:
        add person - adds a person to this table (changes the average age and seats available)
        average age - return the average age of the people currently seated at this table
        seating chart - display the table’s name then the people seated at the table
        lookup person - isagiv en person sitting at this table
        space for - given a need, check if there are at least that many seats available
        is empty - true iff the table is empty*/