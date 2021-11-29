package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @Test
    void testIsPrime() {
        Prime prime = new Prime();
        assertFalse(prime.isPrime(0));
        assertTrue(prime.isPrime(11));
    }
}