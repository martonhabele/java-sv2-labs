package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {
    @Test
    void testForSpecialOffer() {
        Discount discount = Discount.SPECIAL_OFFER;
        assertEquals(240, discount.getAmountToPay(100, 3));
    }

    @Test
    void testForBlackFridayOffer() {
        Discount discount = Discount.BLACK_FRIDAY_OFFER;
        assertEquals(150, discount.getAmountToPay(100, 2));
        assertEquals(275, discount.getAmountToPay(100, 4));
    }
}