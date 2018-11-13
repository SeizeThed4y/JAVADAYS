package Day_17_Review_Section2;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		// take a String country Name and abbreviate it by taking first 2 letters
		// countryName -> Bangladesh > BA . toUppercase()

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Country Name");
		String countryName = scan.next();

//		String abbreviate = countryName.substring(0, 2).toUpperCase();
//		
//		System.out.println(abbreviate);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		// ternanry conditions usung ? :
		// check if abbreviated is 2 chars:
		// if true --> say " 2 chars detected"
		// else say " 2 chars were not found"

//		System.out.println(countryName.length() == 2 ? "2 chars detected" : "2 chars werent found");
//
//		String msg1 = " 2 chars detected";
//		String msg2 = " 2 chars were not found";
//
//		String result = countryName.length() == 2 ? msg1 : msg2;
//		System.out.println(result);

		/*
		 * if 2 chars { 
		 * if first char is U{ say "Maybe USA" }else{ say
		 * "Not USA for sure"
		 * 
		 * }else{ say 2 chars were not found
		 * 
		 * }
		 * 
		 */

			System.out.println(countryName.length() == 2?countryName.charAt(0) == 'U'?"Maybe USA":"Not USA FOR SURE":"2 chars were not found" );
			

			
		
		
	}

}
