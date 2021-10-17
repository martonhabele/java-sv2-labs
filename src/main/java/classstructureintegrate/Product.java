package classstructureintegrate;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void increasePrice(int price) {
        this.price += price;
    }

    public void decreasePrice(int price) {
        this.price -= price;
    }

    //setter methods have been removed from the generated code
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
