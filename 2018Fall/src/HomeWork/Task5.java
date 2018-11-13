package HomeWork;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the word");
		String word = scan.next();
		
		//String s = "abc";
		String result = "";
		int i = 0;
		while (i < word.length()){
		    char a = word.charAt(i);
		    result = result + a + a;
		    i++;
		}
		System.out.println(result);
		scan.close();

	}

}
