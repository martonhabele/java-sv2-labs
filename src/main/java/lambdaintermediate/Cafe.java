package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {
    private final List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public void addOrder(CoffeeOrder order) {
        orders.add(order);
    }

    public Integer getTotalIncome() {
        return orders.stream()
                .flatMap(x -> x.getCoffees().stream())
                .map(Coffee::getPrice)
                .reduce(0, Integer::sum, Integer::sum);
    }

    public Integer getTotalIncome(LocalDate date) {
        return orders.stream()
                .filter(order -> order.getOrderTime().toLocalDate().equals(date))
                .flatMap(x -> x.getCoffees().stream())
                .map(Coffee::getPrice)
                .reduce(0, Integer::sum, Integer::sum);
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return orders.stream()
                .flatMap(x -> x.getCoffees().stream())
                .map(Coffee::getType)
                .filter(type::equals)
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
        return orders.stream()
                .filter(x -> x.getOrderTime().isAfter(from))
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return orders.stream()
                .filter(x -> x.getOrderTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(CoffeeOrder::getOrderTime))
                .limit(5)
                .collect(Collectors.toList());
    }
}