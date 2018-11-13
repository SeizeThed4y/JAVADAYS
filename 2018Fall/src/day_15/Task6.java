package day_15;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next();
		
		String startWord = "x";
		
		if(word.startsWith(startWord)) {
			System.out.println(word.substring(1));
		}else {
			System.out.println("Your word is not starting with X");
		}
	}

}
