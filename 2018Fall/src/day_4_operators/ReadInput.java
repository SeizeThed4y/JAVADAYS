package day_4_operators;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you? ");
		
		int age = input.nextInt();
		
		System.out.println(age + "...age That`s quite old!");
		
		input.close();
				

	}

}
