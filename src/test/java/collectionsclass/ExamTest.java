package collectionsclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {
    Exam exam;

    @BeforeEach
    void init() {
        List<ExamResult> results = new ArrayList<>();
        results.add(new ExamResult("Jack", 90));
        results.add(new ExamResult("John", 100));
        results.add(new ExamResult("Jane", 95));
        results.add(new ExamResult("Jill", 85));
        exam = new Exam(results);
    }

    @Test
    void testGetSucceededCandidates() {
        List<String> expected = exam.getNamesOfSucceededPeople(2);
        assertEquals(2, expected.size());
        assertEquals("John", expected.get(0));
        assertEquals("Jane", expected.get(1));
    }
}