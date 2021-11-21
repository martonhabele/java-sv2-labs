package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TankTest {
    Tank tank = new Tank();

    @Test
    void testModifyAngleInvalid() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(90));
        assertEquals("Turret cannot reach this position!", iae.getMessage());
    }
}