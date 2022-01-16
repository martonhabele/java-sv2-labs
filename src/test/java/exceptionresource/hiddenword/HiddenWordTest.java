package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {
    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void testGetHiddenWord() {
        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(Paths.get("src/main/java/exceptionresource/hiddenword/hiddenword.txt")));
    }

    @Test
    void testGetHiddenWordWithNotExistingFile() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> hiddenWord.getHiddenWord(Paths.get("src/main/java/exceptionresource/hiddenword/hiddenword.dat")));
        assertEquals("Can not read file", ex.getMessage());
    }
}