package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {
    public static void main(String[] args) {
        new PaulStreetBoys().nameOperations();
    }

    public void nameOperations() {
        List<String> palUtcaiFiuk = new ArrayList<>();
        try {
            palUtcaiFiuk = Files.readAllLines(Paths.get("src/main/java/introexceptioncause/resources/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be read!", ioe);
        }
        nameGetter(palUtcaiFiuk);
    }

    public void nameGetter(List<String> palutcaifiuk) {
        for (String name : palutcaifiuk) {
            if (name.equals("Nemecsek Ernő")) {
                System.out.println(name.toLowerCase());
            }
            else {
                System.out.println(name);
            }
        }
    }
}