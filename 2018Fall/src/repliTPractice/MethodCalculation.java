package repliTPractice;

import java.util.Scanner;

public class MethodCalculation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int a , b;
		
		plus(a = scan.nextInt(), b = scan.nextInt());
		
	}
	
	public static void plus(int a, int b){
	     
	    System.out.println("result: " + (a+b));
	  }

}
