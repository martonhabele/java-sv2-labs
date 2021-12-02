package immutable;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarTest {
    @Test
    void testConstructorMethod() {
        Car car = new Car("VW", "Arteon", 2020);
        assertEquals("VW", car.getBrand());
        assertEquals(2020, car.getYearOfManufactured());
    }

    @Test
    void testWithBlankName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Car("", "Arteon", 2020));
        assertEquals("Brand cannot be empty!", exception.getMessage());
    }

    @Test
    void testVithNullValue() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Car(null, "X", 2020));
        assertEquals("Year of manufactured should be a valid year!", exception.getMessage());
    }
}