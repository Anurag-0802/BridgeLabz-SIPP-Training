package accsessmodifier_package;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account info
    public void displaySavingsInfo() {
        System.out.println("Savings Account:");
        System.out.println("Account Number : " + accountNumber);    
        System.out.println("Account Holder : " + accountHolder);    
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Balance        : " + getBalance());    
    }
}

