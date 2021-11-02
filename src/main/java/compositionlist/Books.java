package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of books to store: ");
        int numOfBooks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfBooks; i++) {
            System.out.print("Number " + (i + 1) + " book's title: ");
            books.addBook(scanner.nextLine());
        }

        scanner.close();

        books.findBookAndSetAuthor("Európa", "Anonim");
        System.out.println(books.getTitles());
    }

    private List<String> titles = new ArrayList<>();

    public void addBook(String title) {
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        if (titles.contains(title)) {
            titles.set(titles.indexOf(title), author + ": " + titles.get(titles.indexOf(title)));
        }
    }

    public List<String> getTitles() {
        return titles;
    }
}