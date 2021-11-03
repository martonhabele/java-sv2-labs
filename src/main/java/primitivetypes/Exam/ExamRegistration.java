package primitivetypes.Exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("DoB year: ");
        int yearDoB = Integer.parseInt(scanner.nextLine());
        System.out.print("DoB month: ");
        int monthDoB = Integer.parseInt(scanner.nextLine());
        System.out.print("DoB day: ");
        int dayDoB = Integer.parseInt(scanner.nextLine());
        LocalDate dateDoB = LocalDate.of(yearDoB, monthDoB, dayDoB);
        System.out.print("ZIP code: ");
        int zipCode = Integer.parseInt(scanner.nextLine());
        System.out.print("Average grade: ");
        double avgGrade = Double.parseDouble(scanner.nextLine());

        Person person = new Person(name, dateDoB, zipCode, avgGrade);
        exam.addPerson(person);
        System.out.println(person.toString());
    }
}