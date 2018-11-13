package day_13;

public class StringPositionsINDEXOF {
	
	public static void main(String[] args) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWZ";
		
	
		System.out.println(alphabet.indexOf("V"));
		
		int pPosition = alphabet.indexOf("V");
		
		System.out.println("V is at index + " + pPosition);
		
		
		
		
		//HIJ location in alphabet
		
		
		int hijlocation = alphabet.indexOf("HIJ");
		
		System.out.println(hijlocation);
		
		
		String sencetence = "Today is Sunday and Tomorrow is Monday.";
		
		System.out.println(sencetence.indexOf("Sunday"));
		
		System.out.println(sencetence.indexOf("a"));// 3
		
		
		System.out.println(sencetence.lastIndexOf("a"));//36
		
		
		System.out.println(sencetence.indexOf("y",5));//14s
		
		System.out.println(sencetence.indexOf("tomor"));
		
		System.out.println(sencetence.indexOf("Is M" ));
		
		
		if(sencetence.indexOf("and") >= 0) {
			System.out.println("Word is there");
		}else{
			System.out.println("Word is not there");   // indeOf is case sensetive.
			
			
		 String searchResult= "1-24 of over 50,000 results for Electronucs : speakers";
		 
		 int pos = searchResult.indexOf("of");
		 
		if(pos == 5) {
			System.out.println("PASS");
		}else {
			System.out.println("Fail");
		}
		
		
		
		
			
			
			
		}
		
	}

}
