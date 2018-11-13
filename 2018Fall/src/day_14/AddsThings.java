package day_14;

import java.util.Scanner;

public class AddsThings {

	public static void main(String[] args) {

		
		
		
		
		// concat ---> adds two strings together
		
		
		
		String domain = "@cybertekschool.edu";
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username: ");
		String entry = scan.nextLine();
		
		
		System.out.println("This is your new school email");
		// entry.concat(domain) ===== entry + domain
		// entry.concat(domain) == "A" + "B"
		
		// concat = +
		
		System.out.println(entry.concat(domain));
		//System.out.println(entry+domain);
		
		
		System.out.println("a".concat("b").concat("c").concat("d"));
		
		scan.close();

	}

}
