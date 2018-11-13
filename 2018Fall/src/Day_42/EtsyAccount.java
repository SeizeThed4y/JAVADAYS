package Day_42;



public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;

	public void setAccountInfo(String email, String firstName, String password) {

		this.email = email;
		this.firstName = firstName;
		setPassword(password); // it takes the if condition < 6

	}
	
	
	public String getAccountInfo() {
		
		return email + " | " + firstName + " | " + this.password;
		
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String NewFirstName) {
		this.firstName = NewFirstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String NewPassword) {
		if (NewPassword.length() < 6) {
			System.out.println("Password - Must be at least 6 characters.");
			return;
		}

		this.password = NewPassword;
	}

}
