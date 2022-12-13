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

    public Person findMaximum(Person[] personer){
        Person maxPerson = personer[0];

        for (Person person : personer){
            if (person.getPoint() > maxPerson.getPoint()){
                maxPerson = person;
            }
        }
        return maxPerson;
    }

    public int calculateAverage(Person[] personer){
        int total = calculateTotalPoints(personer);
        int avereage = total / personer.length;

        return avereage;
    }
}
