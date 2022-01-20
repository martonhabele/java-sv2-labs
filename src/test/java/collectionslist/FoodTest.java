package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {
    @Test
    void initFood() {
        Food food = new Food("Bread", LocalDate.of(2021, 2, 20));
        assertEquals("Bread", food.getName());
        assertEquals(LocalDate.of(2021, 2, 20), food.getExpirationDate());
    }
}