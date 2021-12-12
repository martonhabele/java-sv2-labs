package initializer;

public class Rate {
    private Currency currency;
    private double convFactor;

    public Rate(Currency currency, double convFactor) {
        this.currency = currency;
        this.convFactor = convFactor;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getConvFactor() {
        return convFactor;
    }
}