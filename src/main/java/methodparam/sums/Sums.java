package methodparam.sums;

public class Sums {
    private double positiveSums;
    private double negativeSums;

    public Sums(double positiveSums, double negativeSums) {
        this.positiveSums = positiveSums;
        this.negativeSums = negativeSums;
    }

    public double getPositiveSums() {
        return positiveSums;
    }

    public double getNegativeSums() {
        return negativeSums;
    }
}