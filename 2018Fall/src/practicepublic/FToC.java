package practicepublic;

import java.util.Scanner;

public class FToC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter fahrenheit degree");
		int fahrenheit = scan.nextInt();
		
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		
		
		System.out.println("it is " + celsius + " in Celcius");
		
		
		
		scan.close();
		
		
	}

}
