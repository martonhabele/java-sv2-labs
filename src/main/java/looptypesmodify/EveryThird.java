package looptypesmodify;

public class EveryThird {

    public static void main(String[] args) {
        EveryThird everyThird = new EveryThird();

        int[] test = {1, 3, 11, 4, 5, 3, 6, 2, 8, 10};

        everyThird.changeToZero(test);

        for (int i = test.length - 1; i >= 0; i--) {
            System.out.println(test[i]);
        }
    }

    public int[] changeToZero(int[] numbers) {
        int counter = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (counter == 0 || counter % 3 == 0) {
                numbers[i] = 0;
            }
            counter++;
        }
        return numbers;
    }
}