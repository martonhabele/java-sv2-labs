package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDealer {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCarsByManufactureDate() {
        List<Car> orderedList = new ArrayList<>(cars);
        Collections.sort(orderedList, new CarConstructionComparator());
        return orderedList;
    }

    public List<Car> getCarsByPrice() {
        List<Car> orderedList = new ArrayList<>(cars);
        Collections.sort(orderedList, new CarPriceComparator());
        return orderedList;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }
}