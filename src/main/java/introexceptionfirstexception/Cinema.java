package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Név: ");
        String customerName = scanner.nextLine();
        System.out.print("Választott film: ");
        String movieTitle = scanner.nextLine();
        System.out.print("Jegyek száma: ");
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        System.out.print("Választott sor: ");
        int customerPosition = Integer.parseInt(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder("Foglalás adatai: ");
        stringBuilder.append("\n").append("Név: ").append(customerName).append("\n")
                .append("Film: ").append(movieTitle).append("\n")
                .append("Foglalt székek: ");

        for (int i = 1; i <= numberOfTickets; i++) {
            stringBuilder.append(customerPosition).append(". sor ").append(i).append(". szék ");
            if (i < numberOfTickets) {
                stringBuilder.append(", ");
            }
        }
        System.out.println(stringBuilder);
    }
}