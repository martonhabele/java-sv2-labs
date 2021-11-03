package chars;

import java.util.Scanner;

public class Whitespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Whitespace whitespace = new Whitespace();
        String text = scanner.nextLine();
        System.out.println(whitespace.makeWhitespaceToStar(text));

    }

    public String makeWhitespaceToStar(String text) {
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isWhitespace(letters[i])) {
                letters[i] = '*';
            }
        }
        String starredText = new String(letters);
        return starredText;
    }
}