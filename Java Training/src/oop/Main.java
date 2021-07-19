package oop;

public class Main {

	public static void main(String[] args) {
		//create new object student
		
		student st1 = new student("HaDo", "247259523649", "1978");
		student st2 = new student("MinhDo", "2369885312", "1982");
		student st3 = new student("TomyDo", "242519683521", "1991");
		st1.setEmail();
		st1.setID();
		st2.setEmail();
		st2.setID();
		st3.setEmail();
		st3.setID();

	}

}
