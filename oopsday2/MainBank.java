package accsessmodifier_package;

public class MainBank {
    public static void main(String[] args) {
    	
        // Create BankAccount object
        BankAccount b1 = new BankAccount("SB101", "Sajal Singh", 5000.0);
        b1.displayAccountInfo();
        System.out.println();
        
        b1.deposit(1500);
        b1.withdraw(2000);
        System.out.println("Updated Balance: " + b1.getBalance());

        // Create SavingsAccount object
        SavingsAccount sa = new SavingsAccount("SB102", "Rohit Sharma", 10000.0, 4.5);
        sa.displaySavingsInfo();

        System.out.println();
        sa.deposit(2000);
        sa.withdraw(3000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}

