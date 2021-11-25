package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> birthdays = new ArrayList<>();
        Path path = Paths.get("src/main/java/introexceptionwritefile/resources/birthdays.txt");
        int entries = 0;
        String name;
        String birthday;

        System.out.print("Number of birthdays you want to add: ");
        try {
            entries = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("You have to enter a valid number!", nfe);
        }

        for (int i = 0; i < entries; i++) {
            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.println("Birthday: ");
            birthday = scanner.nextLine();
            birthdays.add(name + ", " + birthday);
        }

        try {
            Files.write(path, birthdays);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot write file!", ioe);
        }
    }
}