package Day_17_Review_Section2;

public class Substrings {

	public static void main(String[] args) {
		/*
		 * create a variable diceResult
		 * 
		 * assign 1- 30 of 1,367 positions
		 * 
		 * using substring exract number of open positions
		 * 
		 * positions
		 * 
		 * output: 1,367
		 */

		String diceResult = "1 - 30 of 1,367 positions";

		System.out.println(diceResult.substring(10, 15));

		String languages = new String("java, Fortrun, English, Cobol, Ruby, C#");

		String lan1, lan2, lan3, lan4, lan5, lan6;

		/*
		 * using substring assign each langauge to each variable
		 * 
		 * for the last language just pass one number to substring
		 */

		lan1 = languages.substring(0, 4);
		System.out.println(lan1);

		lan2 = languages.substring(6, 13);
		System.out.println(lan2);

		lan3 = languages.substring(15, 22);
		System.out.println(lan3);

		lan4 = languages.substring(24, 29);
		System.out.println(lan4);
		lan5 = languages.substring(31, 35);
		System.out.println(lan5);

		lan6 = languages.substring(37);
		System.out.println(lan6);
	}

}
