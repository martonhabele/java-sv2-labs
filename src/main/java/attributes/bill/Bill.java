package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("Wood", 10, 2, 0.27d);

        System.out.println(billItem.calculateTotalPrice(billItem.getPrice(), billItem.getQuantity(), billItem.getVatPercent()));
    }
}