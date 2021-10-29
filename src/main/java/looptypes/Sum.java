package looptypes;

public class Sum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] numbers = {2, 6, 3, 5, 7, 9};

        sum.printSums(numbers);
    }

    public void printSums(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(numbers[i] + numbers[i-1]);
        }
    }
}