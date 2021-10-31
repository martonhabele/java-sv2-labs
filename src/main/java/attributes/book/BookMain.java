package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Nyugaton a helyzet változatlan");

        System.out.println(book.getTitle());
    }
}