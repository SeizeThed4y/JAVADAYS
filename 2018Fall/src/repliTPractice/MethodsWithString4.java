package repliTPractice;

public class MethodsWithString4 {

	public static void main(String[] args) {

		System.out.println(wordCount("Java is fun"));
	}

	// First way with For Loop

	public static int wordCount(String words) {
		 
		int count = 0;
		for (int i = 0; i < words.length(); i++) {

			count++;
		}
		return count;

	}

	// Second way with For Each Loop
	public static int wordCount2(String words2) {
		int count = 0;
		for (@SuppressWarnings("unused") String str : words2.split(" ")) {
			count++;
		}
		return count;
	}
}
