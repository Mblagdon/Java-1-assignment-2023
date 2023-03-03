package Assignment1;
/**
 * A tester for Account Class
 *
 * @author MBLagdon
 */

import Assignment1.Account;

import java.util.Scanner;

public class FunWithAccount {

    public static void main(String[] args) {
        System.out.println("Fun with Accounts");

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter Account name: "); //Get users account name
        String name = input.nextLine();

        System.out.println("\nEnter account balance: "); //Get account balance
        double balance = input.nextDouble();

        Account account = new Account(name, balance); //set account

        char c;

        do {
            printMenu();
            c = Character.toUpperCase(input.next().charAt(0));

            if (c == 'A') {
                System.out.printf("%s balance: $%.2f", account.getName(), account.getBalance());
            } else if (c == 'B') {
                System.out.println("Enter an amount to deposit: ");
                double deposit = input.nextDouble();
                account.deposit(deposit);
                System.out.printf("%s balance: $%.2f", account.getName(), account.getBalance());
            } else if (c == 'C') {
                System.out.print("\nEnter withdrawal amount: ");
                double withdrawal = input.nextDouble();
                account.withdraw(withdrawal);
                System.out.printf("%s balance: $%.2f", account.getName(), account.getBalance());
            } else if (c == 'D') {
                account.reset();
                System.out.printf("This account has been reset: %s balance: $%.2f", account.getName(), account.getBalance());
            } else if (c != 'Q') {
                System.out.printf("\nOption not recognized. Try Again!");
            }

        } while (c != 'Q');

        System.out.println("\nGOODBYE!");

    }
        public static void printMenu(){
            System.out.println("\nSelect from the following options:");
            System.out.println("(A) Get account balance");
            System.out.println("(B) Make deposit");
            System.out.println("(C) Make withdrawal");
            System.out.println("(D) Reset account");
            System.out.println("(Q) Quit");
        }
}