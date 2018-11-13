package day_12_java;

public class StringClass {

	public static void main(String[] args) {

		String name = "Feruk";
		/*
		 * 1. Declaring Veriable --> String name -> variable name is name and type is
		 * String -> Hey Java, I want you to create a variable called name -> that can
		 * store String Object.
		 * 
		 * 
		 * 2. Assign value - String object anything in double quotes is String Object
		 * with that value.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name);

		name = name.toUpperCase();
		System.out.println(name);

		System.out.println(name);

		System.out.println(name.length());

		int count = name.length();

		System.out.println(count);
		
		System.out.println(name.charAt(0));
			if(name.charAt(0) == 'F') {
				System.out.println("F is the first letter");
			}else {
				System.out.println("F is not the first letter");
			}
			
			
			char secondChar = name.charAt(1);
			System.out.println(secondChar);

	}

}
