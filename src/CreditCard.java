import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class CreditCard extends Account {
	
	// Instance Variables
	LocalDate today = LocalDate.now();
	private String cardName;
	private String user;
	private int limit;
	private int dueDate;	
	private LocalDate openDate;
	private int age;
	
	// Constructor
	CreditCard(String type, String accountNumber, double currentBalance, double statementBalance, String cardName, String user, int limit, int dueDate, LocalDate openDate) {
		super(type, accountNumber, currentBalance, statementBalance);
		this.name = name;
		this.user = user;
		this.limit = limit;
		this.dueDate = dueDate;
		this.openDate = openDate;
	}

	// Accessor getter
	public String getCardName() { return cardName; }
	public String getUser() { return user; }
	public int getLimit() { return limit; }
	public int getDueDate() { return dueDate; }
	public LocalDate getOpenDate() { return openDate; }
	public int getAge() { return age = Period.between(this.openDate, this.today).getYears(); }

	// Accessor setter
	public void setName(String name) { this.name = name; }
	public void setUser(String user) {	this.user = user; }
	public void setLimit(int limit) { this.limit = limit; }
	public void setDueDate(int dueDate) { this.dueDate = dueDate; }
	public void setOpenDate(LocalDate openDate) {this.openDate = openDate; }
	
	public static void printInfo(CreditCard c) {
		System.out.println("Name = " + c.getCardName());
		System.out.println("User = " + c.getUser());
		Account.printInfo(c);
		System.out.println("Limit = " + c.getLimit());
		System.out.println("Due Date = " + c.getDueDate());	
		System.out.println("Open Date = " + c.getOpenDate());
		System.out.println("Age = " + c.getAge());
	}
}
