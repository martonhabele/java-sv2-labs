package sorting;

public class Car {
    private String brand;
    private int yearOfManufacture;
    private int price;

    public Car(String brand, int yearOfManufacture, int price) {
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }
}