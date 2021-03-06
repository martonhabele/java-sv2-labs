package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read {
    private List<Book> booksToRead = new ArrayList<>();

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return booksToRead.stream()
                .filter(book -> book.getNumberOfPages() < maxNumberOfPages)
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return booksToRead.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public List<String> listAuthors() {
        return booksToRead.stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }

    public void addBook(Book book) {
        booksToRead.add(book);
    }

    public List<Book> getBooksToRead() {
        return new ArrayList<>(booksToRead);
    }
}