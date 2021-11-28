package algorithmssum;

import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int summarizedCredit = 0;
        for (Transaction transaction : transactions) {
            if (transaction.isCredit()) {
                summarizedCredit += transaction.getAmount();
            }
        }
        return summarizedCredit;
    }
}