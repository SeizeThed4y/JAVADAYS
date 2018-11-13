package Day_26;

public class StringMetHods {
	
	public static void main(String[] args) {
		
		
		
		
		/* String methods:
		 * 	-comparison : equals , equalsIgnoreCase, compareTo
		 * 
		 * 	-case conversion: toUpperCase, toLowerCase
		 * 
		 * 	-lenght
		 * 
		 * 	- get char from index : charAt(index)
		 * 
		 * 	- find the index of character: indexOf(char) , lastindexOf
		 * 
		 * 
		 * 	- take a part of the string: substring(begin , end)
		 * 
		 * 	- isEmpty to check if string is empty 	
		 * 
		 * 	- startWith, endsWith
		 * 
		 * 	- contains
		 * 
		 * 	- replace
		 * 
		 * 	- trim
		 * 
		 *  - concat
		 *  
		 *  
		 *  
		 * ------------------------
		 * 
		 * toCharArray --> takes a string and build a char[] array consisting of character
		 * 
		 * 
		 * 		String str = "java";
		 * 		char [] letters = str.toCharArray();
		 * 
		 * 		char[] letters = {'j','a','v','a'};
		 * 
		 * 
		 * 
		 */
		
//		String str = "Hello";
//		char [] letters = str.toCharArray();
//		
//		for(char letter : letters) {
//			
//			System.out.print(letter + " ");
//			
//		}
//		
//
//		for(int i = 0; i < letters.length; i++) {
//			System.out.print(letters[i] + " ");
//		}
//		
//		
		
		
		String gift = "Diamond Ring";
		
		// convert to char array, and print reverse
		
		
		char[] diamon = gift.toCharArray();
		
		for(int a = diamon.length-1; a >= 0; a--) {
			System.out.print(diamon[a] + " ");
		}
		
		//Split method
		
		
		
		
		
		
	}

}
