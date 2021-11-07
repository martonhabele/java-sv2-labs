package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
    }

    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextInt()) {
            int accumulator = scanner.nextInt();
                if (accumulator > 100) {
                    stringBuilder.append(accumulator);
                    stringBuilder.append(',');
                }
        }
        return stringBuilder.toString();
    }
}