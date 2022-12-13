public class LoopMetoder {

    public int calculateTotalPoints(Person[] personer){
        int totalPoint = 0;
        for (Person person : personer){
            totalPoint += person.getPoint();
        }
        return totalPoint;
    }

    public Person findMinimum(Person[] personer){
        Person minPerson = personer[0];

        for (Person person : personer){
            if (person.getPoint() < minPerson.getPoint()){
                minPerson = person;
            }
        }
        return minPerson;
    }
}
