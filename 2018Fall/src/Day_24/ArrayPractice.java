package Day_24;

public class ArrayPractice {

	public static void main(String[] args) {

		// declare array that can hold 5 items
		int[] numbers = new int[5];

		// assign values

		numbers[0] = 12;
		numbers[1] = 23;
		numbers[2] = 34;
		numbers[3] = 45;
		numbers[4] = 56;

		System.out.println(numbers[0]);

		// number[10] = 34567; index of out bound exception

		numbers[1] = numbers[2] + numbers[3];

		System.out.println(numbers[1]);

		// Declare a char array grades and assign A,B,C,D,E to it.
		// use any one of 3 ways to do so

		char[] grades = { 'A', 'B', 'C', 'D', 'E' };
		char[] grades2 = new char[] { 'A', 'B', 'C', 'D', 'E' };

		
		//print first item
		System.out.println(grades[0]);
		
		char myGrade = grades[1];
		
		System.out.println(myGrade);

		
		String[] cities = {"Istanbul" , "Ankara", "Izmir", "Edirne", "Canakkale", "Antalya", "Bodrum"}; 
		
	}

}
