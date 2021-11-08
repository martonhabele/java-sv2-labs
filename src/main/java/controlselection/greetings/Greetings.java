package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        greetings.greeter(17,10);
    }

    public void greeter(int hour, int minute) {
        LocalTime time = LocalTime.of(hour, minute);
        LocalTime afterFiveMorning = LocalTime.of(4, 59);
        LocalTime afterNineMorning = LocalTime.of(8, 59);
        LocalTime afterHalfPastSixEvening = LocalTime.of(18, 29);
        LocalTime afterEight = LocalTime.of(19, 59);

        if (time.isAfter(afterFiveMorning) && time.isBefore(afterNineMorning)) {
            System.out.println("Jó reggelt!");
        }

        else if (time.isAfter(afterNineMorning) && time.isBefore(afterHalfPastSixEvening)) {
            System.out.println("Jó napot!");
        }
        else if (time.isAfter(afterHalfPastSixEvening) && time.isBefore(afterEight)) {
            System.out.println("Jó éjt!");
        }
    }
}