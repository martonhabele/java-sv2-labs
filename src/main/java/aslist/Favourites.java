package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your favorite color: ");
        favouriteThings.add(scanner.nextLine());

        System.out.print("Your favorite car manufacturer: ");
        favouriteThings.add(scanner.nextLine());

        System.out.print("Your favorite day: ");
        favouriteThings.add(scanner.nextLine());

        System.out.print("This list is: ");
        for (String data : favouriteThings) {
            System.out.print(data + ", ");
        }
        System.out.println();
        System.out.print("Size of the list: " + favouriteThings.size());
    }
}