package statemachine.typewriter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {
    @Test
    void testCapsLockError() {
        assertEquals(TypeWriterState.LOWERCASE, TypeWriterState.UPPERCASE.next());
        assertEquals(TypeWriterState.UPPERCASE, TypeWriterState.LOWERCASE.next());
    }
}