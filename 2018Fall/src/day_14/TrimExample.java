package day_14;

public class TrimExample {

	public static void main(String[] args) {

		// trim() ---> delete whitespace in the beginning and end of the string ( delete
		// extra space )
		// space can be only at the beginning, or only at the end or in the both sides.
		// everything will go
		String str = "             blah           ";

		System.out.println(str);
		// console will print str without the space
		// but the value of the str does not change
		System.out.println(str.trim());
		
		System.out.println(str.length());

		// chaining --> calling methos one after another
		System.out.println(str.trim().length());

		str = str.trim();

		System.out.println(str);

		// ####################################################

		System.out.println(str + "ac");

		System.out.println(str);

	}

}
