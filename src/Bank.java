// Bank.java

public class Bank {
    private double balance;

    public Bank(double openingBalance) {
        balance = openingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void display() {
        System.out.println("Balance = " + balance);
    }

    @Override
    public String toString() {
        return "Your Bank balance is " + this.balance;
    }
}
