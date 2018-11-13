package HomeWork;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("first number");
		int num1 = scan.nextInt();
		System.out.println("second number");
		int num2 = scan.nextInt();
		System.out.println("third number");
		int num3 = scan.nextInt();
		
		
		do {
			if(num1 > num2 && num1 > num3) {
				System.out.println("Largest number: " + num1);
				break;
			}else if(num2 > num1 && num2 > num3) {
				System.out.println("Largest number: " + num2);
				break;
			}else if(num3 > num1 && num3 > num2) {
				System.out.println("Largest number: " + num3);
				break;
			}else {
				System.out.println("All numbers are same");
			}
			
			
			
			
			
		}while(num1 != num2 && num1 != num3 && num3 != num2 );
		System.out.println("Sum: "+ (num1+num2+num3));
		
		scan.close();
	}

}
