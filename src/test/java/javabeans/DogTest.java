package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    void testNameMethods() {
        final String name = "Eb";
        Dog dog = new Dog();
        dog.setName(name);
        assertEquals("Eb", dog.getName());
    }

    @Test
    void testPedigree() {
        Dog dog = new Dog();
        dog.setPedigree(true);
        assertTrue(dog.isPedigree());
    }

    @Test
    void testAge() {
        final int age = 5;
        Dog dog = new Dog();
        dog.setAge(age);
        assertEquals(age, dog.getAge());
    }

    @Test
    void testWeight() {
        final double weight = 22.5;
        Dog dog = new Dog();
        dog.setWeight(weight);
        assertEquals(weight, dog.getWeight());
    }
}