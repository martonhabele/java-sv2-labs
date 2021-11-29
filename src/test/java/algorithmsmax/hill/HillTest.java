package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {
    @Test
    void testGetMax() {
        List<Integer> hillTops = Arrays.asList(1014, 2995, 3011, 8848);
        Hill hill = new Hill();
        assertEquals(8848, hill.getMax(hillTops));
    }
}