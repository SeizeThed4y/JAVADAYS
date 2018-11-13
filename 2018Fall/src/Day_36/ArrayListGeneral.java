package Day_36;

import java.util.ArrayList;

public class ArrayListGeneral {
	public static void main(String[] args) {
		// ARRAYLIST --> IS A COLLECTION TYPE IN JAVA
		// --> ANOTHER DATA STRUCTURE LIKE ARRAY.

		// unlike arrays, arraylist is dynamic, we can add, update, remove elements any
		// time. Arraylist not fixed size.

		// Arrays are great to work with multiple set of data, but if your data count is
		// changing frequently, then since arrays are fixed size, it might not be a good
		// fit

		// When ever we work with dynamic collection of data, then Arraylist is a better
		// option.

		// ArrayList is the most popular data stucture in java that is used in
		// development!!!

		// How to create an ArrayList

		/*
		 * 1. General Arraylist that can accept any type.
		 * 
		 * ArrayList list = new ArrayList();
		 * 
		 * How to add new data into arraylist list.add("java"); list.add(123)
		 * 
		 */
		
		
		ArrayList list = new ArrayList();
		
		list.add("cybertek");
		list.add("abc");
		list.add(true);
		list.add(123);
		
		
		System.out.println(list);
		
		
		System.out.println(list.get(0));
		
		System.out.println(list.size());
		
	
		
		
		

	}

}
