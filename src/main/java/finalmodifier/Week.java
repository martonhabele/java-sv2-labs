package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {
    public static final List<String> WEEKDAYS = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

    public static void main(String[] args) {
        System.out.println(WEEKDAYS);
        WEEKDAYS.set(1, "Wednesday");
        System.out.println(WEEKDAYS);
    }
}