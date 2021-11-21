package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        try {
            List<String> items = Files.readAllLines(Paths.get("src/main/java/introexceptionreadfile/resources/holiday.txt"));
            System.out.println(items);
        } catch (IOException ioe) {
            System.out.println("File cannot be read!");
            ioe.printStackTrace();
        }
    }
}