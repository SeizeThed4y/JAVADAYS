package Day_32_methodswithreturn01;

public class Review1 {

	/*
	 * Instructions from your teacher: Create a method called next3 . This method
	 * gets an int argument and prints the next 3 numbers after that number. Call
	 * the method from main method and pass num to it.
	 * 
	 * enter number 1 next 3 are: 2 3 4
	 * 
	 * (put a space between numbers)
	 */

	public static void main(String[] args) {

		myMethod4("Saturday", "Java", 5);

		myMethod3("Saturday", "Java");
	}

	public static void myMethod1() {

		String myClass = "java methods";

		String day = " Saturday";
		System.out.println("Today class is " + day + " we are studying " + myClass);

	}

	public static void myMethod2(String day) {
		String myClass = "Java Methods";

		System.out.println("Today class is " + day + " we are studying " + myClass);

	}

	public static void myMethod3(String day, String topic) {
		System.out.println("Today is " + day + " and we are studying " + topic);

	}

	public static void myMethod4(String day, String topic, int hours) {
		System.out.println(
				"Today class is " + day + " we are studying " + topic + " and it will take " + hours + " hours ");
	}

}
