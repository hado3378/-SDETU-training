package basic;

public class NumberCal {
	public static void main(String[] args) {
		System.out.println(" *********Program is starting********* ");
		
		printName();
		
		int numA =10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println(" Multiple of " + numA + " and " + numB+ " is " + multiNumbers(numA, numB));
	}
	
	//void mean it will do some work then get out, will not return
	
	// function/ method no parameter no return type. When it is called in main method, no need varialbes
	static void printName() { 
		System.out.println("My name is Ha");
	}
	// function with parameter, no return time. to call it in main method, new variables must be declared and define. Print out need also created in local method
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println(" The sum of nubmers " + numberA + " + " + numberB +" is " + sum);
		
		
	}
	// function has return type with parameter. new varialbes must be declared and defined. 
	//when method is called, it is exceuted and return value. 
	//so that need create print out in main method.
	static int multiNumbers(int valueA, int valueB) {
		// paramative method; do some work and return the value
		 int product = valueA*valueB;
		 addNumbers(product, product); // with static method, belong to the class, we can call it anywhere in the class
		 return product;
	}
	

}
