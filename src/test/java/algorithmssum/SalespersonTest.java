package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {
    @Test
    void testCreateSalesPerson() {
        Salesperson salesperson = new Salesperson("Teszt Elek", 500);
        assertEquals("Teszt Elek", salesperson.getName());
        assertEquals(500, salesperson.getAmount());
    }
}