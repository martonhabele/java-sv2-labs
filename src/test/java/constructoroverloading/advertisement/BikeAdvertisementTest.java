package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {
    @Test
    void testWithTwoParams() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("Bike", 1500);
        assertEquals("Bike", bikeAdvertisement.getDetails());
        assertNull(bikeAdvertisement.getBrand());
    }

    @Test
    void testWithMaxParams() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("Bike", 1500, Arrays.asList("x", "y"),
                "Csepel", "123");
        assertEquals(1500, bikeAdvertisement.getPrice());
        assertEquals("123", bikeAdvertisement.getSerialNo());
    }
}