package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, give me the first number: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, give me the second number: ");
        int b = scanner.nextInt();

        System.out.println(a + " + " + b);
        System.out.println(a + b);
    }
}
