public class Person {
    String firstName;
    String lastName;
    int point;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.point = 0;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getPoint() {
        return point;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void addPoints(int point){
        this.point += point;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " har " + point + " point";
    }
}
