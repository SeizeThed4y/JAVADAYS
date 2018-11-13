package Day_33_Methods;

public class StringMethod2 {

	public static void main(String[] args) {

		System.out.println(countTimes3("facebook", "k"));
		
		

	}

	/*
	 * Method name: countTimes
	 * 
	 * params: 2 String
	 * 
	 * Return type: int
	 * 
	 * Counts number of occurences of first string within second string
	 * 
	 * and return that count
	 * 
	 * 
	 * Ex:
	 * 
	 * countTimes("Java" "a") --> 2 countTimes("Break time is over!" , "e") --> 3
	 * countTimes("google", "a") --> 0
	 * 
	 */

	public static int countTimes(String str1, String str2) {

		int counter = 0;

		for (int i = 0; i < str1.length(); i++) {

			if (str1.substring(i, i + 1).equals(str2)) {
				counter++;
			}

		}

		return counter;
	}

	// 2nd way
	// TODO: it hasnt done yet , update the code and finish it.
	public static int countTimes2(String str1, String str2) {

		String[] arr = str1.split(str2);

		return arr.length;

	}

	
	//3rd way to do it.
	public static int countTimes3(String str1, String str2) {

		int len1 = str1.length();
		str1 = str1.replaceAll(str2, "");
		int len2 = str1.length();
		return len1 - len2;

	}

}
