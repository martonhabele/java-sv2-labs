package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CarDealerTest {
    CarDealer carDealer;

    @BeforeEach
    void init() {
        carDealer = new CarDealer();
        carDealer.addCar(new Car("Mazda", 2010, 7000));
        carDealer.addCar(new Car("Ford", 1999, 300));
        carDealer.addCar(new Car("BMW", 2017, 9000));
        carDealer.addCar(new Car("VW", 2019, 7500));
    }

    @Test
    void testResultOrderedByYearOfManufacture() {
        List<Car> expected = carDealer.getCarsByManufactureDate();
        assertEquals(2019, expected.get(3).getYearOfManufacture());
        assertEquals(2010, expected.get(1).getYearOfManufacture());
    }

    @Test
    void testResultOrderedByPrice() {
        List<Car> expected = carDealer.getCarsByPrice();
        assertEquals(300, expected.get(0).getPrice());
        assertEquals(7500, expected.get(2).getPrice());
    }
}