package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the name and the birth date of the employee in YYYY MM DD format: ");

        Employee employee = new Employee(scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Employer's details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("DoB: " + employee.getDateOfBirth());
        System.out.println("Begin of the employment: " + employee.getBeginEmployment());
    }
}