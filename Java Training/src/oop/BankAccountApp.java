package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creat a new account
		
	BankAccount acc1 = new BankAccount("Every Account", 5000); // instantiate an obj
	acc1.accountNumber = "123456";
	//acc1.name = " Ha ";
	
	//with encapsulation public API methodsto pass the argument
	acc1.setName(" Minh Do");
	System.out.println(acc1.getName());
	
	acc1.accountNumber = "234695";
	acc1.checkBalance();
	acc1.setRate();
	acc1.increaseRate();
	acc1.deposit(500);
	
	//Polymorphism through overriding
	System.out.println(acc1.toString());
	
	//Polymorphism are call the same constructors but different arguments. Polymorphism through overloading
	BankAccount acc2 = new BankAccount(" Checking Account", 2000);
	acc2.accountNumber = "456789";
	
	BankAccount acc3 = new BankAccount("Saving Account ", 1000);
	acc3.accountNumber = "789012";
	acc3.checkBalance();
	
	/* Demo for inheritance
	CDAccount cd1 = new CDAccount();
	cd1.newBalance = 3000;
	cd1.name = "Minh";
	cd1.compound();
	System.out.println(cd1.toString());*/
	}

}
