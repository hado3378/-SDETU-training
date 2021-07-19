package oop;

public class AccountApp {

	public static void main(String[] args) {
      loanAccount la = new loanAccount();
      la.increaseRate();
      la.setRate();
      la.serAmortSchedule();
      la.setTerm(20);
      //Polymorphism changes where we are pointing
      IRate account1 = new loanAccount(); // we create the variable based on IRate property but point it to loanAccount property
      account1.increaseRate();
      account1.setRate();
		
		
      

	}

}
