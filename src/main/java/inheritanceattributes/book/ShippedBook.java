package inheritanceattributes.book;

public class ShippedBook extends Book {
    int shippingCost;   //visibility modifier has been willfully omitted

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {
        return pieces * price + shippingCost;
    }

    @Override
    public String toString() {
        return getTitle() + ": " + price + "Ft, postaköltség: " + shippingCost;
    }
}