// BankAccount.java
class BankAccount {
    // Properties (Encapsulation: private data members)
    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Method: deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method: withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method: check balance
    public void checkBalance() {
        System.out.println("Account " + accountNumber + " (" + holderName + ") Balance: " + balance);
    }
}

// Main Program
public class Main {
    public static void main(String[] args) {
        // Create 2 accounts
        BankAccount acc1 = new BankAccount(101, "Alice", 5000);
        BankAccount acc2 = new BankAccount(102, "Bob", 3000);

        // Perform operations
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc2.deposit(1000);
        acc2.withdraw(4000); // should show insufficient balance

        // Final balances
        acc1.checkBalance();
        acc2.checkBalance();
    }
}
