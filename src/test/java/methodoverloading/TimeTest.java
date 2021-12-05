package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    void initTime() {
        Time time = new Time(12, 34, 56);
        assertEquals(12, time.getHours());
        assertEquals(34, time.getMinutes());
        assertEquals(56, time.getSeconds());
    }

    @Test
    void testWithTimeParameter() {
        Time time = new Time(9, 45, 30);
        Time laterTime = new Time(9, 45, 31);
        assertFalse(time.isEqual(laterTime));
    }

    @Test
    void testLaterTime() {
        Time time = new Time(9, 45, 20);
        Time earlierTime = new Time(9, 44, 20);
        assertTrue(earlierTime.isEarlier(time));
    }
}