package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PayableTest {
    @Test
    void testCash() {
        Payable payable = new Cash();
        assertEquals(55, payable.getPayableAmount(56));
        assertEquals(50, payable.getPayableAmount(52));
        assertEquals(60, payable.getPayableAmount(58));
    }

    @Test
    void testAmount() {
        Payable payable = new Amount();
        assertEquals(15, payable.getPayableAmount(15));
    }

    @Test
    void testBankAtm() {
        Payable payable = new BankAtm();
        assertEquals(1000, payable.getPayableAmount(100));
    }
}