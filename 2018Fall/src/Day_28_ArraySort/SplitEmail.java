package Day_28_ArraySort;

public class SplitEmail {
	public static void main(String[] args) {
		/*
		 * Given a String variable email, write code using split method to print email
		 * id and domain in separate lines.
		 * 
		 * Example: email -> info@cybertekschool.com Print: Email id: info Email domain:
		 * cybertekschool.com
		 * 
		 * 
		 * If email contains no @ character or multiple @ characters then print invalid
		 * email:
		 * 
		 * email -> hello-gmail.com print: invalid email
		 * 
		 * email -> my@fancy@email.com print: invalid email
		 */

		String email = "info@cybertek.com";
		
		
		
		

		String[] splitted = email.split("@");

		if(splitted.length == 2 ) {
			System.out.println("Email id: " + splitted[0]);
			System.out.println("Email domain: " + splitted[1]);
		}else { 
			System.out.println("invalid email");
			
			
		}
			
		

		

	}

}
