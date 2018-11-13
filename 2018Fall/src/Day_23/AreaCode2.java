package Day_23;

import java.util.Scanner;

public class AreaCode2 {
	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Phone Number");
		String phoneNumber = scan.next();
		String areaCode = "";
		
		String state = "";
		
		if(phoneNumber.startsWith("(")) {
			areaCode = phoneNumber.substring(1,4);
		}else {
			areaCode = phoneNumber.substring(0, 3);
		}
		
		switch(areaCode) {
		case "202":
			state = "Washington DC";
			break;

		case "703":
			state = "Virginia";
			break;

		case "209":
			state = "California";
			break;

		case "312":
			state = "Illinois";
			break;

		case "347":
			state = "New York";
			break;

		default:
			System.out.println("Not in DataBase");
			
			
		}
		
		System.out.println("Your State is: " + state);
	}

}
