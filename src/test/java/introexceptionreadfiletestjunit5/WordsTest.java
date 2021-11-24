package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    public Words words = new Words();

    @Test
    void testGetFirstWordWithA() {
    Path path = Paths.get("src/main/java/introexceptionreadfiletestjunit5/resources/words.txt");
        assertEquals("Anna", words.getFirstWordWithA(path));
    }

    @Test
    void testWithoutValidResources() {
        Path path = Paths.get("");
        IllegalStateException illegalStateException = assertThrows(IllegalStateException.class, () -> words.getFirstWordWithA(path));
        assertEquals("File cannot be read!", illegalStateException.getMessage());
    }
}