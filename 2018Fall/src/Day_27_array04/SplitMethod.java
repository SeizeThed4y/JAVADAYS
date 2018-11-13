package Day_27_array04;

public class SplitMethod {
	
	public static void main(String[] args) {
		String words = "java-selenium-cucumber-testng-junit-eclipse-maven-git-github";
		
		for (String retval : words.split("-")) {
			System.out.println(retval);
		}
		
		
		System.out.println(" ");
		
		/////////
		
		
		
		String [] splittedWords = words.split("-");
		
		System.out.println(splittedWords.length);
		
		System.out.println(splittedWords[0]);
		
		
		for(String w : splittedWords) {
			System.out.println(w);
		}
		
		
		System.out.println(" ");
		
		
		String searchResult = "All categories “wooden spoon” 13,623 Results";
		
		
		// if you have a sentence as a string, how do you find out how many words in it ? 
		
		String [] totalWords = searchResult.split(" ");
		System.err.println(totalWords.length);
		
		// extract number of wooden spoon result and print out 
		
		System.out.println("wooden spoon count: " + totalWords[4]);
				
	}

}
