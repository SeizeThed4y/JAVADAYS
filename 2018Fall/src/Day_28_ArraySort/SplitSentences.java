package Day_28_ArraySort;

public class SplitSentences {
	public static void main(String[] args) {
		// Given a String variable sentence, write code to type each word in separate
		// lines.

		/*
		 * Example: sentence -> "Java is fun" Print Java is fun
		 */

		String sentence = "Java is fun";

		for (String splitted : sentence.split(" ")) {
			System.out.println(splitted);
		}

	}
}
