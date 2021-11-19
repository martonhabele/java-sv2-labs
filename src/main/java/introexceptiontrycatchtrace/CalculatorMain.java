package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Give me 2 numbers, separated by ENTER:");
        int numberOne = calculator.numberChecker(scanner.nextLine());
        int numberTwo = calculator.numberChecker(scanner.nextLine());

        System.out.println("""
                Select operation:
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division (integers only""");

        String selectedOperation = scanner.nextLine();
        try {
            switch (selectedOperation) {
                case "1" -> System.out.println(calculator.addNumbers(numberOne, numberTwo));
                case "2" -> System.out.println(calculator.subtractNumbers(numberOne, numberTwo));
                case "3" -> System.out.println(calculator.multiplyNumbers(numberOne, numberTwo));
                case "4" -> System.out.println(calculator.divideNumbers(numberOne, numberTwo));
                default -> System.out.println("No such operation!");
            }
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Division by 0 is not possible!");
        }
    }
}