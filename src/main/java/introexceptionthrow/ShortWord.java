package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a 5-letter word:");
        String word = scanner.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException("Word is longer than 5 letters!");
        }
        char[] lettersFromWord = word.toCharArray();
        for (char letter : lettersFromWord) {
            if (!Character.isLetter(letter)) {
                throw new IllegalArgumentException("This is not a valid word!");
            }
        }
        System.out.println("It is a valid word!");
    }
}