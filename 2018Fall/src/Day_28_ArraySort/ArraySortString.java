package Day_28_ArraySort;

import java.util.Arrays;

public class ArraySortString {
	public static void main(String[] args) {
		String[] names = { "Said", "John", "Asel", "Alisiya", "Mijat", "Tarik ", "Z", "Khalili" };

		Arrays.sort(names);

//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		for(String name : names) {
			System.out.print(name + " ");
		}
		
	}

}
