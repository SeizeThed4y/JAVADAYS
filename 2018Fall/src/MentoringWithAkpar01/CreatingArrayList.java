package MentoringWithAkpar01;

import java.util.ArrayList;
import java.util.List;

import day_34_method.myClass;

public class CreatingArrayList {
	public static void main(String[] args) {

		// Create an arralist of String

		ArrayList<String> myList = new ArrayList<>();

		myList.add("kawap");
		myList.add("polo");
		myList.add(1, "samsa");
		myList.add("Laghman");

		ArrayList<String> myList2 = new ArrayList<>();

		myList2.add("su");
		myList2.add("chay");

		myList2.addAll(myList);

		/// Create an arraylist object by copying everything inside another arraylist

		
		//For Loop
		for (int i = 0; i < myList2.size(); i++) {

			System.out.println(myList2.get(i));
		}
		
		System.out.println();

		
		//For Each
		for (String str : myList2) {

			System.out.println(str);
		}

		
		System.out.println();
		
		
		//While Loop
		int j = 0;
		while (j < myList2.size()) {

			System.out.println(myList2.get(j));

			j++;

		}
		
		System.out.println();

		
		//Do While Loop
		int idx = 0;

		do {

			System.out.println(myList2.get(idx));

			
			
			
			idx++;
		} while (idx < myList2.size());

	}

}
