package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        try {
            List<String> listItems = Files.readAllLines(Paths.get("src/main/java/introexceptionreadfile/resources/shoppinglist.txt"));
            System.out.println(listItems);
        } catch (IOException ioe) {
            System.out.println("File cannot be read!");
        }
    }
}