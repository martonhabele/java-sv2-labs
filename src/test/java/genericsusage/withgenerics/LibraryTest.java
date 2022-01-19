package genericsusage.withgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testNullException() {
        Exception exception = assertThrows(NullPointerException.class, () -> new Library().getFirstBook(null));
        assertEquals("This shouldn't be null!", exception.getMessage());
    }

    @Test
    void testIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Library().getFirstBook(Collections.emptyList()));
        assertEquals("This shouldn't be empty!", exception.getMessage());
    }

    @Test
    void testFirstBook() {
        assertEquals("Szövettan", new Library().
                getFirstBook(Arrays.asList(new Book("Szövettan"))).getTitle());
    }
}