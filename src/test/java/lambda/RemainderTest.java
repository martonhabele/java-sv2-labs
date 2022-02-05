package lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {
    List<Integer> numbers;

    @BeforeEach
    void init() {
        numbers = Arrays.asList(5, 2, 6, 7, 11, 21, 3);
    }

    @Test
    void testDivideByTwo() {
        assertEquals(Arrays.asList(1, 0, 0, 1, 1, 1, 1), new Remainder().changeNumbersToRemainders(numbers, 2));
    }

    @Test
    void testDivideByThree() {
        assertEquals(Arrays.asList(2, 2, 0, 1, 2, 0, 0), new Remainder().changeNumbersToRemainders(numbers, 3));
    }
}