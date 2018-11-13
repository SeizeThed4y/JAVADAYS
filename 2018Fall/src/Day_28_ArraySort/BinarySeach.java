package Day_28_ArraySort;

import java.util.Arrays;

public class BinarySeach {
	public static void main(String[] args) {

		String[] words = { "cake", "tomato", "wooden spoon", "pizza" };

		Arrays.sort(words);

		// print all in one line:
		System.out.println(Arrays.toString(words));

		System.out.print(Arrays.binarySearch(words, "pizza"));

	}

}
