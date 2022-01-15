package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioException) {
            throw new IllegalStateException("Unable to read file!", ioException);
        }
    }

    private boolean isValidLine(String line) {
        String[] parts = line.split(",");
        try {
            return validateLineLength(parts)
                    && validateLineNumber(parts[0])
                    && validateMeasuredValue(parts[1])
                    && validateName(parts[2]);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return false;
        }
    }

    private boolean validateLineNumber(String numberString) {
        try {
            Integer.parseInt(numberString);
            return  true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    private boolean validateLineLength(String[] parts) {
        return parts.length == 3;
    }

    private boolean validateMeasuredValue(String numberString) {
        try {
            Double.parseDouble(numberString);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    private boolean validateName(String nameString) {
        String[] nameFragments = nameString.split(" ");
        return nameFragments.length >= 2;
    }

    public List<String> validate(List<String> measured) {
        List<String> faultLines = new ArrayList<>();
        for (String currentLine : measured) {
            if (!isValidLine(currentLine)) {
                faultLines.add(currentLine);
            }
        }
        return faultLines;
    }
}