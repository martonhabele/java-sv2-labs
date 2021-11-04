package operators;

public class HeadingNorth {
    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }

    public int getNumberOfNewDirections() {
        int counter = 0;
        int changeInDegrees = 0;

        for (int i = 10; changeInDegrees < 360; i += 10) {
            changeInDegrees += i;
            counter++;
        }
        return counter;
    }
}