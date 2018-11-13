package Day_43_static_constructors02;

public class AtRestaurant {
	
	public static void main(String[] args) {
		
		
		Dinner Dad = new Dinner();
		Dinner Mom = new Dinner();
		Dinner Kid = new Dinner();
		
		
		
		
		System.out.println("Pizza Slices: " + Dinner.pizzaSlices);
		
		
		Dad.takeASlice(1);
		Mom.takeASlice(1);
		Kid.takeASlice(3);
		
		
		
		System.out.println("Pizza Slices: " + Dinner.pizzaSlices);
		
		
		
		System.out.println("Pizza slices: " + Mom.pizzaSlices);
		Mom.takeASlice();
		System.out.println(Kid.pizzaSlices);
		
		
		
		
		
		
		
		
		
		
	}

}
