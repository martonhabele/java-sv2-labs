package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Run run = new Run("Géza");
        run.addRun(5.6d);
        System.out.println(run.printFormattedRunText());
        run.addRun(8.6d);
        System.out.println(run.printFormattedRunText());
    }

    private final String RUN_MOTIVATION = "Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!";
    private String name;
    private List<Double> distanceInKilometers;

    public Run(String name) {
        this.name = name;
        this.distanceInKilometers = new ArrayList<>();
    }

    public void addRun(double distance) {
        distanceInKilometers.add(distance);
    }

    public String printFormattedRunText() {
        double km = distanceInKilometers.get(distanceInKilometers.size() - 1);
        int day = distanceInKilometers.size();
        String date = LocalDate.now().toString();

        return String.format(RUN_MOTIVATION, name, date, day, km);
    }
}