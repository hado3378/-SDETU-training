package oop;

public class BankAccount implements IRate{ // implements inteface
	
	//Define variable
		String accountNumber;
	
		
		//static avairalbe: belongs to the class not the object instance
		//final constant( often static final
	private static final String routingNumber ="013546";
	
	//Instance variable, belongs to the object
	private String name;
	String accountType;
	double newBalance;
	
	// Constructor definitions: unique methods
	//1 They are used to define/setup/ initialize properties of an object
	//2. Constructors are Implicity called upon instantiation=> get call immediately when we call obj
	// The same name as the class itself
	//4. Constructor have no return type
	
	 BankAccount() {
		System.out.println(" new account created");
	}
	
	
	
	// these are local varialbes in the below blocks
	BankAccount (String accountType, double iniDeposit) {
		System.out.println(" New account : " +accountType);
		System.out.println(" Initial Deposit of : " +iniDeposit);
		String msg=null;
		if (iniDeposit < 1000) {
			msg = " ERROR: minimum deposit must be at least $1000.00";
			
		}else {
				msg = " Thank for your initial deposit of " + iniDeposit;
			}
			System.out.println(msg);
			
			newBalance =  iniDeposit;
		}
		
	//Getters and setters
	
	//allow the user to define the name
	public void setName(String name) {
		this.name =name;  // instant (class) varialbe == local variable
	}
	public String getName() {
		return name;
	}
	
	public void setRate() {
		System.out.println("Seting interest rate");
	}
	
	public void increaseRate() {
		System.out.println("Increase interest rate");
		
	}
	
	//define methods
	public void deposit(double amount) {//accessable from anywhere in the project
		showActivity("Deposit of", amount);
		newBalance = newBalance + amount;
	}
	
	
	void withdraw(double amount) { //accessable from anywhere in the package
		showActivity("withdraw of", amount);
		newBalance = newBalance - amount;
				
				
	}
	
	//Private: can only called from within the class
	private void showActivity(String activity, double amount) {
		System.out.println(" Your recent activity: "+ activity + amount);
	}
	
	void checkBalance() {
		System.out.println("New balance " + newBalance);
		
		
		
	}
	void getStatus() {
		
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", accountType=" + accountType
				+ ", newBalance=" + newBalance + "]";
	}
    
	
    	
    }

