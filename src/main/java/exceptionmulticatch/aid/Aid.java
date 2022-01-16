package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> population = Files.readAllLines(path);
            for (String item : population) {
                String[] temp = item.split(" ");
                int people = Integer.parseInt(temp[1]);
                int amountPerPerson = amount / people;
                result.add(temp[0] + " " + amountPerPerson);
            }
        } catch (NullPointerException | IOException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException error) {
            throw new IllegalStateException("Something went wrong!", error);
        }
        return result;
    }

    public int getAmount() {
        return amount;
    }
}