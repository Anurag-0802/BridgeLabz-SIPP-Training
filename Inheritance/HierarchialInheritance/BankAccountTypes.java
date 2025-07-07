import java.util.Scanner;

public class BankAccountTypes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Savings Account input
        System.out.print("Enter Savings Account Number : ");
        String saNo = sc.nextLine();
        System.out.print("Enter Balance : ");
        double saBalance = sc.nextDouble();
        System.out.print("Enter Interest Rate : ");
        double saRate = sc.nextDouble();
        SavingsAccount sa = new SavingsAccount(saNo, saBalance, saRate);

        // Checking Account input
        sc.nextLine(); 
        System.out.print("\nEnter Checking Account Number : ");
        String caNo = sc.nextLine();
        System.out.print("Enter Balance : ");
        double caBalance = sc.nextDouble();
        System.out.print("Enter Withdrawal Limit : ");
        double caLimit = sc.nextDouble();
        CheckingAccount ca = new CheckingAccount(caNo, caBalance, caLimit);

        // Fixed Deposit Account input
        sc.nextLine(); 
        System.out.print("\nEnter FD Account Number : ");
        String fdNo = sc.nextLine();
        System.out.print("Enter Balance : ");
        double fdBalance = sc.nextDouble();
        System.out.print("Enter Term (months) : ");
        int term = sc.nextInt();
        FixedDepositAccount fd = new FixedDepositAccount(fdNo, fdBalance, term);

        // Display all account types
        sa.displayAccountType();
        ca.displayAccountType();
        fd.displayAccountType();
	}

}
