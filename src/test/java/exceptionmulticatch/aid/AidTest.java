package exceptionmulticatch.aid;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AidTest {
    Aid aid = new Aid(1_489_600);

    @Test
    void testAmountCounting() {
        List<String> expected = Arrays.asList("Budapest: 1489600", "Kukutyin: 53200",
                "Kiskunalsófelső: 2800"
        );
        assertEquals(expected, aid.countAmountsOfAid(Paths.get("src/main/java/exceptionmulticatch/aid/population1.txt")));
    }

    @Test
    void testWithBadFileName() {
        Exception exception = assertThrows(IllegalStateException.class, () -> aid.countAmountsOfAid(Paths.get("nope")));
        assertEquals("Something went wrong!", exception.getMessage());
        assertEquals(NoSuchFileException.class, exception.getCause().getClass());
    }

    @Test
    void testWithNullParams() {
        Exception exception = assertThrows(IllegalStateException.class, () -> aid.countAmountsOfAid(null));
        assertEquals("Something went wrong!", exception.getMessage());
        assertEquals(NullPointerException.class, exception.getCause().getClass());
    }

    @Test
    void testWithInvalidLine() {
        Exception exception = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/main/java/exceptionmulticatch/aid/population2.txt")));
        assertEquals("Something went wrong!", exception.getMessage());
        assertEquals(ArrayIndexOutOfBoundsException.class, exception.getCause().getClass());
    }

    @Test
    void testInvalidNumber() {
        Exception exception = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/main/java/exceptionmulticatch/aid/population3.txt")));
        assertEquals("Something went wrong!", exception.getMessage());
        assertEquals(NumberFormatException.class, exception.getCause().getClass());
    }
    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/main/java/exceptionmulticatch/aid/population4.txt")));
        assertEquals("Something went wrong!", exception.getMessage());
        assertEquals(ArithmeticException.class, exception.getCause().getClass());
    }
}