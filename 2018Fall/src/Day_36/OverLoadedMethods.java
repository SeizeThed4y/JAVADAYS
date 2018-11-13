package Day_36;

public class OverLoadedMethods {
	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(add(2.2, 3, 4));

		System.out.println(playGame(4, "cs"));

	}

	/*
	 * 2 methods : add
	 * 
	 * 1st: add params: 2 omts return : int
	 * 
	 * 
	 * 
	 * 
	 * 2nd: add
	 * 
	 * params: 3 doubles return : double
	 * 
	 */

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static double add(double d1, double d2, double d3) {

		return d1 + d2 + d3;
	}

	/*
	 * gamename, numberOfplayers
	 * 
	 * print Playing [game\ with [that many] player
	 */

	public static boolean playGame(String gameName, int numberOfplayer) {

		System.out.println("Playing " + gameName + " and " + numberOfplayer);

		return numberOfplayer >= 2;

	}

	public static boolean playGame(int numberOfplayer, String gameName) {

		System.out.println("Playing " + gameName + " and " + numberOfplayer);

		return numberOfplayer >= 2;

	}

	/*
	 * Method: Work
	 * 
	 * 1. param: string, JobType
	 * 
	 * return: boolean
	 * 
	 * if job is sdet or developer, then true else false
	 * 
	 * print : "Working as " + jobType + "and it is fun"
	 * 
	 * 
	 * 2.param: int --> hours
	 * 
	 * return double --> salary
	 * 
	 */

	public static boolean Work(String jobType) {

		System.out.println("Working as < " + jobType + " > and it is fun");

		if (jobType.equalsIgnoreCase("sdet") || jobType.equalsIgnoreCase("developer")) {
			System.out.println("Working as < " + jobType + " > and it is fun");
			return true;
		} else {
			return false;
		}

		// return jobType.equalsIgnoreCase("sdet") ||
		// jobType.equalsIgnoreCase("developer");
	}

	public static double Work(int hours, double salary) {

		System.out.println("Worked " + hours + "hours and made " + salary);

		salary = hours * salary;

		return salary;
	}
	
	
	
	// ARRAYLIST --> IS A COLLECTION TYPE IN JAVA
	//			 --> ANOTHER DATA STRUCTURE LIKE ARRAY.
	
	//unlike arrays, arraylist is dynamic, we can add, update, remove elements any time. Arraylist not fixed size.
	
	
	
	// Arrays are great to work with multiple set of data, but if your data count is changing frequently, then since arrays are fixed size, it might not be a good fit
	
	//When ever we work with dynamic collection of data, then Arraylist is a better option.
	
	
	
	//ArrayList is the most popular data stucture in java that is used in development!!!
	
	// How to create an ArrayList
	
	
		/*
		 * 1. General Arraylist that can accept any type.
		 * 
		 * ArrayList list = new ArrayList();
		 * 
		 * How to add new data into arraylist
		 * list.add("java");
		 * 
		 * 
		 */

}
