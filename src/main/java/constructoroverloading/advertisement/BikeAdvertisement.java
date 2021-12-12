package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {
    private String details;
    private int price;
    private List<String> extras;
    private String brand;
    private String serialNo;

    public BikeAdvertisement(String details, int price) {
        this.details = details;
        this.price = price;
    }

    public BikeAdvertisement(String details, int price, String brand) {
        this(details, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String details, int price, List<String> extras, String brand) {
        this(details, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String details, int price, List<String> extras, String brand, String serialNo) {
        this(details, price, extras, brand);
        this.serialNo = serialNo;
    }

    public String getDetails() {
        return details;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNo() {
        return serialNo;
    }
}