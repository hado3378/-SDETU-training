package basic;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		
		String [] cities = {"NY", "Tokyo", "Sydney"};
		for (String i : cities) {
		System.out.println(i);
		}
		
		System.out.println("************************");
		
		//Declare the array with only size
		String[] states = new String[5];
		
		states [0] = " NSW";
		states [1] = " VIC";
		states [2] = " Perth";
		states [3] = " Western";
		states [4] = " South";
		for (String a : states ) {
		System.out.println(a);
		}
		
		
		System.out.println("************************");
       // Declare array
	String[] countries;
	
	  //define the array
	countries = new String[2];
	countries[0] = "Australia";
	countries[1] = "Vietnam";
	for( String b : countries) {
 System.out.println(b);
	}
	
}
}
