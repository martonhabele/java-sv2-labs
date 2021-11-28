package algorithmscount;

import java.util.List;

public class TransactionCounter {
    public int countEntryBelow(List<Transaction> transactions, int maximumAmount) {
        int counter = 0;
        for (Transaction currentTransaction : transactions) {
            if (maximumAmount > currentTransaction.getAmount()) {
                counter++;
            }
        }
        return counter;
    }
}