package defaultconstructor.date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {
    SimpleDate simpleDate;

    @BeforeEach
    void init() {
        simpleDate = new SimpleDate();
        simpleDate.setDate(1997, 9, 24);
    }

    @AfterEach
    void nullify() {
        simpleDate = null;
    }

    @Test
    void testDateWithHUCode() {
        assertEquals("1997-9-24", new SimpleDateFormatter()
                .formatDateStringByCountryCode(CountryCode.HU, simpleDate));
    }

    @Test
    void testDateWithUSCode() {
        assertEquals("9-24-1997", new SimpleDateFormatter()
                .formatDateStringByCountryCode(CountryCode.US, simpleDate));
    }

    @Test
    void testDateWithENCode() {
        assertEquals("24-9-1997", new SimpleDateFormatter()
                .formatDateStringByCountryCode(CountryCode.EN, simpleDate));
    }
}