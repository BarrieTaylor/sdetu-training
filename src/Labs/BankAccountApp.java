package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465329874", 1000);
		BankAccount acc2 = new BankAccount("895329874", 2000);
		BankAccount acc3 = new BankAccount("4895329874", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.toString();
		System.out.println(acc1.toString());
		acc1.accrue();

	}
}




class BankAccount implements IInterest {
	// Properties of bank account
	// encapsulation so private
	private static int iD = 1000;				// Internal ID.  Static belongs to class
	private String accountNumber;  // iD + random 2 - digit number + first 2 of ssn
	private static final String routingNumber = "005400657";    // static for all accounts?
																// final makes it a constant
	
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		System.out.println(iD);
		setAccountNumber();
	}
	
	// generating account number
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		System.out.println(random);
		accountNumber = iD + "" + random  + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name; // instance variable = local variable
	}
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
		
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making Deposit: " + amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		//System.out.println("After Interest: " + balance);
		showBalance();
	
	}
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber+ "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance " + balance + "]"; 
	}
}

	

