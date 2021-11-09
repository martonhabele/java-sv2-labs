package junit5;

import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class GentlemanTest {
    @Test
    void testCreate() {
        //Given
        Gentleman gentleman = new Gentleman(null);

        //When
        String name = gentleman.getName();

        //Then
        assertNull(name);
    }
}