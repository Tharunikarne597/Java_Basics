public class conditionalstmts {

	public static void main(String[] args) {
		boolean isRaining = false;
        //if else
		if (isRaining) {
		  System.out.println("Bring an umbrella!");
		} else {
		  System.out.println("No rain today, no need for an umbrella!");
		}
		
		
		//else if
		int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

		if (weather == 1) {
		  System.out.println("Bring an umbrella.");
		} else if (weather == 2) {
		  System.out.println("Wear sunglasses.");
		} else {
		  System.out.println("Just go outside normally.");
		}
		
		
}
}
