package controliteration.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int maxNumber = scanner.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

//        int i = 1;
//        while (i < maxNumber) {
//            if (i % divisor == 0) {
//                System.out.print(i + ", ");
//            }
//            i++;
//        }

        for (int j = 1; j < maxNumber; j++) {
            if (j % divisor == 0) {
                System.out.println(j + ", ");
            }
        }
    }
}