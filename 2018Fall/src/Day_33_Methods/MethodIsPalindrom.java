package Day_33_Methods;

public class MethodIsPalindrom {
	public static void main(String[] args) {
		
		
		System.out.println(isPalindrome("civic"));
		
		
		String word = "java";
		
		if( isPalindrome(word)) {
			System.out.println("Word is palindrome");
		}else {
			System.out.println("Word is not palindrome");
		}
		
	}

	
	
	/*
	 * Method: isPalindrome Accepts: String Return type: boolean if param String is
	 * palindrome returns true otherwise returns false
	 * 
	 * isPlaindrome("civic") --> true isPalindrome ("racecar") -->true
	 * 
	 * 
	 */

	public static boolean isPalindrome(String word) {

		String reversed = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i);

		}

		if (reversed.equals(word)) {
			return true;
		}

		return false;

	}
	
	
	//Version 2 of ISPLAINDROME that will call reverse method
	
	
	
	
	
	
	
	
	
	
	
	
}
