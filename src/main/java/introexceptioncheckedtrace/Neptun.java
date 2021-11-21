package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        List<String> rawData = new ArrayList<>();
        try {
            rawData = neptun.readAll();
        } catch (IOException ioe) {
            System.out.println("Cannot open file!");
        }

        List<String> neptunCodes = new ArrayList<>();
        String[] register;
        for (String rawRow : rawData) {
            register = rawRow.split(",");
            neptunCodes.add(register[1]);
        }
        System.out.println(neptunCodes);
    }

    public List<String> readAll() throws IOException {
        Path path = Paths.get("src/main/java/introexceptioncheckedtrace/resources/neptun.csv");
        List<String> rawData = Files.readAllLines(path);
        return rawData;
    }
}