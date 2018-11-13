package practicepublic;

import java.util.Scanner;

public class CToF {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter Celcius degree");
		int celcius = scan.nextInt();
		
		double fehrenheit = (9.0/5 * celcius) + 32;
		
		System.out.println("Temp. in Fehrenheit " + fehrenheit);
		
		scan.close();
	}
}
