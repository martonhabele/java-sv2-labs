package methodstructure.bmi;

public class BodyMass {
    private double weight;  //in kgs
    private double height;  //in meters
    public static final double MINIMUM_LIMIT = 18.5d;
    public static final double MAXIMUM_LIMIT = 25.0d;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getBmi() {
        return weight / Math.pow(height, 2);
    }

    public BmiCategory getBody() {
        double bmi = getBmi();
        if (bmi < MINIMUM_LIMIT) {
            return BmiCategory.UNDERWEIGHT;
        }
        else if (bmi > MAXIMUM_LIMIT) {
            return BmiCategory.OVERWEIGHT;
        }
        else return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass other) {
        return getBmi() < other.getBmi();
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}