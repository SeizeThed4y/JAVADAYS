package Day_40_customclasses;

public class Movie {
	
	
	String name;
	int length;
	
	
	public void watch() {
		System.out.println("Watching movie : " + name);
		System.out.println("It is : " + length +" hours");
	}
	
	public void price(double price) {
		System.out.println("Buying " + name + " for $" +price);
	}

}
