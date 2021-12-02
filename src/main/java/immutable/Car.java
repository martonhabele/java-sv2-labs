package immutable;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private final int yearOfManufactured;

    public Car(String brand, String model, int yearOfManufactured) {
        if (brand.isBlank() || brand == null) {
            throw new IllegalArgumentException("Brand cannot be empty!");
        }
        if (yearOfManufactured > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of manufactured should be a valid year!");
        }

        this.brand = brand;
        this.model = model;
        this.yearOfManufactured = yearOfManufactured;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufactured() {
        return yearOfManufactured;
    }
}