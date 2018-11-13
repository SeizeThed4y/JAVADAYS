package Day_17_Review_Section2;

public class DynamicSubstring {

	public static void main(String[] args) {
		
		String sentence = "we are learning C++ programming";
		
		/*
		 * indexOf(); --> finds accepts a string and finds the position.
		 * 
		 * 
		 * 
		 * example:
		 * 
		 * 		String str = "abc start";
		 * 
		 * 		str.indexOf("b") -> 1
		 * 		str.indexOf("start") -> 4
		 * 
		 * find the position of learning
		 * find the position of programming
		 * 
		 * 
		 */

		
		int start = sentence.indexOf("learning");
		
		
		int end = sentence.indexOf("programming");
		
		start += "learning".length(); //give you the ending "G"
		
		System.out.println(start);
		System.out.println(end);
		String langauge = sentence.substring(start, end);
		System.out.println(langauge.trim());// Remove the SPACES 
	}

}
