package Day_41_Classes02_encapsulation;

public class HouseTester {
	public static void main(String[] args) {

		// Step 1. Create House object and assign data to fields/ instance variables

		House yourHouse = new House();

		yourHouse.type = "Single House";
		yourHouse.address = "1234 abc street , centreville , va , 12345";
		yourHouse.bedrooms = 6;
		yourHouse.years = 2005;

		// Step 2. Pass your house object to printHouseInfo

		printHouseInfo(yourHouse);

		House myHouse = new House();

		myHouse.type = "Mantion";
		myHouse.address = "123123 ns.dknaskd street , asldna , va , 12345";
		myHouse.bedrooms = 100;
		myHouse.years = 2018;

		printHouseInfo(myHouse);
										
		
		//type	address	#	year
		
		
		House housetest1 = buildAhouse("test1", "test2", 1, 2);
		System.out.println("Type: "+housetest1.type + "\n Adress: " + housetest1.address);
		
		
		
		
			
		
		
		printHouseInfo(buildAhouse("Single House", "1234 Oakengat way , centrevile , 21232", 7, 2008));
		
		
	}

	public static void printHouseInfo(House house) {

		System.out.println("=============");
		System.out.println("Type: " + house.type);
		System.out.println("Adress: " + house.address);
		System.out.println("Bedrooms: " + house.bedrooms);
		System.out.println("Year: " + house.years);
		System.out.println("=============");

	}

	// Method buildAHouse

	/*
	 * Params: 4 - > 2 string 2 > ints
	 * 
	 * Return type : House
	 * 
	 * In the method, using the values of the parameters build a new house object
	 * then return that
	 * 
	 */

	public static House buildAhouse(String type, String Adress, int bedrooms, int years) {
		
		House newHouse = new House();
		
		
		newHouse.type = type;
		newHouse.address = Adress;
		newHouse.bedrooms = bedrooms;
		newHouse.years = years;
		
		return newHouse;
		
		
		
	}

}
