package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Truck {
    private List<Cargo> thingsToLoad;

    public Truck(List<Cargo> thingsToLoad) {
        this.thingsToLoad = thingsToLoad;
    }

    public double getShortestLength() {
        OptionalDouble result = thingsToLoad.stream()
                .mapToDouble(Cargo::getLength)
                .min();
        if (result.isPresent()) {
            return result.getAsDouble();
        } else {
            return 0d;
        }
    }

    public int getTotalWeight() {
        return thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .sum();
    }

    public double getAverageWeight() {
        return thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("No cargo."));
    }

    public int getMaxWeight() {
        OptionalInt result = thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .max();
        if (result.isPresent()) {
            return result.getAsInt();
        } else {
            return 0;
        }
    }

    public String getWeightStatistics() {
        IntSummaryStatistics stat = thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .summaryStatistics();
        if (stat.getCount() > 0) {
            return String.format("A rakományban található %d tétel, melyeknek összsúlya %d kg, közülük a legnehezebb " +
                    "%d kg, a legkönnyebb %d kg. A súlyuk átlagosan %.1f kg.",
                    stat.getCount(), stat.getSum(), stat.getMax(), stat.getMin(), stat.getAverage());
        } else {
            return "No cargo.";
        }
    }

    public List<Cargo> getThingsToLoad() {
        return thingsToLoad;
    }
}