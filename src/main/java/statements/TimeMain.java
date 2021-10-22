package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Első időpont óra, perc és másodperc, Enterrel elválasztva: ");
        Time currentTime = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();

        System.out.println("Második időpont óra, perc és másodperc, Enterrel elválasztva: ");
        Time competitorTime = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        scanner.close();

        System.out.println("Első időpont " + currentTime.timeToString() + " = " + currentTime.getInMinutes() + " perc");
        System.out.println("Második időpont " + competitorTime.timeToString() + " = " + competitorTime.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + currentTime.earlierThan(competitorTime));
    }
}