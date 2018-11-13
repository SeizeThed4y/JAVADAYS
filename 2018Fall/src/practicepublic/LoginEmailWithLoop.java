package practicepublic;

import java.util.Scanner;

public class LoginEmailWithLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your user name: ");
		String secretUserName = scan.next();
		System.out.println("Please enter your password: ");
		String secretPassword = scan.next();

		// String secretUserName = "admin";
		// String secretPassword = "abc12";

		// 2 variables , UserName, password.
		// make sure they match with secret ones, and allow login login succesfully
		// Whenever login is not successful, let program tell exact reason
		// Why it is not valid
		// username is not valid
		// password is not valid
		// both username and password are invalid

		String userName = "ADmin";
		String password = "abc123";

		if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
			System.out.println("Login Succesful. Welcome Back !");

		} else if (!userName.equalsIgnoreCase(secretUserName) && !password.equals(secretPassword)) {
			System.out.println("Invalid Username and Password");
		} else if (!userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
			System.out.println("Invalid Username");
		} else {
			System.out.println("Invalid Password");
		}

		scan.close();
	}

}
