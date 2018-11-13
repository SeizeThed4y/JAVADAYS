package Day_35;

public class MethodAndStuff {

	public static void main(String[] args) {
		String str1 = "halloween";
		String str2 = "ee";

		int count = numberOfOccurences(str1, str2);
		System.out.println(count);
	}

	/*
	 * given a string, write a method which returns how many times a certain
	 * string appears on another string
	 */
	public static int numberOfOccurences(String str1, String str2) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			String currentChar = "" + str1.charAt(i);
			if (currentChar.equals(str2)) {
				count++;
			}
		}
		return count;
	}

	/*
	 * delete utility will delete a given character from the given string
	 * 
	 */

	public static String delete(String str1, String str2) {
		String newOne = str1.replace(str2, "");
		return newOne;
	}

	
	
	
    
}
