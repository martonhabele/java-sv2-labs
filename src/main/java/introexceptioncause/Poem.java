package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        List<String> poem = new ArrayList<>();
        try {
            poem = Files.readAllLines(Paths.get("src/main/java/introexceptioncause/resources/poem.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
        for (String row : poem) {
            System.out.println(row.charAt(0));
        }
    }
}