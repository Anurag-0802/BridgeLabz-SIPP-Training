abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters (Encapsulation)
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { 
    	this.accountNumber = accountNumber; 
    }

    public String getHolderName() { 
    	return holderName; 
    }
    
    public void setHolderName(String holderName) { 
    	this.holderName = holderName; 
    }

    public double getBalance() { 
    	return balance; 
    }
    
    public void setBalance(double balance) { 
    	this.balance = balance; 
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();
}

// Interface for loan
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; 

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of Rs." + amount + " approved for Savings Account.");
        } else {
            System.out.println("Loan not eligible for Savings Account.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02; 

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of Rs." + amount + " approved for Current Account.");
        } else {
            System.out.println("Loan not eligible for Current Account.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}
