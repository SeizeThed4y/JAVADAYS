package Day_24;

public class ArrayInt {

	public static void main(String[] args) {
		
				// Array is : Signle variable that hold multiple value of same type

				/*
				 * For example:
				 * 
				 * 
				 * Groceyer list: Apple , Peach , Banana
				 * 
				 * Contacts : person A , person B , person C
				 * 
				 * Prime Numbers : 2 , 3 , 5, 7 , 11, 13 , 17 , 19 , 23 , 29
				 * 
				 * 
				 * 
				 * 
				 * 
				 * Creating Array
				 * 
				 * //Syntax format
				 * 
				 * dataType [] variableName = new dataType [size];
				 * 
				 * 
				 */

				System.out.println("====================================================");

				// Sytax for creating int Array

//							int [] numbers = new int[3];
//							
//							numbers[0] = 2;
//							numbers[1] = 5;
//							numbers[2] = 7;
				System.out.println("====================================================");
				// ~~~~~Shorther way~~~~ For 1st way

				// int [] numbers = new int[] {2,5,7};

				// or directly as below

				// int numbers [] = new int [3];

				// int [] numbers = {2,5,7};

//					String [] name = new String[] {"John","Adam","Don"};
//					
				// String [] Person = {"John", "Adam", "Don"};

				System.out.println("====================================================");

				// Syntax for accessing Array elements

				int[] intArray = { 2, 5, 7 };

				System.out.println("Numbers 1 : " + intArray[0]);
				System.out.println("Numbers 2 : " + intArray[1]);
				System.out.println("Numbers 3 : " + intArray[2]);

				System.out.println("====================================================");

				// Looping an Array = For loop

				String[] names = { "John", "Adam", "Don" };
				for (int i = 0; i < names.length; i++) {
					System.out.println("names " + names[i]);
				}

				System.out.println("====================================================");

				// Looping an Array == For each loop

				String[] names2 = { "John", "Adam", "Don" };
				for (String item : names2) {
					System.out.println("names " + item);

				}
			}

		

	

}
