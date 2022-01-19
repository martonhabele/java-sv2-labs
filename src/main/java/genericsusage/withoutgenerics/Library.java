package genericsusage.withoutgenerics;

import genericsusage.Book;
import java.util.List;

public class Library {
    public Book getFirstBook(List books) {
        if (books == null) {
            throw new NullPointerException("This should not ne null!");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("This should not be empty");
        }
        Object object = books.get(0);
        if (!(object instanceof Book)) {
            throw new ClassCastException("Not a book!");
        }
        return (Book) object;
    }
}