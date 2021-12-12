package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {
    @Test
    void testValidDate() {
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(2010, 01, 02);
        assertEquals(2010, simpleDate.getYear());
        assertEquals(01, simpleDate.getMonth());
        assertEquals(02, simpleDate.getDay());
    }

    @Test
    void testWithInvalidYear() {
        SimpleDate simpleDate = new SimpleDate();
        assertThrows(IllegalArgumentException.class, () -> simpleDate.setDate(1899, 01, 01));
    }

    @Test
    void testWithInvalidDay() {
        SimpleDate simpleDate = new SimpleDate();
        assertThrows(IllegalArgumentException.class, () -> simpleDate.setDate(2000, 01, 32));
    }

    @Test
    void testLeapYear() {
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(2016, 02, 29);
        assertEquals(29, simpleDate.getDay());
    }
}