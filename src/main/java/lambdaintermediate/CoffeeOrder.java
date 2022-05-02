package lambdaintermediate;

import java.time.LocalDateTime;
import java.util.List;

public class CoffeeOrder {
    private final List<Coffee> coffees;
    private final LocalDateTime orderTime;

    public CoffeeOrder(List<Coffee> coffees, LocalDateTime orderTime) {
        this.coffees = coffees;
        this.orderTime = orderTime;
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}