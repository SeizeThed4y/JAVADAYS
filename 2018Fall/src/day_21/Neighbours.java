package day_21;

import java.util.Scanner;

public class Neighbours {

	public static void main(String[] args) {
		/*
		 * 
		 * String word and you need to check for same character side by side
		 * 
		 * 
		 * if found say "baap - " character
		 * 
		 * ex:
		 * 
		 * abccddefg
		 * 
		 * cc Baap - c
		 * 
		 * dd Baap - d
		 * 
		 * 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1st word");
		String word = scan.next();
		
		
		for(int i = 0; i < word.length(); i++ ){
			
			if(word.charAt(i) == word.charAt(i+1)) {
				System.out.println("Beep - " + word.charAt(i));
			}
			
		}

	}

}
