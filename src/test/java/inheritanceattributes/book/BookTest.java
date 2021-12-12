package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void testCreate() {
        Book book = new Book("Emberiség Krónikája", 3500);
        assertEquals(3500, book.price);
        assertEquals("Emberiség Krónikája", book.getTitle());
    }

    @Test
    void testPurchase() {
        Book book = new Book("Rejtelmes Világ", 2800);
        assertEquals(5600, book.purchase(2));
    }
}