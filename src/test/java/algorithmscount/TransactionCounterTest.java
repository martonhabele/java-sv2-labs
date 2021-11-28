package algorithmscount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {
    @Test
    void testCounter() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("111", TransactionType.CREDIT, 2000),
                new Transaction("111", TransactionType.CREDIT, 5000),
                new Transaction("111", TransactionType.CREDIT, 7000)
        );
        assertEquals(2, new TransactionCounter().countEntryBelow(transactions, 7000));
        assertEquals(1, new TransactionCounter().countEntryBelow(transactions, 5000));
    }
}