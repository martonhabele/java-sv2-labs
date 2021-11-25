package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {
    Books books = new Books();

    @TempDir
    File tempFolder;

    @Test
    void testBookHandler() throws IOException {
        Path path = tempFolder.toPath().resolve("books.txt");
        books.handleBookList(path);
        List<String> compareStandard = Files.readAllLines(path);

        assertEquals("Molnár Ferenc: Pál utcai fiúk", compareStandard.get(1));
        assertEquals(4, compareStandard.size());
    }
}