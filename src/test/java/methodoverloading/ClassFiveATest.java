package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {
    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void testReferringPupilToday() {
        assertEquals("John", classFiveA.getTodayTestedPupil(2));
    }

    @Test
    void testTheSameWithEnumParameter() {
        assertEquals("Mary", classFiveA.getTodayTestedPupil(Number.FOUR));
    }

    @Test
    void testWithStringParameter() {
        assertEquals("Dave", classFiveA.getTodayTestedPupil("six"));
    }
}