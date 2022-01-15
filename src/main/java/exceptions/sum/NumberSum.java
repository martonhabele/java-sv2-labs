package exceptions.sum;

public class NumberSum {
    private int sum(int[] numbers) {
        int sum = 0;
        for (int currentNumber : numbers) {
            sum += currentNumber;
        }
        return sum;
    }

    private int[] convertNumbers(String[] numbers) {
        int[] convertedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            convertedNumbers[i] = Integer.parseInt(numbers[i]);
        }
        return convertedNumbers;
    }

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Null is invalid!");
        }
        return sum(numbers);
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Null is invalid!");
        }
        int[] convertedNumbers;
        try {
            convertedNumbers = convertNumbers(numbers);
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException("Invalid numbers!");
        }
        return sum(convertedNumbers);
    }
}