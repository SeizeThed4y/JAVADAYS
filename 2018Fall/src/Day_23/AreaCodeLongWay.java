package Day_23;

import java.util.Scanner;
import org.omg.PortableInterceptor.HOLDING;

public class AreaCodeLongWay {

	public static void main(String[] args) {

		String state = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Phone Number");
		String phoneNumber = scan.next();

//		System.out.println("Enter your phone number");
//		String phoneNumber = scan.next();

		if (phoneNumber.startsWith("(")) {
			switch (phoneNumber.substring(1, 4)) {
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
		}else if (phoneNumber.startsWith(phoneNumber)) {
			switch (phoneNumber.substring(0,3)) {
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
			System.out.println("Your state is: " + state);
		}
	

	}
}