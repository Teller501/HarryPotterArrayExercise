import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LoopMetoder loopMetoder = new LoopMetoder();

        Person harry = new Person("Harry", "Potter");
        Person ron = new Person("Ron", "Weasley");
        Person hermione = new Person("Hermione", "Granger");
        Person ginny = new Person("Ginny", "Weasley");
        Person draco = new Person("Draco", "Malfoy");
        Person neville = new Person("Neville", "Longbottom");

        harry.addPoints(100);
        ron.addPoints(231);
        hermione.addPoints(420);
        ginny.addPoints(1000);
        draco.addPoints(215);
        neville.addPoints(7);

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(hermione);

        Person[] personer = new Person[5]; //Array of Person objects
        personer[0] = harry;
        personer[2] = ron;
        personer[3] = hermione;
        personer[1] = ginny;
        personer[4] = draco;
        personer[4] = neville;

        System.out.println(Arrays.toString(personer));

        // Enhanched for-loop
        for (Person person : personer){
            System.out.println(person);
        }

        int totalPoints = loopMetoder.calculateTotalPoints(personer);

        System.out.println("Det samlede antal point: " + totalPoints);

        Person minPerson = loopMetoder.findMinimum(personer);
        System.out.println(minPerson.getFirstName() + " " + minPerson.getLastName() + " har mindst point med hele "
                + minPerson.getPoint() + " point");

        Person maxPerson = loopMetoder.findMaximum(personer);
        System.out.println(maxPerson.getFirstName() + " " + maxPerson.getLastName() + " har flest point med hele "
                + maxPerson.getPoint() + " point");

        int average = loopMetoder.calculateAverage(personer);
        System.out.println("Gennemsnits point: " + average);

        Person firstNameResult = loopMetoder.findByFirstName(personer, "ron");
        System.out.println(firstNameResult.getFirstName() + " " + firstNameResult.getLastName());

        Person lastNameResult = loopMetoder.findByLastName(personer, "granger");
        System.out.println(lastNameResult.getFirstName() + " " + lastNameResult.getLastName());
    }
}
