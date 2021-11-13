package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Required length for Fibonacci series: ");
        int fiboLength = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        int[] fibonacciSeries = new int[fiboLength + 2];
        fibonacciSeries[1] = 1;
        for (int i = 0; i < fiboLength; i++) {
            fibonacciSeries[i + 2] = fibonacciSeries[i] + fibonacciSeries[i + 1];
            System.out.println(fibonacciSeries[i] + ", ");
        }
    }
}