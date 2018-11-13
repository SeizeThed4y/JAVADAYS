package Day_17_Review_Section2;

import java.util.Scanner;

public class Strings02 {

	public static void main(String[] args) {

		// create 1 string variable
		// if first and last chars are same print "first and last same"
		// if second and second from the last are same = print " seconds same "

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String w = scan.next();
		
		

		if (w.length() >= 4) {
				// first and last chars same
			if (w.charAt(0) == w.charAt(w.length() - 1)) {	
				System.out.println("Firsts are same");
			
				// second char and from last 2nd char are same 
			} else if (w.charAt(1) == w.charAt(w.length() - 2)) {
				System.out.println("Seconds same");
			}
		} else {
			System.out.println("ERROR: at least 4 chars required for this program");
		}
		
		
		
		
	}

}
