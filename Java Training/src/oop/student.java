package oop;

public class student {
	
        private static int ID=1000;
	    private String name;
		private String ssn;
		private String birthYear;
	    private String email; 
	    private String userID;
	
	
	public student(String name, String ssn, String birthYear ) {
		ID++;
		this.name = name;
		this.ssn = ssn;
		this.birthYear = birthYear;
		
	}

	
	public void setEmail() {
		email = name.toLowerCase() + birthYear +"@gmail.com";
		System.out.println("Your email is: " + email);
	}
   
	 public void setID() {
		 int ranNumber = (int)Math.random()* 10000; 
		 userID = ID + ranNumber + ssn.substring(6) ;
		 System.out.println(userID);
		 
	 }
}
