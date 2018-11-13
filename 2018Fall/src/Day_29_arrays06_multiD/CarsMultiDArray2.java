package Day_29_arrays06_multiD;

import java.util.Arrays;

public class CarsMultiDArray2 {
	public static void main(String[] args) {

		String[][] cars = { { "Toyota", "Honda", "Mazda", "Acura", "Nissan", "Subaru" },
				{ "BMW", "AUDI", "VW", "Porsche", "Mercedes Benz" },
				{ "Ford", "Chevrolet ", "GMC", "Jeep", " Lincoln", "Tesla" },
				{ "Ferrari", "lamborghini", "Maserati", "Alfa Romeo" } };

		
	
		for (int outer = 0; outer < cars.length; outer++) {

			for (int inner = 0; inner < cars[outer].length; inner++) {

					if(outer == 0) {
						System.out.print("Japanese: ");
					}else if(outer == 1) {
						System.out.print("German: ");
					}else if(outer == 2) {
						System.out.print("American: ");
					}else if(outer == 3) {
						System.out.print("Italian : ");
					}else {
						System.out.println("Unkown Group");
					}
				System.out.println(Arrays.toString(cars[outer]));
				break;
			}
		}
	}

}
