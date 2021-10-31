package finalmodifier;

public class CircleCalculator {
    public static final double PI = 3.14d;

    public double calculatePerimeter(double r) {
        return 2 * r * PI;
    }

    public double calculateArea(double r) {
        return 2 * r * r * PI;
    }
}