public class LoopMetoder {

    public int calculateTotalPoints(Person[] personer){
        int totalPoint = 0;
        for (Person person : personer){
            totalPoint += person.getPoint();
        }
        return totalPoint;
    }
}
