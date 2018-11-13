package day_14;

import java.util.Scanner;

public class StatingTheObvious {

	public static void main(String[] args) {

		// what is your email
		// donaldtheduck@gmail.com
		// oh so you have gmail

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your email");
		String email = scan.next();

		// for substring
		// donaldtheduck@gmail.com
		System.out.println(email.substring(13, 19));

		/*
		 * 1 find the location of @ sign 2 find the location of the .
		 * 
		 * substring using those two location
		 * 
		 */

		// To find the sign , text , letter etc. of location use ( indexOf(); )

		// it is getting the location of @ sign and adding one
		// if we dont add 1, it will include @sign in the substring
		int start = email.indexOf("@") + 1;

		System.out.println(start);
		System.out.println(email.substring(start));

		int end = email.indexOf(".");
		System.out.println(end);

		System.out.println("Oh so you have a " + email.substring(start, end));

		// ~~~ how to find the "gmail" with CONTAINS ~~//

//		if(email.contains("gmail")) {
//			System.out.println("Oh so you have gmail");
//		}else {
//			System.out.println("Oh so you dont have gmail");
//		}

		scan.close();
	}

}
