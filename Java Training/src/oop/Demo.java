package oop;

class Person {
	
	String name; 
	String email;
	
	
	// to make it as method, add void
	void walk() {
		System.out.println( name + " is walking");
		
	}
	
	
	void eat() {
		System.out.println( name + " is eating");
			
	}
}
	
	


public class Demo {

	public static void main(String[] args) {
        		
	// Initializing a object
		
		Person person1 = new Person();
		
		//Define some properties for that obj
		
		person1.name = "Ha";
		person1.email =" hado@gmail.com";
		
		// abstraction
		person1.eat();
		person1.walk();
		
	}
}

	
	