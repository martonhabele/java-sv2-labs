package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {
    @Test
    void testGetTheEldestTrainer() {
        List<Trainer> trainers = Arrays.asList(new Trainer("Jack", 25),
                new Trainer("Lisa", 30),
                new Trainer("John", 35));
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        assertEquals("John", maxAgeCalculator.getTrainerWithMaxAge(trainers).getName());
        assertEquals(35, maxAgeCalculator.getTrainerWithMaxAge(trainers).getAge());
    }
}