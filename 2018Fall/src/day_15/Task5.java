package day_15;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next();
		int wordCount = word.length();
		
		
		if((wordCount % 2 == 1) && (wordCount >= 5)) {
			System.out.println(word.substring((wordCount -3)/2,(wordCount+3)/2));
		}else {
			System.out.println("Your word length do not match to odd number or less than 5");
		}
	}

}
