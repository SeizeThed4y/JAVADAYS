package Day_24;

public class ArrayLength {
	public static void main(String[] args) {
		
		/*
		 * byte short int long arrays will get default values of 0.
		 * 
		 * float , double --> 0.0
		 * 
		 * 
		 * char --> '';
		 * 
		 * 
		 * boolean - > False
		 * 
		 * String --> null
		 * 
		 * and any other object type will get null value
		 */
		
		
		
		//declare array names that can store 5 names
		
		String [] names = {"faruk", "kurxat" , "elzat" , "enkar" , "abida"};
		
		//count of values in array. not paranthesis
		System.out.println(names.length);
		
		//String name and assign kurxay to it by readung array
		
		
		String name = names[1];
		
		
		//Count of characters in String
		System.out.println(name.length());
	}

}
