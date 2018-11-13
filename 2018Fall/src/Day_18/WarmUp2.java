package Day_18;

import java.util.Scanner;

public class WarmUp2 {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Name of the cars");
//		String garage = scan.nextLine().toLowerCase();

		String garage = ("Toyota, Nissan, Honda, BMW, Mazerati, Ford").toLowerCase();

		// !!!!!!!!!! INTERVIEW QUESTION !!!!!!!!!!!!!!

		// How do you find one string

		// garage = garage.toLowerCase();

		
		
/*
 * 		
 */
		if (garage.isEmpty()) {
		}
		if (garage.contains("toyota") || garage.contains("nissan")) {
			System.out.println("There is a Japanese car in garage");
		} else {
			System.out.println("No Japanaese Cars");
		}

		if (garage.indexOf("bmw") > -1) {
			System.out.println("There is a german car in garage");
		} else {
			System.out.println("No German cars");
		}if(garage.contains("jaguar")) {
			System.out.println("There is a British car in garage");
		}else {
			System.out.println("There is no British car");
		}
		
		
		
		// My Way //

//		if(garage.isEmpty()) {
//			System.out.println("No Car");
//		}
//		if (garage.contains("toyota")|| garage.contains("nissan")) {
//			System.out.println("There is a Japanese car in garage");
//		} else {
//			System.out.println("No Japanaese Cars");
//		}
//		if (garage.contains("bmw")) {
//			System.out.println("there is a German car in car in garage");
//		} else {
//			System.out.println("No German Car");
//		}
//		if (garage.contains("mazerati")) {
//			System.out.println("there is an italian car in garage");
//		} else {
//			System.out.println("No Italian Car");
//		}if(garage.contains("jaguar")) {
//			System.out.println("there is an british car in garage");
//		}else {
//			System.out.println("No Briths Car");
//		}

	}

}