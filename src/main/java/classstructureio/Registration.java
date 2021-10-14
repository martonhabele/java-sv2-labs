package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, give me your name: ");
        String name = scanner.nextLine();
        System.out.print("Please, give me your email address: ");
        String email = scanner.nextLine();

        System.out.println("You have registered with the following parameters:");
        System.out.println("Your name: " + name);
        System.out.println("Your email address: " + email);
    }
}
