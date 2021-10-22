import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Group {

    protected List<Person> people;


    // add person- adds a person to the group-return true, just for testing currently!!
    public void addPerson(Person p) {

        people.add(p);

    }

    // compute the average age of the dataset

    public double averageAge() {

        double sum = 0;

        for (Person p : people){sum += p.age;}

        return sum / people.size();
    }

    // initialize group of people
    public Group() {
        this.people = new LinkedList<>();

    }

    public int size() {

        return people.size();
    }
    public String display(){
        ArrayList<String> l = new ArrayList<>();
        for(Person p : people){

            l.add(p.display());

        }
        return "AVERAGE: "+averageAge()+" CURRENT MEMBERS: "+l.toString();
    }
}



/* attributes:
people - the collection of people in the group
services:
add person - adds a person to the group
average age - compute the average age of the people in the group */