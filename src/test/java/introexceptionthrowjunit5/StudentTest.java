package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    void testAddInvalidNote1() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> student.addNote(6));
        assertEquals("Invalid grade!", iae.getMessage());
    }

    @Test
    void testAddInvalidNote2() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> student.addNote(0));
        assertEquals("Invalid grade!", iae.getMessage());
    }

    @Test
    void testAddValidNote() {
        student.addNote(3);
        assertEquals(3, student.getNotes().get(0));
    }
}