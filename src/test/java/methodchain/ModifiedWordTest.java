package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {
    ModifiedWord modifiedWord = new ModifiedWord();

    @Test
    void testModifyWord() {
        String newWord = modifiedWord.modify("Alma");
        assertEquals("AxMy", newWord);
    }
}