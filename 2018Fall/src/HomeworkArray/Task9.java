package HomeworkArray;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {

		/*
		 * copy old_r elements into new_r empty positions, new_r size is bigger then
		 * old_r size by one. inside new_r last position put new_word "four", and then
		 * output the array using the java array util "Arrays.toString()". this is the
		 * starting code:
		 */

		String[] old_r = new String[] { "one", "two", "three" };
		String new_word = "four";
		String[] new_r = new String[old_r.length + 1];
		
		for(int i = 0; i < old_r.length; i++) {
			new_r[i] = old_r[i];
			new_r[old_r.length] = new_word;
		}
				System.out.println(Arrays.toString(new_r));
	}

}
