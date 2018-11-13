package practicepublic;

import java.util.Scanner;

public class CompareThreeNumbers {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter 3 numbers: A B C D" );
		int a,b,c,d;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		
		
		if (a > b && a > c && a > d) {
			System.out.println("A is the biggest number");
		}
		
		else if(b > a && b > c && b > d) {
			System.out.println("B is the biggest number");
		}
		else if(c > b && c > a && c > d ){
			System.out.println("C is the biggest number");

		}
		else if(d > a && d > b && d > c){
			System.out.println("D is the biggest number");
		}
		else if (a == b && a==c && b==c && a == d && b == d && c == d) {
			System.out.println("All 4 numbers are equal");
		}
		scan.close();
	}

}
