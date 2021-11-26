package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void testSumSalesAmount() {
        SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();

        List<Salesperson> salespeople = Arrays.asList(new Salesperson("Joe", 100),
                new Salesperson("John", 200),
                new Salesperson("Jane", 300));

        assertEquals(600, salesAmountSumCalculator.sumSalesAmount(salespeople));
    }
}