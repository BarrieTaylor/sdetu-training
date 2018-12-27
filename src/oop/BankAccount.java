package oop;

public class BankAccount {
	
	
	
	
	// define variables
	String accountNumber;
	
	// static belongs to the CLASS and not the object instance
	// final makes it a constant
	
	private static final String routingNumber = "123456";
	
	// Instance variable
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions:  unique methods
		// 1.  used to define / setup/ initialize properties of an pobject
		// 
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);	
	}
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);	
		System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);	
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1000";
		}
		else {
			Msg = "Thanks for your initial Deposit of: $" + initDeposit;
		}

			System.out.println(Msg);
			balance = initDeposit;
					
	}
	
	// Getters / setters
	
	// Allow the user to define the name.
	public void setName(String name) {
		this.name = "Mr." + name;// this means it belongs to the class.
							// name is the name that is being 
							// passed by the argument
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
		
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");
		
	}
	
	// Define Methods
	// Access Specifiers
	// public available anywhere in the project
	// protected - default is anywhere from the package- protected
	// private - only available within the class
	
	
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
		
	}
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdraw");
		
	}
	// private  can only be called from within the class.
	public void showActivity(String activity) {
		System.out.println("Showing recent activity");
		System.out.println("Your New Balance is:  $" + balance);
	}
	
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return"[NAME:"  + name + ". ACCOUNTS " + accountNumber + ". ROUTING #" + routingNumber + ". BALANCE $" + balance + " ]";
	}
}
