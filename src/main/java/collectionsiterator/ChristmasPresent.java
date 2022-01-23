package collectionsiterator;

public class ChristmasPresent {
    private String presentDescription;
    private String chosenName;
    private int price;

    public ChristmasPresent(String presentDescription, String chosenName, int price) {
        this.presentDescription = presentDescription;
        this.chosenName = chosenName;
        this.price = price;
    }

    public String getPresentDescription() {
        return presentDescription;
    }

    public String getChosenName() {
        return chosenName;
    }

    public int getPrice() {
        return price;
    }
}