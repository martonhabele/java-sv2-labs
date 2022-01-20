package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {
    Postman postman;

    @BeforeEach
    void init() {
        postman = new Postman();
        postman.addAddress("qwe");
        postman.addAddress("rtz");
        postman.addAddress("asd");
        postman.addAddress("yxc");
    }

    @Test
    void testAddresses() {
        assertEquals(4, postman.getAddresses().size());
        assertEquals("rtz", postman.getAddresses().get(1));
        assertEquals("yxc", postman.getAddresses().get(3));
    }

    @Test
    void testRemoveOfAddresses() {
        postman.removeAddress("rtz");
        assertEquals(3, postman.getAddresses().size());
        assertEquals("asd", postman.getAddresses().get(1));
    }
}