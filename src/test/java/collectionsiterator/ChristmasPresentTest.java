package collectionsiterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChristmasPresentTest {
    @Test
    void testCreate() {
        ChristmasPresent christmasPresent = new ChristmasPresent("book", "Jim", 25);
        assertEquals("book", christmasPresent.getPresentDescription());
        assertEquals("Jim", christmasPresent.getChosenName());
        assertEquals(25, christmasPresent.getPrice());
    }
}