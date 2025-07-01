package accsessmodifier_package;

public class BankAccount {
	
    // Public field
    public String accountNumber;

    // Protected field
    protected String accountHolder;

    // Private field
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method 
    public double getBalance() {
        return balance;
    }

    // Public method 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rs" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Public method to display account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance       : " + balance);
    }
}

