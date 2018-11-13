package Day_36;

public class Overloading {

	public static void main(String[] args) {

		// In same class, we cannot have 2 methods with same name and parameters.

		// ~~~~ Method overloading

		// when we have 2 methods with SAME NAME and DIFFERENT PARAMATERS --> it calls
		// method overloading

	}

	public static void happyBirthday() {
		System.out.println("Happy Birthday! Anastasia!");
	}

	public static void happyBirthday(String wishes) {
		System.out.println("Happy Birthday! Anastasia!");
		
		System.out.println(wishes);
	}

	public static void happyBirthday(String wishes, String gift) {
		System.out.println("Happy Birthday! Anastasia!");
		System.out.println(wishes);
		
	}
	
	
	public static void happyBirthday(int wishes, String gift) {
		System.out.println("Happy Birthday! Anastasia!");
		System.out.println(wishes);
	}
	
	
	
	public static void happyBirthday(String gift, int wishes) {
		System.out.println("Happy Birthday! Anastasia!");
		System.out.println(wishes);
	}
	
	/*
	 * Method Signature:
	 * 
	 *  consist of: name of the method, number of parameters and their types
	 */
	
	
	public static void m1(int n, String str) {
		// above method singature is:
		/*
		 * 	name of the method:   M1
		 * 	2 Parameters : int n  / String str;
		 * 
		 * 
		 * 
		 * Return types or other modifiers are not part of method signature.
		 */
	}
}
