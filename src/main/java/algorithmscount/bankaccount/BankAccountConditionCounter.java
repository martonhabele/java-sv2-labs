package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> accounts, int minBalance) {
        int count = 0;
        for (BankAccount currentAccount : accounts) {
            if (minBalance < currentAccount.getBalance()) {
                count++;
            }
        }
        return count;
    }
}