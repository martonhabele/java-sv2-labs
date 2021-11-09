package junit5assert;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DragonTest {
    Dragon dragon = new Dragon("Süsü", 7, 5);

    @Test
    void testName() {
        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Béla", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        assertEquals(7, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 7);
        assertFalse(dragon.getNumberOfHeads() == 8);
    }

    @Test
    void testHeight() {
        assertEquals(7, dragon.getNumberOfHeads(), 0.1);
    }

    @Test
    void testNull() {
        Dragon dragon1 = new Dragon("Anyós", 11, 1);
        Dragon dragon2 = new Dragon(null, 2, 3);
        assertNotNull(dragon1.getName());
        assertNull(dragon2.getName());
    }

    @Test
    void testSameObjects() {
        Dragon dragon3 = new Dragon("WithoutCoffee", 12, 12);
        Dragon dragon4 = dragon3;
        assertSame(dragon3, dragon4);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon5 = new Dragon("NoIdeaAboutAnymoreName", 30, 30);
        Dragon dragon6 = new Dragon("NoIdeaAboutAnymoreName", 30, 30);
        assertNotSame(dragon5, dragon6);
    }
}