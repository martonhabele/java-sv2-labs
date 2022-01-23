package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {
    @Test
    void testRemoveExpensivePresent() {
        List<ChristmasPresent> presents = new ArrayList<>();
        presents.add(new ChristmasPresent("book", "Jim", 25));
        presents.add(new ChristmasPresent("fishing rod", "Joe", 35));
        presents.add(new ChristmasPresent("car", "Jack", 12500));

        ChristmasShopping christmasShopping = new ChristmasShopping(presents);
        christmasShopping.removeTooExpensivePresent(35);
        assertEquals(2, presents.size());
        assertEquals("book", presents.get(0).getPresentDescription());
    }
}