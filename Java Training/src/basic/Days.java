package basic;

public class Days {
	
	

	public static void main(String[] args) {
		//Execute different block of code based on the value of a condition = Switch
		
		String dayOfWeek = "Monday";
		
		switch (dayOfWeek) {
		case "Monday": {
			System.out.println(" Today is Monday ");
			break;
		}
		case "Tuesday": {
			System.out.println(" Today is Tuesday ");
			break;
		}
		case "Wednesday": {
			System.out.println(" Today is Wednesday ");
			break;  //  get out of the block
		}
		case "Thursday": {
			System.out.println(" Today is Thursday ");
			break;
		}
		case "Friday": {
			System.out.println(" Today is Friday ");
			break;
		}
		case "Satuday": {
			System.out.println(" Today is Satuday ");
			break;
		}
		case "Sunday": {
			System.out.println(" Today is Sunday ");
			break;	
		}
					
		
		default: {
			throw new IllegalArgumentException("Wrrong enter. Please check your entry again");
			
		}
	  	
	}
		
	}
}
	


