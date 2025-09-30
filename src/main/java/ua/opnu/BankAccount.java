package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    public BankAccount() {
        this.name = "";
        this.balance = 0.0;
        this.transactionFee = 0.0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance -= (amount + transactionFee);
            return  true;
        }
        return false;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if (this.withdraw(amount)) {
            receiver.deposit(amount);
            return  true;
        }
        return false;
    }
}