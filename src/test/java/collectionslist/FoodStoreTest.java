package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {
    @Test
    void testSellFirst() {
        FoodStore foodStore = new FoodStore();
        foodStore.addFood(new Food("Flour", LocalDate.of(2022, 2, 1)));
        foodStore.addFood(new Food("Bread", LocalDate.of(2022, 2, 5)));
        foodStore.addFood(new Food("Milk", LocalDate.now()));
        foodStore.sellFirst(new Food("Mushroom", LocalDate.now()));

        assertEquals(4, foodStore.getFoods().size());
        assertEquals("Mushroom", foodStore.getFoods().get(0).getName());
    }
}