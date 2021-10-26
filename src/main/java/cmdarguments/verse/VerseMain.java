package cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {
        for (String words: args) {
            System.out.print(words + " ");
        }

        System.out.print(System.lineSeparator());

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}