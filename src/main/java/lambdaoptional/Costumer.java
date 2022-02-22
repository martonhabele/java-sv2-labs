package lambdaoptional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Costumer {
    private List<Costume> costumes;

    public Costumer(List<Costume> costumes) {
        this.costumes = costumes;
    }

    private Optional<Costume> findFirst(Predicate<Costume> condition) {
        for (Costume c : costumes) {
            if (condition.test(c)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    public Optional<Costume> findFirstCostumeWithKeyword(String keyword) {
        Optional<Costume> result = findFirst(costume -> costume.getDescription().contains(keyword));
        return result;
    }

    public Optional<Costume> findFirstCheaperCostume(int maxPrice) {
        Optional<Costume> result = findFirst(costume -> costume.getPrice() <= maxPrice);
        return result;
    }

    public Optional<Costume> findFirstCostumeSameSize(Size size) {
        Optional<Costume> result = findFirst(costume -> costume.getSize() == size);
        return result;
    }

    public List<Costume> getCostumes() {
        return costumes;
    }
}