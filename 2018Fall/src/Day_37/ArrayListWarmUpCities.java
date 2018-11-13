package Day_37;

import java.util.ArrayList;

public class ArrayListWarmUpCities {
	public static void main(String[] args) {

		/*
		 * Warm up task:
		 * 
		 * Create an Arraylist cities:
		 * 
		 * add 15 cities
		 * 
		 * Print count of cities in the list
		 * 
		 * Print all cities ib one line spearated by space
		 * 
		 * Create another ArrayList longNames
		 * 
		 * and add all cities from Cities list with more than 6 character into longNames
		 * list
		 * 
		 * then print longNames in single line formatted way.
		 */

		ArrayList<String> cities = new ArrayList<>();

		cities.add("Alexandria");
		cities.add("Aurora");
		cities.add("Austin");
		cities.add("Boston");
		cities.add("Chandler");
		cities.add("Charlotte");
		cities.add("Dallas");
		cities.add("Dayton");
		cities.add("Elizabeth");
		cities.add("Eugene");
		cities.add("Gilbert");
		cities.add("Houston");
		cities.add("Jackson");
		cities.add("Lincoln");
		cities.add("Madison");

		System.out.println(cities.size());

//		for(int i = 0; cities.size(); i++) {
//			System.out.println(cities.get(i) + " | ");
//		}

		for (String cities2 : cities) {
			System.out.print(cities2 + " ");

		}

		System.out.println();

		ArrayList<String> longNames = new ArrayList<>();

		for (String city : cities) {
			if (city.length() > 6) {
				longNames.add(city);
			}

		}
		System.out.print(longNames);

	}
}
