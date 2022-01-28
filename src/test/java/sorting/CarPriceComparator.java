package sorting;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        return Integer.valueOf(a.getPrice()).compareTo(b.getPrice());
    }
}