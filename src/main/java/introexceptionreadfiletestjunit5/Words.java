package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    public List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be read!", ioe);
        }
    }

    public String getFirstWordWithA(Path path) {
        List<String> words = readFile(path);
        for (String word : words) {
            if (word.startsWith("A")) {
                return word;
            }
        }
        return "A";
    }
}