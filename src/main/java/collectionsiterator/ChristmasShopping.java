package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> christmasPresents = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> christmasPresents) {
        this.christmasPresents = christmasPresents;
    }

    public void addNewPresent(ChristmasPresent present) {
        christmasPresents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        for (Iterator<ChristmasPresent> presentIterator = christmasPresents.iterator(); presentIterator.hasNext();) {
            ChristmasPresent christmasPresent = presentIterator.next();
            if (christmasPresent.getPrice() > maxPrice) {
                presentIterator.remove();
            }
        }
    }

    public List<ChristmasPresent> getChristmasPresents() {
        return christmasPresents;
    }
}