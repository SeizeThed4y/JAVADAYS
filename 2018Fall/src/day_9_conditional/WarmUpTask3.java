package day_9_conditional;

import java.util.Scanner;

public class WarmUpTask3 {

	public static void main(String[] args) {
		
		
//				? means if
//				: is else / else if

			Scanner scan = new Scanner(System.in);
			
			int x,y,z; String myString;
			
			System.out.println("Enter x,y,z Values: ");
			x = scan.nextInt();
			y = scan.nextInt();
			z = scan.nextInt();
			
			myString= (x>y)?("X is larger"):(y>x && y>z)?("Y is larger number"):(z>y && z>x)?("Z is the larger number"):("All numbers are equal");
			System.out.println(myString);
			
			scan.close();
		
		
		
	}

}
