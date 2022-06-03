package lambdacollectors.christmastree;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChristmasTreeFair {
    private List<ChristmasTree> christmasTrees;

    public ChristmasTreeFair(List<ChristmasTree> christmasTrees) {
        this.christmasTrees = christmasTrees;
    }

    public Map<PineTreeType, Long> getCountByType() {
        return christmasTrees.stream()
                .collect(Collectors.groupingBy(ChristmasTree::getType, Collectors.counting()));
    }

    public double getMaxHeightByType(PineTreeType type) {
        Optional<ChristmasTree> result = christmasTrees.stream()
                .filter(tree -> tree.getType() == type)
                .collect(Collectors.maxBy(Comparator.comparing(ChristmasTree::getHeight)));
        if (result.isPresent()) {
            return result.get().getHeight();
        }
        return 0d;
    }

    public double getAveragePrice() {
        return christmasTrees.stream()
                .collect(Collectors.averagingInt(tree -> tree.getPrice()));
    }

    public List<ChristmasTree> getChristmasTrees() {
        return christmasTrees;
    }
}