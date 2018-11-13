package Day_27_array04;

public class FindingMaxLengthinStringArray {

	public static void main(String[] args) {
		/*
		 * Given the array words, it will print the word with the largest length. Assume
		 * that there are no 2 words with longest length
		 * 
		 * Example: words -> ["aaa", "bbbbb", "whasstupppp", "longg" ,
		 * "jaaaaavvaaaaaaaaaa"] prints jaaaaavvaaaaaaaaaa
		 */

		String[] array = { "aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa" };

		int index = 0;
		int elementLength = array[0].length();
		for (int i = 1; i < array.length; i++) {
			if (array[i].length() > elementLength) {
				index = i;
				elementLength = array[i].length();
			}
			System.out.println(elementLength);
		}
		

	}

}
