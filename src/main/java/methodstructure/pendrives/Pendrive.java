package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent) {
        this.price += (percent / 100) * this.price;
    }

    private double getPricePerCapacity() {
        return (double) price / capacity;
    }

    public int comparePricePerCapacity (Pendrive other) {
        double pricePerCapacity = getPricePerCapacity();
        double otherPpc = other.getPricePerCapacity();
        if (pricePerCapacity > otherPpc) {
            return 1;
        }
        else if (pricePerCapacity < otherPpc) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return this.price > other.price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}