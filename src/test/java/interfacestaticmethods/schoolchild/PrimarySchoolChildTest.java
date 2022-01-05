package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {
    @Test
    void testLowerClassSchoolChild() {
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(7);
        assertEquals(LowerClassSchoolChild.class, primarySchoolChild.getClass());
    }

    @Test
    void testUpperClassSchoolChild() {
        PrimarySchoolChild primarySchoolChild = PrimarySchoolChild.of(12);
        assertEquals(UpperClassSchoolChild.class, primarySchoolChild.getClass());
    }

    @Test
    void testInvalidAge() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> PrimarySchoolChild.of(15));
        assertEquals("This age is not valid for primary school's pupil!", exception.getMessage());
    }
}