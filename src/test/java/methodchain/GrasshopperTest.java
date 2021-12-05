package methodchain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    @Test
    void testOneHop() {
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE);
        assertEquals(2, grasshopper.getPosition());
    }

    @Test
    void testFiveJumpToThree() {
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3, grasshopper.getPosition());
    }
}