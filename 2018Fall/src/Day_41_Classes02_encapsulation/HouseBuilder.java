package Day_41_Classes02_encapsulation;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseBuilder {
	public static void main(String[] args) {

		House house1 = new House();
		house1.order = "1st House";
		house1.type = "Single House";
		house1.address = "6108 Oakengate Way, Centreville, VA, 20120";
		house1.bedrooms = 6;
		house1.years = 2001;

		System.out.println(" Type of the house1: " + house1.type + "\n Address of the house: " + house1.address
				+ "\n Numbers of bedrooms: " + house1.bedrooms + "\n Made of the years: " + house1.years);

		System.out.println();

		House house2 = new House();
		house2.order = "2nd House";
		house2.type = "Single House";
		house2.address = " 3456 Lee highway , fairfax 22031";
		house2.bedrooms = 3;
		house2.years = 2014;
		System.out.println(" Type of the house2: " + house2.type + "\n Address of the house: " + house2.address
				+ "\n Numbers of bedrooms: " + house2.bedrooms + "\n Made of the years: " + house2.years);

		System.out.println();

		House house3 = new House();
		house3.order = "3rd House";
		house3.type = "Condominuim";
		house3.address = " 2234 k str NW apt 543 , Washington DC 20001";
		house3.bedrooms = 2;
		house3.years = 2010;

		System.out.println(" Type of the house3: " + house3.type + "\n Address of the house: " + house3.address
				+ "\n Numbers of bedrooms: " + house3.bedrooms + "\n Made of the years: " + house3.years);

		System.out.println();

		House whiteHouse = new House();
		whiteHouse.order = "White House";
		whiteHouse.type = "White House ~~ Mansinon";
		whiteHouse.address = " 1600 Pennsylvania Ave NW, Washington, DC 20500	";
		whiteHouse.bedrooms = 132;
		whiteHouse.years = 1792;

		System.out.println(" Type of the house4: " + whiteHouse.type + "\n Address of the house: " + whiteHouse.address
				+ "\n Numbers of bedrooms: " + whiteHouse.bedrooms + "\n Made of the years: " + whiteHouse.years);

		int[] nums = new int[4];

		String[] names = new String[4];

		// House [] houses = {house1 , house2, house3, whiteHouse};
		House[] houses = new House[4];

		houses[0] = house1;
		houses[1] = house2;
		houses[2] = house3;
		houses[3] = whiteHouse;

		System.out.println();

		for (int i = 0; i < houses.length; i++) {
			System.out.println(houses[i].order + "\n~~~~House types: " + houses[i].type + "\n~~~~House Adresses: "
					+ houses[i].address + "\n~~~~Number of bedrooms :" + houses[i].bedrooms
					+ "\n~~~~Build years of houses: " + houses[i].years);
		}

		System.out.println("======= ArrayList OF House Objects");

		ArrayList<Integer> numsList = new ArrayList<>();
		ArrayList<House> housesList = new ArrayList<>();

		housesList.add(house1);
		housesList.add(house2);
		housesList.add(house3);
		housesList.add(whiteHouse);

		for (House str : houses) {
			housesList.add(str);
		}

//		
//		ArrayList<House> houseList2 = new ArrayList<>(Arrays.asList(houses));
//		
//		List<House> houseList3 = Arrays.asList(houses); // fix size arraylist you cant add nother house

		// print (year and adress ) of each house object in arraylist if year is between
		// 2006 - 2016

		for (House house : housesList) {

			if (house.years >= 2006 && house.years <= 2016) {
				System.out.println(house.years + house.address);

			}
		}

		System.out.println();

		for (int j = 0; j < housesList.size(); j++) {

			House tempHouse = housesList.get(j);
			if (housesList.get(j).years >= 2006 && housesList.get(j).years <= 2018) {
				System.out.println(tempHouse.years + tempHouse.address);

				
				
				
				
			}
		}
		
		
		printHouseInfo(house1);
		printHouseInfo(house2);
		printHouseInfo(house3);
		printHouseInfo(whiteHouse);
	}

	public static void printHouseInfo(House house) {

		System.out.println("=============");
		System.out.println("Type: " + house.type);
		System.out.println("Adress: " + house.address);
		System.out.println("Bedrooms: " + house.bedrooms);
		System.out.println("Year: " + house.years);
		System.out.println("=============");

	}

}