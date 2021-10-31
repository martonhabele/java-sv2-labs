package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Pali", "Éva", "Béla", "Kriszti", "Tamás", "Kata", "Géza", "Edina", "Péter", "Zoli"));

        Random random = new Random();
        int firstWinner = random.nextInt(0, 6);
        int secondWinner = random.nextInt(6, 10);

        System.out.println("Winners are: " + names.get(firstWinner) + " and " + names.get(secondWinner));
    }
}