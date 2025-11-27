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
        char hasInitialDeposit = sc.next().toLowerCase().charAt(0);

        BankAccount bankAccount;

        if (hasInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(numberAccount, holder, initialDeposit);
        } else {
            bankAccount = new BankAccount(numberAccount, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.print(bankAccount);
        System.out.println();

        System.out.println();
        System.out.print("Enter a deposit value: ");
        bankAccount.depositValue(sc.nextDouble());

        System.out.println("Update account data:");
        System.out.print(bankAccount);
        System.out.println();

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        bankAccount.withdrawValue(sc.nextDouble());
        System.out.println("Update account data:");
        System.out.print(bankAccount);

        sc.close();
    }
}
