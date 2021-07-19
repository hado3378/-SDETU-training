package basic;

public class Strings {

	public static void main(String[] args) {
		String wordChoice = "Rings";
		String bookTitle;
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book of " + bookTitle +  " contains the word " + wordChoice);
		}
	
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println(" The browser is chrome");
		}
		
		String firstName = "Ha";
		String lastName = "Short";
		String SSN = "98641259";
		
		//print the innitals plus 4 digits of SSN
		System.out.println("There are " + SSN.length()+ " digits in your SSN");
		
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 5));
		System.out.println(SSN.substring(5));

	}

}
