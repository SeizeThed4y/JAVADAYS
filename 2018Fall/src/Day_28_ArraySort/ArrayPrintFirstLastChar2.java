package Day_28_ArraySort;

public class ArrayPrintFirstLastChar2 {
	public static void main(String[] args) {

		String[] words = { "hello", "why", "by", "apple", "note" };

		System.out.print("[");
		for (int i = 0; i < words.length; i++) {
			if (i != words.length - 1) {
				System.out.print(words[i].substring(0, 1) + words[i].substring(words[i].length() - 1));
				System.out.print(", ");
			} else {
				System.out.print(words[i].substring(0, 1) + words[i].substring(words[i].length() - 1));
			}
		}
		System.out.println("]");
	}

}
