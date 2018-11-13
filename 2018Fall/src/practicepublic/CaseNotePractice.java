package practicepublic;

import java.util.Scanner;

public class CaseNotePractice {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the word");
	
	String word = scan.next();
	
	
	if(word.length() >= 4) {
		if(word.contains("bad")) {
			System.out.println();
		}
	}
}
	
}
