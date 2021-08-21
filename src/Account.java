
public class Account extends Bank{
	
	// Instance Variables
	private String type;
	private String accountNumber;
	private double currentBalance;
	private double statementBalance;
	
	// Constructor
	public Account(String type, String accountNumber, double currentBalance, double statementBalance) {
		this.type = type;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
		this.statementBalance = statementBalance;
	}

	// Accessor getter
	public String getType() { return type; }
	public String getAccountNumber() { return accountNumber.substring(accountNumber.length() - 4); }
	public double getCurrentBalance() { return currentBalance; }
	public double getStatementBalance() { return statementBalance; }
	
	// Accessor setter
	public void setType(String type) { this.type = type; }
	public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
	public void setCurrentBalance(double currentBalance) { this.currentBalance = currentBalance; }
	public void setStatementBalance(double statementBalance) { this.statementBalance = statementBalance; }
	
	public void purchase(double amount) {
		this.currentBalance += amount;
	}
	
	public void refund(double amount) {
		this.currentBalance -= amount;
	}
	
	public static void printInfo(Account a) {
		System.out.println("Account Type = " + a.getType());
		System.out.println("Account Number = ..." + a.getAccountNumber());
		System.out.println("Current Balance = " + a.getCurrentBalance());
		System.out.println("Statement Balance = " + a.getStatementBalance());
		System.out.println("Next Statment Balance Estimate = " + (a.getCurrentBalance() - a.getStatementBalance()));	
	}
}
