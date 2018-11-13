package HomeWork;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = scan.nextInt();

		
		int result= 0;
		
		for (int i = 1; i <= 10 ; i++) {
			result = num1 * i;
			
			if(num1 <= 10 && num1 > 0) {
				
				System.out.println(num1 + "x" + i + "=" + result);
			}else if(num1 > 10){
				System.out.println(num1 + "x" + i + "=" + result);
				
			}else if(num1 <= 0) {
				System.out.println("Number cannot be negative or zero");
				break;
			}
			
		}
		scan.close();
		
	
		
		
		
		
	}

}
