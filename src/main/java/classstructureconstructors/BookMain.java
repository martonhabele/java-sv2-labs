package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author's name and press Enter, then the title and press Enter again:");
        Book book = new Book(scanner.nextLine(), scanner.nextLine());
        System.out.println("Book for registration: " + book.getAuthor() + " - " + book.getTitle());

        System.out.print("Set regnumber for the book: ");
        book.setRegNumber(scanner.nextLine());

        System.out.println("Regnumber for " + book.getAuthor() + " - " + book.getTitle() + " is " + book.getRegNumber());
    }
}
