class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : Rs." + balance);
    }
}

//Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
	double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
    	super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
    	System.out.println("\n---- Savings Account ----");
        displayDetails();
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

//Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
	double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
    	super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
    	System.out.println("\n--- Checking Account ---");
        displayDetails();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

//Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
	int termInMonths;

    FixedDepositAccount(String accountNumber, double balance, int termInMonths) {
    	super(accountNumber, balance);
        this.termInMonths = termInMonths;
    }
    void displayAccountType() {
    	System.out.println("\n--- Fixed Deposit Account ---");
        displayDetails();
        System.out.println("Term: " + termInMonths + " months");
    }
}