
public class CreditCard extends Account {
	
	// Instance Variables
	private String name;
	private String user;
	private int limit;
	private int dueDate;
	
	// Constructor
	CreditCard(String type, String accountNumber, double currentBalance, double statementBalance, String name, String user, int limit, int dueDate) {
		super(type, accountNumber, currentBalance, statementBalance);
		this.name = name;
		this.user = user;
		this.limit = limit;
		this.dueDate = dueDate;
	}

	// Accessor getter
	public String getName() { return name; }
	public String getUser() { return user; }
	public int getLimit() { return limit; }

	public int getDueDate() { return dueDate; }

	// Accessor setter
	public void setName(String name) { this.name = name; }
	public void setUser(String user) {	this.user = user; }
	public void setLimit(int limit) { this.limit = limit; }
	public void setDueDate(int dueDate) { this.dueDate = dueDate; }
	
	public static void printInfo(CreditCard c) {
		System.out.println("Name = " + c.getName());
		System.out.println("User = " + c.getUser());
		Account.printInfo(c);
		System.out.println("Limit = " + c.getLimit());
		System.out.println("Due Date = " + c.getDueDate());	
	}
}
