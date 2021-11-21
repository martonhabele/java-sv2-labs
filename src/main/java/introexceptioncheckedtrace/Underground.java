package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Underground {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/introexceptioncheckedtrace/resources/underground.txt");
        Operations operations = new Operations();
        List<String> trainCars = new ArrayList<>();
        try {
            trainCars = operations.readFile(path);
        } catch (IOException ioe) {
            System.out.println("File cannot be read!");
            ioe.printStackTrace();
        }
        if (trainCars.size() != 0) {
            System.out.println(operations.getDailySchedule(trainCars));
        }
    }
}