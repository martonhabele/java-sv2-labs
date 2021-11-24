package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    public List<String> getTrackPoints() {
        try {
            return Files.readAllLines(Paths.get("src/main/java/introexceptioncause/resources/tracking.csv"));
        } catch (IOException ioe) {
            throw new IllegalStateException("File cannot be opened!", ioe);
        }
    }

    public void printHeights(List<String> points) {
        List<Integer> heights = new ArrayList<>();
        for (String point : points) {
            String[] splittedPoints = point.split(";");
            int height = Integer.parseInt(splittedPoints[2]);
            heights.add(height);
        }
        heightPrinter(heights);
    }

    public void heightPrinter(List<Integer> heights) {
        for (int i = 0; i < heights.size() - 1; i++) {
            System.out.println(heights.get(i + 1) - heights.get(i));
        }
    }
}