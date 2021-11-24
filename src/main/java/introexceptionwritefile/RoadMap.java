package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
        List<String> locations = Arrays.asList("Tatabánya", "Győr", "Szombathely", "Klagenfurt", "Villach", "Udine", "Jesolo");
        try {
            Files.write(Paths.get("locations.txt"),locations);
        } catch (IOException ioe) {
            System.out.println("Cannot write file!");
            ioe.printStackTrace();
        }
    }
}