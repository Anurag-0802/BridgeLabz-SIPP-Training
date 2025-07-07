import java.util.*;
public class BankingStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nAccount " + (i + 1));
            System.out.print("Enter account type (1 - Savings, 2 - Current) : ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Account Number : ");
            String accNo = sc.nextLine();

            System.out.print("Enter Holder Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance : ");
            double balance = sc.nextDouble();

            BankAccount account;
            if (type == 1) {
                account = new SavingsAccount(accNo, name, balance);
            } else if (type == 2) {
                account = new CurrentAccount(accNo, name, balance);
            } else {
                System.out.println("Invalid type. Skipping...");
                continue;
            }

            accounts.add(account);
        }
        
        System.out.println("\n--- Account Summary ---");
        for (BankAccount acc : accounts) {
            System.out.println("\nAccount Number : " + acc.getAccountNumber());
            System.out.println("Holder Name : " + acc.getHolderName());
            System.out.println("Balance : Rs." + acc.getBalance());

            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest : Rs." + interest);

            acc.deposit(2000);
            acc.withdraw(1000);

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan(15000);
            }

            System.out.println("--------------------------");
        }

	}

}
