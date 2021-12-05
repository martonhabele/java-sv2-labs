package staticattrmeth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {
    @Test
    void testZeroTransaction() {
        BankTransaction.initDay();
        assertEquals(0, BankTransaction.getSumOfTransactions());
        assertEquals(0, BankTransaction.getCurrentMinValue());
        assertEquals(0, BankTransaction.getCurrentMaxValue());
    }

    @Test
    void testOneTransaction() {
        BankTransaction.initDay();
        BankTransaction bankTransaction = new BankTransaction(5_000);
        assertEquals(5_000, bankTransaction.getTransactionValue());
        assertEquals(5_000, BankTransaction.getCurrentMinValue());
        assertEquals(5_000, BankTransaction.getCurrentMaxValue());
        assertEquals(5_000, BankTransaction.getAvgTransaction());
    }

    @Test
    void testMultipleTransactions() {
        BankTransaction.initDay();
        new BankTransaction(10_000);
        new BankTransaction(20_000);
        assertEquals(10_000, BankTransaction.getCurrentMinValue());
        assertEquals(20_000, BankTransaction.getCurrentMaxValue());
        assertEquals(15_000, BankTransaction.getAvgTransaction());
    }
}