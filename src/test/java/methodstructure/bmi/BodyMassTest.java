package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {
    @Test
    void testBmi() {
        BodyMass bodyMass = new BodyMass(95d, 1.83d);
        double expectedBmi = 95d / Math.pow(1.83d, 2);
        assertEquals(expectedBmi, bodyMass.getBmi());
    }

    @Test
    void testGetBodyType() {
        BodyMass bodyMass = new BodyMass(95d, 1.83d);
        assertEquals(BmiCategory.OVERWEIGHT, bodyMass.getBody());
    }

    @Test
    void testIsThinnerThanOther() {
        BodyMass bodyMass = new BodyMass(95d, 1.83d);
        BodyMass bodyMass1 = new BodyMass(94d, 1.83d);
        assertTrue(bodyMass1.isThinnerThan(bodyMass));
    }
}