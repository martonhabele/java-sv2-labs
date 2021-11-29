package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {
    @Test
    void testWordBeginWith() {
        Prefix prefix = new Prefix();
        List<String> words = Arrays.asList("király", "kislány", "kirág", "kikerics", "valami");
        List<String> expected = prefix.getWordsStartWith(words, "ki");

        assertEquals(4, expected.size());
        assertFalse(expected.contains("valami"));
    }
}