import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
    }
}
