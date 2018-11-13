package Day_40_customclasses;

public class MovieTester {
	public static void main(String[] args) {

		Movie internship = new Movie();
		Movie gladiator = new Movie();
		Movie starWars = new Movie();

		internship.name = "internship";
		internship.length = 2;

		gladiator.name = "gladiator";
		gladiator.length = 3;

		starWars.name = "Star Wars";
		starWars.length = 4;

		internship.watch();

		System.out.println();

		gladiator.watch();

		System.out.println();
		starWars.watch();
		
		System.out.println();
		internship.price(12.99);

		System.out.println();

		gladiator.price(5);

		System.out.println();

		starWars.price(20);

		System.out.println();

	}
}
