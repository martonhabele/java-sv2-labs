package introexceptionthrow;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive integer:");
        String input = scanner.nextLine();
        char[] inputArray = input.toCharArray();
        for (char inputChars : inputArray) {
            if (!Character.isDigit(inputChars)) {
                throw new IllegalArgumentException("This is not a valid positive integer!");
            }
        }
        System.out.println("This is a valid positive integer!");
    }
}