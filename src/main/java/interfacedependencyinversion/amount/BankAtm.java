package interfacedependencyinversion.amount;

public class BankAtm implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        int thousandValue = amount / 1000;
        return 1000 * (thousandValue + 1);
    }
}