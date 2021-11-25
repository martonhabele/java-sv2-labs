package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int readNum;
        System.out.println("Give me an odd number!");

        while (number %2 != 0) {
            try {
                readNum = Integer.parseInt(scanner.nextLine());
                number = readNum;
                System.out.println(number);
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("This is not a valid number!", nfe);
            } finally {
                System.out.println("End of round!");
            }
        }
    }
}