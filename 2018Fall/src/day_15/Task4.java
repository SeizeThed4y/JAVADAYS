package day_15;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type word");
		String word = scan.nextLine();
		
		
		// #1 way long way
		
//		boolean isOdd = word.length() % 2 == 1;
//		
//		System.out.println("is Odd: " + isOdd);
//		
//		boolean has3more = word.length() >= 3;
//		
//		
//		System.out.println("has 3 or more: " + has3more);
//		
//		
//		if(isOdd && has3more) {
//			//prin t the character in the middle of the word.
//			
//			int length = word.length();
//			System.out.println("length: "+ length);
//			int mid = length / 2;
//			System.out.println("mid: " + mid);
//			System.out.println(word.charAt(mid));
//			
//		}
		
		
		// #2 way short way
		int wordCount = word.length();

		if ((wordCount % 2 == 1) && (wordCount >= 3)) {
			System.out.println(word.charAt(wordCount / 2));
		}

	}

}
