
public class Saving extends Account{
	int transactionLimit;
	int withdrawLimit;
	
	Saving(String type, String accountNumber, double currentBalance, double statementBalance, int transactionLimit) {
		super(type, accountNumber, currentBalance, statementBalance);
		this.transactionLimit = transactionLimit;
	}

	
	
}
