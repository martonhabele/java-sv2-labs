package objectclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {
    @Test
    void testCreate() {
        SimpleBag simpleBag = new SimpleBag();
        assertTrue(simpleBag.isEmpty());
        assertEquals(0, simpleBag.size());
    }

    @Test
    void testPut() {
        SimpleBag simpleBag = new SimpleBag();
        simpleBag.putItem("alma");
        simpleBag.putItem(new Book("Rejtő Jenő", "A megkerült cirkáló"));
        simpleBag.putItem(new Beer("Carlsberg", 450));
        assertFalse(simpleBag.isEmpty());
        assertEquals(3, simpleBag.size());
        assertTrue(simpleBag.contains("alma"));
        Book book = new Book("Rejtő Jenő", "Piszkos Fred, a kapitány");
        simpleBag.putItem(book);
        assertTrue(simpleBag.contains(book));
    }
}