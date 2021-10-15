package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        client.setName(scanner.nextLine());

        System.out.println("Year:");
        client.setYear(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Address:");
        client.setAddress(scanner.nextLine());

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        System.out.println("New address:");
        client.migrate(scanner.nextLine());

        System.out.println("Client's new address is:");
        System.out.println(client.getAddress());
    }
}
