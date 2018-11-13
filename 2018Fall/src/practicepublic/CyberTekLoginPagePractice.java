package practicepublic;

import java.util.Scanner;

public class CyberTekLoginPagePractice {

	public static void main(String[] args) {


		// Data Base Customer`s informations email and password //

		int count = 3;

		String emailferuk = "ferukcoskun@cybertek.com";
		String passWordferuk = "ferukcoskun1994";

		System.out.println(
				"Welcome To Cybertek IT School Please Enter Your Email and Password to Access to Online Classes.");
		Scanner scan = new Scanner(System.in);

		while (true) {
			
			System.out.println("Enter Your Email");
			String secretEmail = scan.next();
			System.out.println("Enter Your Password");
			String secretPassWord = scan.next();

			if (emailferuk.equalsIgnoreCase(secretEmail) && passWordferuk.equals(secretPassWord)) {
				System.out.println("Welcome Back!!");
				System.out.println();
				break;

			} else if (!emailferuk.equalsIgnoreCase(secretEmail) && passWordferuk.equals(secretPassWord)) {
				System.out.println("The Email is invalid");
				System.out.println();

			} else if (emailferuk.equalsIgnoreCase(secretEmail) && !passWordferuk.equals(secretPassWord)) {
				System.out.println("The Password is invalid");
				System.out.println();
			} else if (!emailferuk.equalsIgnoreCase(secretEmail) && !passWordferuk.equals(secretPassWord)) {
				System.out.println("Invalid Password and Username");

			}
			count--;

			if (count == 0) {
				System.out.println("Your account got blocked.");
				break;
				
				
				
				
			}

		}
		scan.close();
	}
}
