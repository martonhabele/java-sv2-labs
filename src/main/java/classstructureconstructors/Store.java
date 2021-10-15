package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {          //constructor
        this.product = product;
        this.stock = 0;
    }

    public void store(int stock) {          //custom store method
        this.stock += stock;
    }

    public void dispatch(int stock) {       //custom dispatch method
        this.stock -= stock;
    }

    //getters and setters
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
