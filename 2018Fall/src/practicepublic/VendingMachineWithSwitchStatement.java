package practicepublic;

import java.util.Scanner;

public class VendingMachineWithSwitchStatement {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Thank You for Choosing Our CokeFreeStyleMashine");
		System.out.println("(Press 1)--(Press 2)--(Press 3)--(Press 4)----(Press 5) ");
		System.out.println("   ^           ^          ^          ^            ^     ");
		System.out.println(" Fanta  ~  Sprite ~  Mello Yello ~ MinuteMade ~ Powerade");
		int selectDrink = scan.nextInt();

		switch (selectDrink) {
		case 1:
			System.out.println("You Have Selected Fanta");
			System.out.println("Please Enter which type of fanta would you like");
			System.out.println("(Press 1)--(Press 2)---(Press 3)----(Press 4)--(Press 5) ");
			System.out.println("   ^           ^          ^             ^          ^     ");
			System.out.println("Orange ~~ Strawberry ~~ Pineapple ~~ Grape ~~~~~~Mango");

			int tasteOfDrink = scan.nextInt();
			if (tasteOfDrink == 1) {
				System.out.println("You have selected orange");
			} else if (tasteOfDrink == 2) {
				System.out.println("You have selected Strawberry");
			} else if (tasteOfDrink == 3) {
				System.out.println("You have selected Pineapple");
			} else if (tasteOfDrink == 4) {
				System.out.println("You have selected Grape");
			} else if (tasteOfDrink == 5) {
				System.out.println("You have selected Mango");
			} else {
				System.out.println("You have only 5 chooses , please select one of thoese chooses");
			}
			break;

		case 2:

			System.out.println("You Have Selected Sprite");
			System.out.println("Please Enter which type of sprite would you like");
			System.out.println("(Press 1)-----(Press 2)---(Press 3)----(Press 4)--(Press 5) ");
			System.out.println("   ^          	  ^          ^             ^          ^     ");
			System.out.println("Orginal  ~~    Cherry ~~ Creanberry  ~~  Grape ~~ Tropical mix");
			int tasteOfDrink2 = scan.nextInt();

			if (tasteOfDrink2 == 1) {
				System.out.println("You have selected Orginal Taste");
			} else if (tasteOfDrink2 == 2) {
				System.out.println("You have selected Cherry");
			} else if (tasteOfDrink2 == 3) {
				System.out.println("You have selected Creanberry ");
			} else if (tasteOfDrink2 == 4) {
				System.out.println("You have selected Grape");
			} else if (tasteOfDrink2 == 5) {
				System.out.println("You have selected Tropical Mix");
			} else {
				System.out.println("You have only 5 chooses , please select one of thoese chooses");
			}
			break;
		case 3:
			System.out.println("You Have Selected Mello Yello");
			System.out.println("Please Enter which type of Mello Yello would you like");
			System.out.println("(Press 1)--(Press 2)---(Press 3)----(Press 4)--(Press 5) ");
			System.out.println("   ^           ^          ^             ^          ^     ");
			System.out.println("Orginal ~~   Peach  ~~  limeade  ~~   Grape  ~~ citrus twist");
			int tasteOfDrink3 = scan.nextInt();

			if (tasteOfDrink3 == 1) {
				System.out.println("You have Selected Orginal Taste");
			} else if (tasteOfDrink3 == 2) {
				System.out.println("You have Selected Peach ");
			} else if (tasteOfDrink3 == 3) {
				System.out.println("You have Selected limeade");
			} else if (tasteOfDrink3 == 4) {
				System.out.println("You have Selected Grape");
			} else if (tasteOfDrink3 == 5) {
				System.out.println("You have Selected Citrus Twist");
			} else {
				System.out.println("You have only 5 chooses , please select one of thoese chooses");
			}
			break;

		case 4:
			System.out.println("You Have Selected Minute Maid Lemonade");
			System.out.println("Please Enter which type of Minute Maid Lemonade would you like");
			System.out.println("(Press 1)--(Press 2)---(Press 3)----(Press 4)--(Press 5) ");
			System.out.println("   ^           ^          ^             ^          ^     ");
			System.out.println("Cherry ~~ lemon lime  ~~ lemon  ~~  raspberry ~~ strawberry");
			int tasteOfDrink4 = scan.nextInt();

			if (tasteOfDrink4 == 1) {
				System.out.println("You have Selected Cherry");
			} else if (tasteOfDrink4 == 2) {
				System.out.println("You have Selected Lemon Lime ");
			} else if (tasteOfDrink4 == 3) {
				System.out.println("You have Selected Lemon");
			} else if (tasteOfDrink4 == 4) {
				System.out.println("You have Selected Raspberry");
			} else if (tasteOfDrink4 == 5) {
				System.out.println("You have Selected Strawberry");
			} else {
				System.out.println("You have only 5 chooses , please select one of thoese chooses");
			}
			break;
		case 5:
			System.out.println("You Have Selected Powerade");
			System.out.println("Please Enter which type of Powerade would you like");
			System.out.println("(Press 1)--(Press 2)---(Press 3)----(Press 4)--(Press 5) ");
			System.out.println("   ^           ^          ^             ^          ^     ");
			System.out.println("Cherry ~~ fruit punch ~~ lemon  ~~   grape ~~ 	  lime");
			int tasteOfDrink5 = scan.nextInt();

			if (tasteOfDrink5 == 1) {
				System.out.println("You have Selected Cherry");
			} else if (tasteOfDrink5 == 2) {
				System.out.println("You have Selected fruit punch ");
			} else if (tasteOfDrink5 == 3) {
				System.out.println("You have Selected Lemon");
			} else if (tasteOfDrink5 == 4) {
				System.out.println("You have Selected Grape");
			} else if (tasteOfDrink5 == 5) {
				System.out.println("You have Selected Lime");
			} else {
				System.out.println("You have only 5 chooses , please select one of thoese chooses");
			}
			break;
		default:
			System.out.println("You have only 5 types of drinks");
			break;
			

		}

		scan.close();
	}

}
