package finalmodifier;

public class TaxCalculator {
    public static final double TAX_RATE = 0.27d;

    public static void main(String[] args) {
        System.out.println(new TaxCalculator().tax(10_000d));
        System.out.println(new TaxCalculator().priceWithTax(10_000d));
    }

    public double tax(double price) {
        return price * TAX_RATE;
    }

    public double priceWithTax(double price) {
        return price * (1 + TAX_RATE);
    }
}