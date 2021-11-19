package introexceptiontrycatchtrace;

public class Calculator {
    public int numberChecker(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("This is not a number! Defaulting to 0!");
            return 0;
        }
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int subtractNumbers(int a, int b) {
        return a - b;
    }

    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public int divideNumbers(int a, int b) {
        return a / b;
    }
}