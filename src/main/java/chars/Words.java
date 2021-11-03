package chars;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Words words = new Words();

        String word = scanner.nextLine();
        System.out.println(words.pushWord(word));
    }

    public String pushWord(String word) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] += 1;
        }
        String pushedString = new String(letters);
        return pushedString;
    }
}