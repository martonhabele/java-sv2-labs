package controlselection.week;

import java.util.Scanner;

public class DayOfWeeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg a hét egy napját: ");
        String givenDay = scanner.nextLine().toLowerCase();

        switch (givenDay) {
            case "hétfő" -> System.out.println("Hét eleje");
            case "kedd", "szerda", "csütörtök" -> System.out.println("Hét közepe");
            case "péntek" -> System.out.println("Majdnem hétvége");
            case "szombat", "vasárnap" -> System.out.println("Hétvége");
            default -> System.out.println("Ismeretlen nap");
        }
    }
}