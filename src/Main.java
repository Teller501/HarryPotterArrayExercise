public class Main {
    public static void main(String[] args) {
        Person harry = new Person("Harry", "Potter");
        Person ron = new Person("Ron", "Weasley");
        Person hermione = new Person("Hermione", "Granger");

        harry.addPoints(100);
        ron.addPoints(231);
        hermione.addPoints(420);

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(hermione);
    }
}
