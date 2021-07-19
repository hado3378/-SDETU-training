package basic;

public class Weather {

	public static void main(String[] args) {
		//the program will advise what to wear based on the weather (temperature)
		//declare & define the variable =temp
		
		double temp = 15;
		System.out.println( "Hello: the temp today is: " + temp);
		//conditional logic
		
		if (temp > 30) {
			System.out.println(" it is hot. Wear short and t-shirt");
		}
		else if (temp < 20){
			System.out.println(" it is litte colder. Wear jackets and jeans");
		}
		else {
			System.out.println("it is pleasant. Wear long sleave and trousers");
		}
	}

}
