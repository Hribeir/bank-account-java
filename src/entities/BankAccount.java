package entities;

public class BankAccount {
    private final int numberAccount;
    private  final String holder;
    private final char depositOption;
    private  double initialDeposit;

    public BankAccount(int numberAccount, String holder, char depositOption, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.depositOption = depositOption;
        this.initialDeposit = initialDeposit;
    }
    public BankAccount(int numberAccount, String holder, char depositOption) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.depositOption = depositOption;
    }


    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolder() {
        return holder;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public String toString() {
        return
        "Account "  + getNumberAccount()
        + ", Holder: " + getHolder()
        + ", Balance: $ " + getInitialDeposit();
    }
}
