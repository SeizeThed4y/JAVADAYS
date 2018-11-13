package Day_16_Review_Section1;

public class PrintAMessage {

	public static void main(String[] args) {

		System.out.println("--- Welcome TO REVIEW SESSION");

		System.out.println(1234567890); // you can print numbers with out double quotes

		System.out.println("Tipic 1 is: " + "Printing various messages");

		int balance = 100;

		System.out.println("Balance is " + balance);

		System.out.println("Balance is " + balance + 55);

		System.out.println("Balance is " + (balance + 55));

		// print bs println . println also addes new line at the end

		System.out.print("Today is ");
		System.out.print("Java Review");
		System.out.print(" day 1");

		System.out.println();

		System.out.println("Today is ");
		System.out.println("Java Review");
		System.out.println(" day 1");

		// \n , \t
		// ( \ ) is called an escape character. Used to say, they treat the next text as
		// part of the String

		System.out.println("Next topic to review is \n datatypes");
		System.out.println("Next topic to review is \\n datatypes");

		System.out.println("largerst integer in Java is  \"long\" ");

		/// IF you want to print "" you need to use \"TEXT\" | \'TEXT\' ..

		System.out.println("I want to buy \'wooden spoon\' from \"etsy\"");

		String msg = "I want to buy 'wooden spoon' from \"etsy\" ";

		System.out.println(msg);

	}

}
