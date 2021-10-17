package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number, owner's name and current balance separated by pressing the Enter key:");

        BankAccount bankAccount = new BankAccount(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());

        System.out.println("Current details of the account are: " + bankAccount.getInfo());

        System.out.println("Deposit the following amount:");
        bankAccount.deposit(scanner.nextInt());

        System.out.println("Withdraw the following amount:");
        bankAccount.withdraw(scanner.nextInt());

        System.out.println("Current details of the account are: " + bankAccount.getInfo());
    }
}
