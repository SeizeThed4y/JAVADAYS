package Day_30;

public class Cooking {
	public static void main(String[] args) {
		
		
		/*
		 * method weWillCook accepts  food name and prints "Today we are cooking "food name " "
		 * 
		*/
		
		/*
		 * method youWillNeed, accepts a String with things we need
		 * prints " we need following items: " 
		 */
		
		/*
		 * method cookFor accepts minutes and way of cooking and prints:
		 * 
		 * "You need to cook for minutes by wayOfCooking
		 */
		
		/*
		 * method ready , does not accept any parameters, prints :
		 * 	"Meal is ready ! Enjoy!"
		
		 */
	
	
	weWillCook("Boild Egg");
	youWillneed("Eggs , water , and bowl");
	cookFor(10, "boil");
	ready();
	
	}
	
	
	public static void weWillCook(String foodName) {
		System.out.println("Today we are cooking " +  foodName);
	}
	
	public static void youWillneed (String needs) {
		System.out.println("We need following items: " + needs );
		
	}
	
	public static void cookFor(int minutes,String wayOfCook) {
		System.out.println("You need to cook for " + minutes + "minutes by " + wayOfCook +".");
	}
	
	public static void ready() {
		System.out.println("Meail is ready ! Enjoy !");
	}

}
