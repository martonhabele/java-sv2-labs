package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    Ship ship;

    @BeforeEach
    void initShip() {
        ship = new Ship("Northern Star", 1979, 120);
    }

    @Test
    void testName() {
        assertEquals("Northern Star", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1979, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1979);
        assertFalse(ship.getYearOfConstruction() == 1978);
    }

    @Test
    void testLength() {
        assertEquals(120, ship.getLength(), 0);
    }

    @Test
    void testNull() {
        Ship ship1 = new Ship(null, 1980, 100);
        assertNull(ship1.getName());
        assertNotNull(ship.getName());
    }

    @Test
    void testSameObjects() {
        Ship ship2 = ship;
        assertSame(ship, ship2);
    }

    @Test
    void testNotSameObjects() {
        Ship ship3 = new Ship("Northern Star", 1979, 120);
        assertNotSame(ship, ship3);
    }
}