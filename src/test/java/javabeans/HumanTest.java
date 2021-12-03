package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    @Test
    void testName() {
        final String name = "Teszt Béla";
        Human human = new Human();
        human.setName(name);
        assertEquals(name, human.getName());
    }

    @Test
    void testWeight() {
        final double weight = 55.5;
        Human human = new Human();
        human.setWeight(weight);
        assertEquals(weight, human.getWeight());
    }

    @Test
    void testIq() {
        final int iq = 135;
        Human human = new Human();
        human.setIq(iq);
        assertEquals(iq, human.getIq());
    }
}