package test;

/* 
 * An Adapter Pattern says that just "converts the interface of a class into another interface 
 * that a client wants".In other words, to provide the interface according to client requirement
 *  while using the services of a class with a different interface.
 */
public class AdapterPatternDemo {//This is the client class.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.println(targetInterface.getCreditCard());
	}

}
