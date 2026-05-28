class BankAccount {

    private double balance;

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation14 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(10000);
        account.withdraw(3000);

        System.out.println("Current Balance: " + account.getBalance());
    }
}