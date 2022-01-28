package sorting.webshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebShopTest {
    WebShop webShop = new WebShop();

    @BeforeEach
    void init() {
        webShop.addProducts(new Product("Alma", 5,
                LocalDateTime.of(2022, 1, 1, 0, 0, 1)));
        webShop.addProducts(new Product("Körte", 15,
                LocalDateTime.of(2021, 1, 1, 10, 0, 0)));
        webShop.addProducts(new Product("Cseresznye", 50,
                LocalDateTime.of(2020, 1, 10, 20, 0, 1)));
    }

    @Test
    void testSortByName() {
        assertEquals(Arrays.asList("Alma", "Cseresznye", "Körte"), items(webShop.getProductsSortedByName()));
    }

    @Test
    void testSortByPrice() {
        assertEquals(Arrays.asList("Alma", "Körte", "Cseresznye"), items(webShop.getProductsSortedByPrice()));
    }

    @Test
    void testSortByDate() {
        assertEquals(Arrays.asList("Cseresznye", "Körte", "Alma"), items(webShop.getProductsSortedByOrderDate()));
    }

    private List<String> items(List<Product> products) {
        List<String> items = new ArrayList<>();
        for (Product product : products) {
            items.add(product.getName());
        }
        return items;
    }
}