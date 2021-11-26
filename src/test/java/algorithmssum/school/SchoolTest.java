package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testGetNumberOfStudents() {
        School school = new School();
        List<Integer> headcounts = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(21, school.getNumberOfStudents(headcounts));
    }
}