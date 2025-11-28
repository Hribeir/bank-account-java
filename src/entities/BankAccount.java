package entities;

public class BankAccount {
    private final int numberAccount;
    private  final String holder;
    private  double balance;


    public BankAccount(int numberAccount, String holder, double balance) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.balance = balance;
    }

    public BankAccount(int numberAccount, String holder ) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.balance = 0;
    }





    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }





    public void depositValue(double balance) {
         this.balance += balance;
    }

    public void withdrawValue(double withdrawValue) {
        this.balance = balance - withdrawValue - 5;
    }




    public String toString() {
        return
        "Account " + getNumberAccount()
        + ", Holder: " + getHolder()
        + ", Balance: $ " + String.format("%.2f", getBalance());
    }
}
