package lambdaintro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void init() {
        Car car = new Car("Ford", "Mondeo", 4_200_000, 5.44);

        assertEquals("Ford", car.getBrand());
        assertEquals("Mondeo", car.getType());
        assertEquals(4_200_000, car.getPrice());
        assertEquals(5.44, car.getLength());
    }
}