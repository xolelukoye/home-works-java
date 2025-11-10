package practice2;

public class BankAccount {

    String owner;
    double balance;

    BankAccount(String someOwner, double someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner() {
        return this.owner;
    }

    double getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    double deposit(double amount) {
        return balance += amount;
    }

    double withdraw(double amount) {
        return balance -= amount;
    }

    void printBalance() {
        System.out.println("Balance: " + this.balance);
    }

}
