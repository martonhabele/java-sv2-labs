package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {
    @Test
    void testLetterWithAccent() {
        assertEquals('o', new WithoutAccents().cutAccents('ő'));
        assertEquals('I', new WithoutAccents().cutAccents('Í'));
    }

    @Test
    void testLetterWithoutAccent() {
        assertEquals('o', new WithoutAccents().cutAccents('o'));
        assertEquals('A', new WithoutAccents().cutAccents('A'));
    }
}