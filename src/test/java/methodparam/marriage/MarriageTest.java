package methodparam.marriage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {
    @Test
    void testMarriage() {
        Woman woman = new Woman("Jane Doe", new ArrayList<>(Arrays.asList(new RegisterDate(
                "DoB", LocalDate.of(1980, 01, 01)))));
        Man man = new Man("Jack Smith", new ArrayList<>(Arrays.asList(new RegisterDate(
                "DoB", LocalDate.of(1970, 01, 01)))));
        Marriage marriage = new Marriage();
        marriage.getMarried(woman, man);

        assertEquals("Jack Smith", man.getName());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(1).getDate());
        assertEquals(2, woman.getRegisterDates().size());
    }
}