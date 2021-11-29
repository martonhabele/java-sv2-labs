package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void testGetMin() {
        List<Integer> temperatures = Arrays.asList(0, 3, 19, 2, -3, 10, 10, 35);
        Temperature temperature = new Temperature();
        assertEquals(-3, temperature.getMin(temperatures));
    }
}