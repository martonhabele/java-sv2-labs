package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> readBooks() {
        try {
            return Files.readAllLines(Paths.get("src/main/java/introexceptionwritefiletestjunit5/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be read!", ioe);
        }
    }

    public void handleBookList(Path path) {
        List<String> bookList = readBooks();
        List<String> formattedList = new ArrayList<>();
        for (String book : bookList) {
            String[] entry = book.split(";");
            formattedList.add(entry[2] + ": " + entry[1]);
        }
        writeListToFile(path, formattedList);
    }

    public void writeListToFile(Path path, List<String> formattedList) {
        try {
            Files.write(path, formattedList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Unable to write file!", ioe);
        }
    }
}