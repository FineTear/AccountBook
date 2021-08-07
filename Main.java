/**
* Account Book for personal use
*
* @author  Jeyun Kim
* @version 0.1
* @since   2021-08-07 
*/

public class Main {
	public static void main(String args[]) {
		CreditCard C = new CreditCard("Credit Card", "1234123412341234", 1234.56, 123.45, "Name", "User", 12000, 15);
		C.printInfo(C);
		
	}
}
