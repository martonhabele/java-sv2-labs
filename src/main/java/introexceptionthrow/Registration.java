package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean successfulValidation = true;

        System.out.print("Name: ");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            successfulValidation = false;
            System.out.println(illegalArgumentException.getMessage());
        }

        System.out.print("Age: ");
        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
        } catch (IllegalArgumentException illegalArgumentException) {
            successfulValidation = false;
            System.out.println(illegalArgumentException.getMessage());
        }

        System.out.println("Name: " + name + "\n" +
                "Age: " + age);

        if (successfulValidation) {
            System.out.println("Successful registration");
        } else {
            System.out.println("Registration failed");
        }
    }
}