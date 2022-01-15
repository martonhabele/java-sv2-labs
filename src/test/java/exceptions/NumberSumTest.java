package exceptions;

import exceptions.sum.NumberSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSumTest {
    NumberSum numberSum = new NumberSum();

    @Test
    void testWithInts() {
        assertEquals(21, numberSum.getSum(new int[]{12, 9}));
    }

    @Test
    void testWithStrings() {
        assertEquals(21, numberSum.getSum(new String[]{"12", "9"}));
    }

    @Test
    void testNullParam() {
        int[] numbers = null;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> numberSum.getSum(numbers));
        assertEquals("Null is invalid!", exception.getMessage());
    }

    @Test
    void testStringSumWithNull() {
        String[] numbers = null;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> numberSum.getSum(numbers));
        assertEquals("Null is invalid!", exception.getMessage());
    }

    @Test
    void testInvalidValues() {
        String[] numbers = new String[]{"1", "w", "4"};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> numberSum.getSum(numbers));
        assertEquals("Invalid numbers!", exception.getMessage());
    }
}