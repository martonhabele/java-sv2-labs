package stringbasic.characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to spell with the student: ");
        String spellingBeeWord = scanner.nextLine();
        System.lineSeparator();

        System.out.println("You have to spell this word: " + spellingBeeWord);
        char[] spellingLetters = new char[spellingBeeWord.length()];

        for (int i = 0; i < spellingLetters.length; i++) {
            String beeLetter = scanner.nextLine();
            spellingLetters[i] = beeLetter.toCharArray()[0];
        }

        char[] spellingBeeLetters = spellingBeeWord.toCharArray();
        System.out.println(spellingBeeLetters);

        for (int i = 0; i < spellingBeeLetters.length; i++) {
            if (spellingBeeLetters[i] == spellingLetters[i]) {
                spellingBeeLetters[i] = spellingLetters[i];
            }
            else spellingBeeLetters[i] = '*';
        }
        System.out.println(spellingBeeLetters);

    }

}