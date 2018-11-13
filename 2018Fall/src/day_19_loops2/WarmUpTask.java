package day_19_loops2;




//1.  Write a program that takes string word and converts first letter to uppercase and the rest to lowercase. Print it after conversion.
//2.  Write a program to print numbers from 1 to 10.
//in same line, separated by space
//3.  Write a program to print numbers from 10 to 1.
//in same line, separated by space



import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Word");
		String word = scan.next();
		
		
		System.out.println(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
		
		
		
		
		
int a = 1;
		
		while(a <= 10) {
			System.out.print(a+ " ");	
			
			a++;
		}
		System.out.println("num value " + a);
		
		
		
		
	int ab = 10;
		
		while(ab >= 1) {
			System.out.print(ab+" ");
			
			ab--;
		}
		
		scan.close();
		
	}
}
