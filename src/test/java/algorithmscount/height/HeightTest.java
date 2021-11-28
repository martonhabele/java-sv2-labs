package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {
    @Test
    void testChildsWithHeightGT() {
        List<Integer> heights = Arrays.asList(120, 140, 130, 180, 150);
        Height height = new Height();
        assertEquals(2, height.countChildrenWithHeightGreaterThan(heights, 140));
    }
}