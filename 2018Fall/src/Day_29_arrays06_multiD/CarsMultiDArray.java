package Day_29_arrays06_multiD;

import java.util.Arrays;

public class CarsMultiDArray {

	public static void main(String[] args) {

		/*
		 * create a 2d array cars it should have 3 groups of cars
		 * 
		 * 1. Japanese
		 * 
		 * 2. German
		 * 
		 * 3.American
		 * 
		 * 4. Italian
		 */

		String[][] cars = { { "Toyota", "Honda", "Mazda", "Acura", "Nissan", "Subaru" },
				{ "BMW", "AUDI", "VW", "Porsche", "Mercedes Benz" },
				{ "Ford", "Chevrolet ", "GMC", "Jeep", " Lincoln", "Tesla" },
				{ "Ferrari", "lamborghini", "Maserati", "Alfa Romeo" } };

		
		System.out.println(Arrays.toString(cars[0]));
		
		System.out.println("For Loop 1st way ");
		System.out.println();
		for (int outer = 0; outer < cars.length; outer++) {

			for (int inner = 0; inner < cars[outer].length; inner++) {

				System.out.println(Arrays.toString(cars[outer]));
				break;
			}
		}
		System.out.println();
		System.out.println("For Loop 2nd way ");
		System.out.println();
		
		for (int outer = 0; outer < cars.length; outer++) {

			for (int inner = 0; inner < cars[outer].length; inner++) {

				System.out.print(cars[outer][inner] + " ");
				
			}
		}

		
		
		System.out.println();
		System.out.println("\n For each loop");
		System.out.println();
		
		
		for (int outer = 0; outer < cars.length; outer++) {

			for (String c1 : cars[outer]) {

				System.out.print(c1 + " " );
				
			}
		}
		
		
		
		
	}

}
