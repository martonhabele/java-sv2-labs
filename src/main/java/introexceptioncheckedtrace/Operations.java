package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class Operations {
    public List<String> readFile(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public String getDailySchedule(List<String> trainCars) {
        StringBuilder stringBuilder = new StringBuilder(LocalDate.now().toString());
        stringBuilder.append(", ");
        for (String car : trainCars) {
            if (car.startsWith("2")) {
                stringBuilder.append(car).append(" ");
            }
        }
        return stringBuilder.toString();
    }
}