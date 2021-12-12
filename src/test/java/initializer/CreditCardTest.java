package initializer;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    final Rate[] rates = {new Rate(Currency.HUF, 1.0),
            new Rate(Currency.EUR, 308.23),
            new Rate(Currency.CHF, 289.24),
            new Rate(Currency.GBP, 362.23),
            new Rate(Currency.USD, 289.77)};

    @Test
    void testCreateWithThreeParameters() {
        CreditCard card = new CreditCard(1000, Currency.EUR, Arrays.asList(rates));
        assertEquals(1000, card.getBalance());
    }

    @Test
    void testCreateWithOneParameter() {
        CreditCard card = new CreditCard(100_000);
        assertEquals(100_000L, card.getBalance());
    }

    @Test
    void testPaymentWithTwoParametersSuccess() {
        CreditCard card = new CreditCard(100_000);
        assertTrue(card.payment(100, Currency.EUR));
        assertEquals(69177L, card.getBalance());
    }

    @Test
    void testPaymentWithTwoParametersFail() {
        CreditCard card = new CreditCard(100_000);
        assertFalse(card.payment(1000, Currency.EUR));
        assertEquals(100_000L, card.getBalance());
    }

    @Test
    void testPaymentWithOneParameterSuccess() {
        CreditCard card = new CreditCard(100_000);
        assertTrue(card.payment(10_000));
        assertEquals(90_000L, card.getBalance());
    }

    @Test
    void testPaymentWithOneParameterFail() {
        CreditCard card = new CreditCard(100_000);
        assertFalse(card.payment(150_000));
        assertEquals(100_000L, card.getBalance());
    }
}