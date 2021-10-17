package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name and price separated by pressing the Enter key:");

        Product product = new Product(scanner.nextLine(), scanner.nextInt());

        System.out.println("Add this amount to the current price:");
        product.increasePrice(scanner.nextInt());

        System.out.println("Subtract this amount from the current price");
        product.decreasePrice(scanner.nextInt());

        System.out.println(product.getName() + " product has the current price of " + product.getPrice());
    }
}
