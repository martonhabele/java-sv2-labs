package chars;

import java.util.Scanner;

public class LettersAndDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        String test = scanner.nextLine();
        lettersAndDigits.printLetterOrDigit(test);
    }

    public void printLetterOrDigit(String text) {
        char[] letters = text.toCharArray();

        for (char c : letters) {
            if (Character.isDigit(c)) {
                System.out.println(c + ": számjegy");
            }
            else if (Character.isAlphabetic(c)) {
                System.out.println(c + ": betű");
            }
            else {
                System.out.println(c + ": egyéb");
            }
        }
    }
}