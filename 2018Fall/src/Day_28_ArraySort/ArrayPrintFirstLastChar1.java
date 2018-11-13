package Day_28_ArraySort;

public class ArrayPrintFirstLastChar1 {

	public static void main(String[] args) {
		//Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

		/*words → ["hello", "why", "by", "apple" , "note"]
		print: 
   			ho
   			wy
   			by
   			ae
   			ne*/
	
	
	
	
	String [] words = {"hello" , "why", "by" , "apple" , "note"};	// dont add to the website	
	
	for (String word : words ) {
		
		
		//Substring
		System.out.print(word.substring(0,1) +  word.substring(word.length()-1));
		
		
		
		
		//WITH charAt 1st way
		System.out.print(word.charAt(0) +""+ word.charAt(word.length()-1));
		//charAt 2nd way
		System.out.print(word.charAt(0));
		System.out.println(word.charAt(word.length() - 1));
		
		
	}


	}

}
