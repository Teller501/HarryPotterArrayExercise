import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoopMetoder {

    public int calculateTotalPoints(ArrayList<Person> personer){
        int totalPoint = 0;
        for (Person person : personer){
            totalPoint += person.getPoint();
        }
        return totalPoint;
    }

    public Person findMinimum(ArrayList<Person> personer){
        Person minPerson = personer.get(0);

        for (Person person : personer){
            if (person.getPoint() < minPerson.getPoint()){
                minPerson = person;
            }
        }
        return minPerson;
    }

    public Person findMaximum(ArrayList<Person> personer){
        Person maxPerson = personer.get(0);

        for (Person person : personer){
            if (person.getPoint() > maxPerson.getPoint()){
                maxPerson = person;
            }
        }
        return maxPerson;
    }

    public int calculateAverage(ArrayList<Person> personer){
        int total = calculateTotalPoints(personer);
        int avereage = total / personer.size();

        return avereage;
    }

    public Person findByFirstName(ArrayList<Person> personer, String searchTerm){
        Person foundPerson = null;
        for (Person person : personer){
            if (searchTerm.toLowerCase().contains(person.getFirstName().toLowerCase())){
                foundPerson = person;
            }
        }
        return foundPerson;
    }

    public Person findByLastName(ArrayList<Person> personer, String searchTerm){
        Person foundPerson = null;
        for (Person person : personer){
            if (searchTerm.toLowerCase().contains(person.getLastName().toLowerCase())){
                foundPerson = person;
            }
        }
        return foundPerson;
    }

    public Person findByName(ArrayList<Person> personer, String searchTerm){
        Person foundPerson = null;
        for (Person person : personer){
            if (searchTerm.toLowerCase().contains(person.getFirstName().toLowerCase() + " " + person.getLastName().toLowerCase())){
                foundPerson = person;
            }
        }
        return foundPerson;
    }
}
