package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {
    @Test
    void testCaseVowel() {
        assertEquals('b', new ToConsonant().transformToConsonants('a'));
        assertEquals('v', new ToConsonant().transformToConsonants('u'));
    }

    @Test
    void testCaseConsonant() {
        assertEquals('g', new ToConsonant().transformToConsonants('g'));
    }
}