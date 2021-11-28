package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void testMakeTransaction() {
        Transaction transaction = new Transaction("1-3-6-9", TransactionOperation.CREDIT, 5000);
        assertEquals("1-3-6-9", transaction.getAccountNumber());
        assertEquals(TransactionOperation.CREDIT, transaction.getTransactionOperation());
        assertTrue(transaction.isCredit());
    }
}