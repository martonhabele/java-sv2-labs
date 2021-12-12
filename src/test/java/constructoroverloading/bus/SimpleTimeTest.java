package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {
    @Test
    void testConstWithOneParam() {
        SimpleTime simpleTime = new SimpleTime(14);
        assertEquals(14, simpleTime.getHours());
        assertEquals(0, simpleTime.getMinutes());
    }

    @Test
    void testConstWithTwoParams() {
        SimpleTime simpleTime = new SimpleTime(10, 20);
        assertEquals(10, simpleTime.getHours());
        assertEquals(20, simpleTime.getMinutes());
    }

    @Test
    void testTimeDiffs() {
        SimpleTime simpleTime = new SimpleTime(10, 20);
        SimpleTime simpleTime1 = new SimpleTime(11, 40);
        assertEquals(-80, simpleTime.getDifference(simpleTime1));
    }
}