package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> freezerContent = new ArrayList<>();

        freezerContent.add("Milk");
        freezerContent.add("Bread");
        freezerContent.add("Egg");
        freezerContent.add("Sausage");
        freezerContent.add("Moldy pizza");

        System.out.println(freezerContent + " " + freezerContent.size());

        freezerContent.remove("Moldy pizza");
        freezerContent.remove("Bread");

        System.out.println(freezerContent + " " + freezerContent.size());
    }
}