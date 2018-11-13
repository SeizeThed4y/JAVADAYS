package day_6_operators_boolean;

public class PostVsPre {

	public static void main(String[] args) {
		
		int number = 10;
		
		int number2 = number++; // 1. assign value to variable
								//2.increase value by one	
		
		
		System.out.println("number2 : " + number2);
		System.out.println("Number: " + number );
		
		
		int tomatoes = 5;
		int bag = ++tomatoes;//1. add one
							//2. assign value to bag
		
		
		System.out.println("Tomatoes: " + tomatoes);
		System.out.println("in the bag: " + bag);
	}

}
