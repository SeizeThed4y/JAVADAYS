package practicepublic;

import java.util.Scanner;

public class NumberToWords2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		
		
		String word1,word2,word3;
		
		int num1=number/100;
		int num2=(number%100)/10;
		int num3=(number%100)%10;
		
	
		switch(number) {
		case(1):
			word3 = "one hundred";
		}

	}

}
