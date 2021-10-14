package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();               //new instance for client class
        Scanner scanner = new Scanner(System.in);   //new instance for scanner class

        System.out.println("Client name:");         //getting client's name
        client.name = scanner.nextLine();

        System.out.println("Client YoB:");          //getting client's Year of Birth
        client.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Client address:");      //getting client's address
        client.address = scanner.nextLine();

        System.out.println("Client name is: " + client.name);
        System.out.println("Client YoB is: " + client.year);
        System.out.println("Client address is: " + client.address);
    }
}
