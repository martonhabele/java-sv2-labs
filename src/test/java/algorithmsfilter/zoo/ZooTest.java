package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    Zoo zoo;

    @BeforeEach
    void init() {
        List<Animal> animals = Arrays.asList(new Animal("madár", 2),
                new Animal("majom", 2),
                new Animal("kecske", 4));
        zoo = new Zoo(animals);
    }

    @Test
    void animalLegsGiven() {
        assertEquals(2, zoo.getAnimalsWithNumberOfLegsGiven(2).size());
    }
}