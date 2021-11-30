package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {
    TwoLetters twoLetters = new TwoLetters();

    @Test
    void testGetFirstTwoLetters() {
        List<String> testWords = Arrays.asList("Emlékszel", "még", "amikor", "elég", "volt", "egy", "psvm");
        List<String> expectedWords = Arrays.asList("Em", "mé", "am", "el", "vo", "eg", "ps");
        assertEquals(expectedWords, twoLetters.getFirstTwoLetters(testWords));
    }
}