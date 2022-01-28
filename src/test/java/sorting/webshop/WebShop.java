package sorting.webshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProductsSortedByName() {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return sorted;
    }

    public List<Product> getProductsSortedByPrice() {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return sorted;
    }

    public List<Product> getProductsSortedByOrderDate() {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return sorted;
    }

    public void addProducts(Product... product) {
        products.addAll(Arrays.asList(product));
    }
}