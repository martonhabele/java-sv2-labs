package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        Names names = new Names();
        try {
            List<String> nameList = Files.readAllLines(Paths.get("src/main/java/introexceptionfinally/resources/names.txt"));
                System.out.println(names.getName("dr", nameList));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        } finally {
            System.out.println("End of operation!");
        }
    }

    public String getName(String prefix, List<String> names) {
        for (String name : names) {
            if (name.startsWith(prefix)) {
                return name;
            }
        }
        return "";
    }
}