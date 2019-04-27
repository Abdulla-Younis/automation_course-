
public class Accounts {
	private String id;  
	private String name; 
	private int balance = 0; 
	private static int accountsNo=0; 
	public Accounts(String ID, String Name){
		this.id = ID;
		this.name = Name;
		this.balance = 5000000;
		accountsNo++;
	}
	
	public Accounts(String ID, String Name, int BALANCE){
		createAccounts(ID,Name,BALANCE);
		accountsNo++;
	}
	
	public void setId(String Id) {
		id = Id;
	}
	public String getId() {
		return id;
		
	}
	
	public void setName(String Name) {
		name = Name;
	}
	public String getName() {
		return name;
		
	}
	
	public void setBalance(int Balance) {
		balance = Balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void createAccounts(String ID, String Name, int BALANCE) {
		setId(ID);
		setName(Name);
		setBalance(BALANCE);	
	}
	
	public int credit(int amount) {
		balance += amount;
		return balance;
	}
	
	public  int debit(int amount) {
		if (amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Amount Exceed balance");
		}
		
		return balance;
	}
	
	public int transferTo(Accounts acc, int amount) {
		if (amount <= this.balance) {
			this.balance = this.balance - amount;
			acc.balance = acc.balance + amount;
		}else {
			System.out.println("Amount Exceed balance");
		}
		
		return acc.balance;
	}
	
	public static int getAccountsNo () {
		return accountsNo;
	}
	
	public static int resetAccountsNo () {
		accountsNo =0;
		return accountsNo;
	}

	
	public String toString() {
		return String.format("Accounts[id=%s,name=%s,balance=%d]",getId(),getName(),getBalance());
		
	}


}
