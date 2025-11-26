package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char depositOption = sc.next().charAt(0);


        if (depositOption == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            BankAccount bankAccount = new BankAccount(numberAccount, holder, depositOption, initialDeposit);
            System.out.println();
            System.out.println("Account data:");
            System.out.print(bankAccount.toString());
        } else {
            BankAccount bankAccount = new BankAccount(numberAccount, holder, depositOption);
            System.out.println();
            System.out.print(bankAccount.toString());
        }

        sc.close();
    }
}
