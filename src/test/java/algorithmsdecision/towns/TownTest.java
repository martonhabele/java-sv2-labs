package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {
    @Test
    void testLeastPopulatedTown() {
        Town town =new Town();
        List<Integer> habitants = Arrays.asList(50, 100, 500, 10000);
        assertFalse(town.containsFewerHabitants(habitants, 50));
        assertTrue(town.containsFewerHabitants(habitants, 10000));
    }
}