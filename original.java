
public class original {

	public static void main(String[] args) {
		Accounts account1 = new Accounts("1","Abdulla");
		Accounts account2 = new Accounts("2","Younis",30000);
		Accounts account3 = new Accounts("3","Ibrahim",70000);
		
		System.out.println("The three accounts before any operation: ");
		System.out.println("Account1 is: " + account1.toString());
		System.out.println("Account2 is: " + account2.toString());
		System.out.println("Account3 is: " + account3.toString());
		
		
		System.out.println("\n Account1 \n");
		
		System.out.println("Credit on account1 by 3000: ");
		account1.credit(3000);
		System.out.println("Account1 is: " + account1.toString());
		System.out.println("Debit 1000 from account1: ");
		account1.debit(1000);
		System.out.println("Account1 is: " + account1.toString());
		System.out.println("Transfer 2000 from account1 to account 2: ");
		account1.transferTo(account3, 2000);
		System.out.println("Account balance after transfering: ");
		System.out.println("Account1 is: " + account1.toString());
		System.out.println("Account2 is: " + account2.toString());
		
		
		System.out.println("\n Account2 \n");

		System.out.println("Credit on account2 by 1000: ");
		account2.credit(1000);
		System.out.println("Account2 is: " + account2.toString());
		System.out.println("Debit 1000 from account2: ");
		account2.debit(1000);
		System.out.println("Account2 is: " + account2.toString());
		System.out.println("Transfer 750 from account2 to account 3: ");
		account2.transferTo(account3, 750);
		System.out.println("Account balance after transfering: ");
		System.out.println("Account2 is: " + account2.toString());
		System.out.println("Account3 is: " + account3.toString());
		
		
		System.out.println("\n Account3 \n");
		
		System.out.println("Credit on account3 by 800: ");
		account3.credit(800);
		System.out.println("Account3 is: " + account3.toString());
		System.out.println("Debit 600 from account3: ");
		account3.debit(600);
		System.out.println("Account3 is: " + account3.toString());
		System.out.println("Transfer 1000 from account3 to account2: ");
		account3.transferTo(account2, 1000);//account3,
		System.out.println("Account balance after transfering: ");
		System.out.println("Account3 is: " + account3.toString());
		System.out.println("Account2 is: " + account2.toString());

		System.out.println("\n \n");
		
		System.out.printf("The Number of Accounts created are: %d\n", account1.getAccountsNo());
		System.out.printf("Number of Accounts created after resetting: %d\n", account1.resetAccountsNo());

		
	}

}
