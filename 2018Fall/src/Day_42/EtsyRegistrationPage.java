package Day_42;

public class EtsyRegistrationPage {
	public static void main(String[] args) {

		EtsyAccount account1 = new EtsyAccount();

		account1.setEmail("frk.coskunn@gmail.com");
		account1.setFirstName("Feruk");
		account1.setPassword("1abc");

		EtsyAccount account2 = new EtsyAccount();

		account2.setEmail("abc@gmail.cok");
		account2.setFirstName("Kurxat");
		account2.setPassword("4321abc");

		EtsyAccount account3 = new EtsyAccount();

		account3.setAccountInfo("farukcoskun@gmail.com", "Faruk", "456789"); // it calls setAccountInfo method from EtsyAccount Class and ask 3 variable
		
		
		EtsyAccount yourAccount = new EtsyAccount();
		
		
		
		
		
		
		yourAccount.setAccountInfo("yourEmail", "Apple", "12345555");
		
		System.out.println(yourAccount.getAccountInfo());
		
		
		System.out.println(account3.getAccountInfo());

		System.out.println(" == First Account ==" + "\n First Account Email: " + account1.getEmail() + "\n First name: "
				+ account1.getFirstName() + "\n Password: " + account1.getPassword());

		System.out.println();

		System.out.println(" == Second Account ==" + "\n Second Account Email: " + account2.getEmail()
				+ "\n First name: " + account2.getFirstName() + "\n Password: " + account2.getPassword());

		System.out.println();

		System.out.println(" == Third Account ==" + "\n Third Account Email: " + account3.getEmail() + "\n First name: "
				+ account3.getFirstName() + "\n Password: " + account3.getPassword());
		
		
		

	}

}
