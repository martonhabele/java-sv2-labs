package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    void testForLongerWord() {
        Word word = new Word();
        List<String> words = Arrays.asList("valami", "semmi", "méginkábbvalami");
        assertTrue(word.containsLongerWord(words, "semmi"));
        assertFalse(word.containsLongerWord(words, "méginkábbvalami"));
    }
}