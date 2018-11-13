package Day_17_Review_Section2;

public class Strings01 {

	public static void main(String[] args) {

		// String is a combination of chars
		String greeting = "Hellow World!";

		// print number of characters

		System.out.println(greeting.length());

		int len = greeting.length();
		System.out.println("length: " + len);

		
		// primnt the first character
		
		System.out.println(greeting.charAt(0));
		char firstCh = greeting.charAt(0);
		System.out.println("First Char: " + firstCh);
		
		// print last character . try to use len variable or dont use len variable 
		// len variable or dont use len variable
		System.out.println(greeting.charAt(13));
		
		//StringIndexOutOfBoundsException:
		
		System.out.println(greeting.charAt(len-1));
		
		
		char lastCh = greeting.charAt(greeting.length() -1 );
		
		System.out.println("Last Char" + lastCh);
	}

}
