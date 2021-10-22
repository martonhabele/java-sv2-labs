package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Can be divided by 3: " + (number % 3 == 0));
    }
}