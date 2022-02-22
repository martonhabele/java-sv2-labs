package lambdacomparator.cloud;

public class CloudStorage implements Comparable<CloudStorage> {
    private static final int STANDARD_SIZE = 1000;
    private static final int STANDARD_PERIOD = 12;
    private String provider;
    private int space;
    private PayPeriod payPeriod;
    private double price;

    public CloudStorage(String provider, int space, PayPeriod payPeriod, double price) {
        this.provider = provider;
        this.space = space;
        this.payPeriod = payPeriod;
        this.price = price;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    @Override
    public int compareTo(CloudStorage o) {
        double currentValue = this.payPeriod != null ? this.price * STANDARD_PERIOD / this.payPeriod.getLength() /
                this.space * STANDARD_SIZE : 0;
        double otherValue = o.payPeriod != null ? o.price * STANDARD_PERIOD / o.payPeriod.getLength() / o.space *
                STANDARD_SIZE : 0;
        return Double.compare(currentValue, otherValue);
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public PayPeriod getPayPeriod() {
        return payPeriod;
    }

    public double getPrice() {
        return price;
    }
}