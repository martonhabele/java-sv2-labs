package genericsusage.withoutgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testNullException() {
        Exception exception = assertThrows(NullPointerException.class, () -> new Library().getFirstBook(null));
        assertEquals("This should not ne null!", exception.getMessage());
    }

    @Test
    void testWithoutArgument() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Library().getFirstBook(new ArrayList<>()));
        assertEquals("This should not be empty", exception.getMessage());
    }

    @Test
    void testGetFirstBook() {
        assertEquals("xyz", new Library().getFirstBook(Arrays.asList(new Book("xyz"))).getTitle());
    }
}