package practicepublic;

import java.util.Scanner;

public class CalculationApp {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Thank You for Choosing Our Calcolator App");
		System.out.println("(Press 1)--(Press 2)--(Press 3)--(Press 4)");
		System.out.println("   ^           ^          ^          ^        ");
		System.out.println("Kg toPound Km to Mile  Galon to lt cm to inc");
		System.out.println("Please Choose Which Calcolator You Want to Use");
		int appChoose = scan.nextInt();
		
		
		switch(appChoose) {
		case 1:
			System.out.println("Please Enter Kg: ");
			
			int kilogram = scan.nextInt();
			
			double lbs = kilogram * 2.2;
			
			System.out.println(kilogram + " kilogram is equal to " + lbs + " lbs.");
			
			break;
		
		case 2:
			
			System.out.println("Please Enter Km: ");
			
			double km = scan.nextDouble();
			
			double mile = km * 0.62;
			
			System.out.println(km + " Km is equal to "+ mile + " mile");
			
			break;
			
		case 3:
			
			System.out.println("Please Enter Galong Amount: ");
			
			double galon = scan.nextDouble();
			
			double lt = galon * 3.78;
			
			System.out.println(galon + " galon is equal to: " + lt + " lt");
			
			break;
			
		case 4: 
			
			System.out.println("Please Enter CM: ");
			
			double cm = scan.nextDouble();
			
			double inch = cm * 0.39;
			
			System.out.println(cm + " cm equal to: "+ inch + " Inch");
			break;
			
			default:
				System.out.println("We dont have more option for calculator for now, please wait the next update");
				break;
		}
		scan.close();
		
	}

}
