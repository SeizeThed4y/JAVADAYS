package practicepublic;

import java.util.Scanner;

public class IFandElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter your age");
		int a1 = scan.nextInt();

		if (a1 >= 50) {
			
		System.out.println("You are a senior citizen");
		}
		
		else if (a1<=29&&a1>=18) {
			System.out.println("You are a young person");
		}
		 
		else if (a1 >= 30) {
			System.out.println("You are in your middle age");
		}
			
		else {
			System.out.println("You are a kid");
			
			scan.close();
		}
			

	}
}