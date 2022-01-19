package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {
    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException("This shouldn't be null!");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("This shouldn't be empty!");
        }
        return books.get(0);
    }
}