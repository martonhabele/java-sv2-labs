package algorithmsdecision.bankaccounts;

import classstructureintegrate.Bank;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {
    List<BankAccount> accounts = Arrays.asList(new BankAccount("Jack", "111", 1000),
            new BankAccount("John", "222", 1500),
            new BankAccount("Jane", "333", 2000));

    @Test
    void testBiggerBalance() {
        BankAccountDecisionMaker bankAccountDecisionMaker = new BankAccountDecisionMaker();
        assertTrue(bankAccountDecisionMaker.containsBalanceGreaterThan(accounts, 1500));
        assertFalse(bankAccountDecisionMaker.containsBalanceGreaterThan(accounts, 2000));
    }
}