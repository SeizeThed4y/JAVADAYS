package practicepublic;

import java.util.Scanner;

public class IFandElseTwo {
	public static void main(String[] args) {
		
		Scanner FinalGrade = new Scanner(System.in);
		System.out.println("Welcome to the GPA Calculation!!");
		System.out.println("Enter The Point: ");
		double grades = FinalGrade.nextDouble();
	
		
		
		if (grades >=4.00) {
			System.out.println("Your Grade is A");
		}
		
		else if (grades<4.00&&grades >= 3.67) {
			System.out.println("Your Grade is: A-");
			
		}
		
		else if (grades<3.67&&grades>=3.33) {
			System.out.println("Your Grade is: B+");
		}
		
		else if (grades<3.33&&grades>=3.00) {
			System.out.println("Your Grade is: B");
		}
		
		else if (grades<3.00&&grades>=2.67) {
			System.out.println("Your Grade is : B-");
		}
		
		else if (grades<2.67&&grades>=2.33) {
			System.out.println("Your Grade is : C+");
		}
		else if (grades<2.33&&grades>=2.00) {
			System.out.println("Your Grade is : C");
		}
		
		else if (grades<2&&grades>=1) {
			System.out.println("Your Grade is : D");
		}
	
		else {
			System.out.println("Your Grade is : F and Nice job you waisted your time Try Again !! X_x  !! ");
			
		}
			
		FinalGrade.close();
		
		}
	}
