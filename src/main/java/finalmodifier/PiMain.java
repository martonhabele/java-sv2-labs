package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        System.out.println(CircleCalculator.PI);

        System.out.println(new CircleCalculator().calculatePerimeter(5d));
        System.out.println(new CircleCalculator().calculateArea(5d));

        System.out.println(new CylinderCalculatorBasedOnCircle().calculateSurfaceArea(5d, 10d));
        System.out.println(new CylinderCalculatorBasedOnCircle().calculateVolume(5d, 10d));
    }
}