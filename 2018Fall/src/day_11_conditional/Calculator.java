package day_11_conditional;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//double num1, num2, result;
		
		
		//num1 = 5;
		//num2 = 3;
		//operator = '+';
		//operator = '-';
		//operator = '*';
		//operator = '%';
		//operator = '/';
		
		
		
		//char operator;
		
		
		
		
		double result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter num1");
		double num1 = scan.nextDouble();
		System.out.println("Please Enter num2");
		double num2 = scan.nextDouble();
		System.out.println("Please Enter The Operator");
		char operator = scan.next().charAt(0);
		
	
		switch(operator) {
		case '+':
			result = num1 + num2;
			
			break;
		case '-':
			result = num1 - num2;
			
			break;
		case '*':
			result = num1 * num2;
			
			break;
		case'%':
			result = num1 % num2;
		
			break;
		case'/':
			result = num1 / num2;
		
			break;
			default:
				System.out.println("ERROR: Invalid Operator or Number");
			return; // dont run the rest of code below
					// get out of main method
		}
		
		System.out.println(result);
		scan.close();

	}

}
