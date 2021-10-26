package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] words = {"Apple", "Banana", "Citrus"};

        arrayHandler.addIndexToNumber(numbers);
        for (int number: numbers) {
            System.out.println(number);
        }
        for (int number: numbers) {
            System.out.print(number + ", ");
        }
        System.out.print(System.lineSeparator());

        arrayHandler.concatenateIndexToWord(words);
        for (String word: words) {
            System.out.println(word);
        }
        for (String word: words) {
            System.out.print(word + ", ");
        }
    }
}