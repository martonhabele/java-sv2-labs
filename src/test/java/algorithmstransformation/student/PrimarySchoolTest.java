package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {
    PrimarySchool primarySchool;

    @BeforeEach
    void init() {
        List<Person> personList = Arrays.asList(new Person("Töhötöm", 13, "Budapest"),
                new Person("Jeremiás", 10, "Cegléd"),
                        new Person("Valaki", 30, "Győr"));
        primarySchool = new PrimarySchool(personList);
    }

    @Test
    void testGetStudents() {
        assertEquals(2, primarySchool.getStudents().size());
    }
}