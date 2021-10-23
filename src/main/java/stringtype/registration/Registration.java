package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();

        System.out.println("Provide username, password two times and email separated by Enter key:");
        String username = scanner.nextLine();
        String password1 = scanner.nextLine();
        String password2 = scanner.nextLine();
        String email = scanner.nextLine();
        scanner.close();

        System.out.println("Username is valid: " + userValidator.isValidUsername(username));
        System.out.println("Password is valid: " + userValidator.isValidPassword(password1, password2));
        System.out.println("Email is valid: " + userValidator.isValidEmail(email));
    }
}