package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSums {
    public String readFromFile() {
        try {
            List<String> floatingNumbers = Files.readAllLines(Paths.get("src/main/java/methodparam/resources/floatingnumbers.txt"));
            return floatingNumbers.get(0);
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be read!", ioe);
        }
    }

    public Sums sum (String floatingNumbers) {
        double positiveSum = 0;
        double negativeSum = 0;
        double number;
        String[] numbers = floatingNumbers.replace(',', '.').split(";");
        for (String scopedNumber : numbers) {
            number = Double.parseDouble(scopedNumber);
            if (scopedNumber.startsWith("-")) {
                negativeSum += number;
            }
            else {
                positiveSum += number;
            }
        }
        return new Sums(positiveSum, negativeSum);
    }
}