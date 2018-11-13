package Day_16_Review_Section1;

import java.util.Scanner;

public class Budget {

	public static void main(String[] args) {

//	     < 80 -> cannot buy anything

//			 * > 435 -> u can buy everything

//			 * if budget >= phone+watch
//			 * 	you can buy phone+watch
//			 * 	or phone+bag
//			 * 	or watch + bag

//			 * if budget >= phone+bag
//			 * 	you can buy phone+bag
//			 *  or watch + bag

//			 * if budget >= watch+bag
//			 * 	you can buy watch+bag
//			 * 	

//			 * if budget >= phone
//			 * 		you can buy phone
//			 * 	   or watch+bag

//			 * if budget >= watch
//			 * 		you can buy watch
//			 * 		or bag
//			 * else
//			 * 	just a watch

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Budget");
		double budget = scan.nextDouble();
		
//		System.out.println("Enter Price of Phone");
//		double phone = scan.nextDouble();
//		
//		System.out.println("Enter Price of Watch");
//		double watch = scan.nextDouble();
//		
//		System.out.println("Enter Price of bag");
//		double bag = scan.nextDouble();
				
		double phone = 250.0;
		double watch = 105.5;
		double bag = 80.0;
		if (budget >= (phone + watch + bag)) {
			System.out.println("You can buy everything you want");
		} else if (budget < bag) {
			System.out.println("You cannot buy anything");
		} else if (budget >= phone + watch) {
			System.out.println("You can buy phone and watch or watch + bag");
		} else if (budget >= phone + bag) {
			System.out.println("You can buy phone and bag or watch + bag");
		} else if (budget >= watch + bag) {
			System.out.println("You Can buy watch and bag");
		} else if (budget >= phone) {
			System.out.println("You can buy phone or watch and bag");
		} else if (budget >= watch) {
			System.out.println("You can buy watch or bag");
		} else {
			System.out.println("just watch");
		}
		scan.close();
	}

}
