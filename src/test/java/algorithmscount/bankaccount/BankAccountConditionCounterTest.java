package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {
    @Test
    void testCounterForBalanceCounter() {
        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("Béla", "111", 1000),
                new BankAccount("Géza", "222", 5000)
        );
        assertEquals(1, new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccounts, 2000));
        assertEquals(2, new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccounts, 500));
    }
}