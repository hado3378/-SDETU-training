package oop;

public class loanAccount implements IRate{

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase Rate");
		
	}
	
	public void setTerm(int term) {
		System.out.println(" Seting the term: " +term + " years");
	}

	 public void serAmortSchedule() {
		 System.out.println("Amortisation schedule");
	 }
}
