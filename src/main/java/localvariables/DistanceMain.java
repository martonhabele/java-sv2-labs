package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(2.4, true);

        System.out.println("Distance is: " + distance.distanceInKm + " and it is " + distance.isExact());

        int roundedValue = (int) distance.getDistanceInKm();
        System.out.println("And can be rounded to: " + roundedValue);
    }
}