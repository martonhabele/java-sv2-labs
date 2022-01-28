package sorting;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {
    @Test
    void testHighestIncome() {
        int[] incomes = new int[]{4, 6, 2, 1, 9, 3, 2};
        assertEquals(9, new Income(incomes).getHighestIncome());
    }
}