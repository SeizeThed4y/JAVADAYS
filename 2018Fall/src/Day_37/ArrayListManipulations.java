package Day_37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManipulations {
	public static void main(String[] args) {

		/*
		 * Create arraylist fruits using 5 different way
		 */

		ArrayList<String> fruits1 = new ArrayList<>();

		List<String> fruits2 = new ArrayList<>();

		List<String> fruits3 = new ArrayList<>(10);

		ArrayList<String> fruits4 = new ArrayList<>(fruits1);

		List<String> fruits5 = Arrays.asList(new String[] { "Apple", "Watermalon" });

		List<String> fruits6 = new ArrayList<>(fruits5);
		fruits6.add("PineApple");

		List<String> fruits7 = new ArrayList<>(Arrays.asList(new String[] { "Kiwi", "Plum", "Mango" }));

		// add values

		fruits1.add("Grapes");
		fruits1.add("Tomato");
		fruits1.add("BlueBerries");
		fruits1.add("BlackBarries");
		fruits1.add(0, "Orange");
		fruits1.add(4, "Stawberries");

		fruits2.addAll(fruits1);
		fruits2.add("Dragon Fruit");

		System.out.println(fruits2);

		// Remove elements

		fruits1.remove(0);
		System.out.println(fruits1);

		fruits1.remove("Strawberries");

		fruits2.removeAll(fruits1);
		System.out.println("Fruits2 : " + fruits2);

		fruits1.clear();
		System.out.println(fruits1);

		List<Integer> nums = new ArrayList<>();

		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);

		System.out.println(nums);

		// remove 3

		nums.toString();
		nums.remove(1);

		System.out.println(nums);

	}

}
