package finalmodifier;

public class CylinderCalculator {
    public double calculateVolume(double r, double h) {
        return CircleCalculator.PI * h * r * r;
    }

    public double surfaceCalculator(double r, double h) {
        return (CircleCalculator.PI * h * 2 * r) + (2 * r * r * CircleCalculator.PI);
    }
}