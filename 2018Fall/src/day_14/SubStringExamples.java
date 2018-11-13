package day_14;

public class SubStringExamples {

	public static void main(String[] args) {
		// substring gets part of a string
		// there are two versions, 1 takes 1 int , 1 takes 2 ints
		// if it takes 1 int, it means starting point
		
		
		
		
		// we cannopt give a number bigger than the lengh , it will throw exception
		//if we give number equal to the length, it will return empty string
		// whatever you give the number it start from there and print the String.
		
		
		String str = "donaldtheduck@gmail.com";
		//System.out.println(str.substring(14)); 
		
		// 2 int
		// first number is the where the new string will STARTING from
		// second number is the where the new string will END
		//System.out.println(str.substring(19, 20));
		
		
		
		System.out.println("abc".substring(1,2));
		
		
		 

	}

}
