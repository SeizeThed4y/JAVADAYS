package Day_40_customclasses;

public class CellPhoneFactory {

	public static void main(String[] args) {

		// create object from a CellPhone class

		CellPhone phone1 = new CellPhone();

		phone1.brand = "Apple Iphone XS";

		phone1.color = "Black";

		phone1.price = 1299.99;

		phone1.call();

		phone1.text();

		CellPhone phone2 = new CellPhone();

		phone2.brand = "Ericson 1018";
		phone2.color = "Silver";
		phone2.price = 30.5;

		phone2.call();

		phone2.text();

		CellPhone phone3 = new CellPhone();

		phone3.brand = "HTC EVO";
		phone3.color = "Black";
		phone3.price = 350.99;

		phone2.call();
		phone3.text();

		System.out.println("Phone1 Brand - " + phone1.brand);
		System.out.println("Phone2 Brand - " + phone2.brand);
		System.out.println("Phone3 Brand - " + phone3.brand);

		// Calculate total price for all 3 phones.

		double total = 0;

		total = phone1.price + phone2.price + phone3.price;

		System.out.println("Total price of 3 phones " + total);

		// can we update object values?

		phone1.price = 1200.0;

		phone2.price = phone3.price;
		
		System.out.println("Phone1 Price: " + phone1.price); 
		System.out.println("Phone2 Price: " + phone2.price);
		System.out.println("Phone3 Price: " + phone3.price);
		
		//CellPhone.call(); will not work since CellPhone is not static

	}

}
