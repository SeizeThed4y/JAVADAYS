package Day_36;

import java.util.ArrayList;

public class StringOnlyArrayList {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Faruk");
		names.add("Cybertek");
		names.add("Istanbul");
		
		System.out.println(names);
		
		//get size/ number of elements;
		
		int length = names.size();
		
		System.out.println(length);
		
		String first = names.get(0);
		System.out.println("First name is: " + first);
		
		
		String last = names.get(names.size()-1);
		System.out.println(last);

		
		names.remove(0);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		System.out.println(nums);
		
		
		
		
		
	}

}
