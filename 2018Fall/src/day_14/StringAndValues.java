package day_14;

//this is the name of the class, everything jappens inside the class 
public class StringAndValues {

	// declaring a variable without any value.
	// java will put null value by default
	static String str;
	// we are declaring a main method

	public static void main(String[] args) {

		// will print null because no value assigned
		System.out.println(str);
		// assigning value into str
		str = "a";
		// will print a
		System.out.println(str);

		// assigning another value into str
		str = "b";
		// will print b
		System.out.println(str);

		// print current value of str "b" and "AAA"
		System.out.println(str + "AAA");

		System.out.println(str);
		// print current value of str.
		// str is now equal to bAAA

		str = str + "AAA";

		// print current value of str "bAAA"

		System.out.println(str);

		/////////////////////////////////////////////////////

		
		
		// created a new variable and gave value "a"
		String mystring = " a ";
		
		//printing the trimmed version of mystring
		// this line will not affect the orginal value of mystring variable
		System.out.println(mystring.trim());
		
		//prints the value of mystring which still contains spaces
		System.out.println(mystring);

	}

}
