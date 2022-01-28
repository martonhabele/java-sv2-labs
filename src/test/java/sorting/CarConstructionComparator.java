package sorting;

import java.util.Comparator;

public class CarConstructionComparator implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        return Integer.valueOf(a.getYearOfManufacture()).compareTo(b.getYearOfManufacture());
    }
}