package basic;

public class SalaryCalculator {

	public static void main(String[] args) {
     //Declare a variable
     String career;
     
     System.out.println(" Program is starting");
     //Defined a variable
     career = "Software Developer";
     System.out.println("My career is " + career);
    
     
     //Declare &define
     
     int hourperwk = 38;
     int weekperYear = 52;
     float rate = 60.50f;
     double salary = hourperwk*weekperYear*rate;
     
     
     System.out.println(" My salary is: "+ salary + " AUD");
     

	}

}
