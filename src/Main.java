import java.time.LocalDate;

/**
* Account Book for personal use
*
* @author  Jeyun Kim
* @version 0.1
* @since   2021-08-07 
*/

public class Main {
	public static void main(String args[]) {
		CreditCard C = new CreditCard("CreditCard", "1234123412341234", 150.50, 130.30, "name", "user", 15000, 15, LocalDate.of(2015, 06, 10));
		C.printInfo(C);
		C.purchase(150);
		System.out.println(C.getCurrentBalance());
	}
}
