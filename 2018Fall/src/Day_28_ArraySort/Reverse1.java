package Day_28_ArraySort;

public class Reverse1 {

	public static void main(String[] args) {
		
		/*Given a String variable sentence, write code to type each word in separate lines in a reverse order.
		Example:
		sentence -> "Java is fun"
		Print
		fun
		is
		Java*/
		
		
		
		String sentence = "Java is fun";
		
		String [] s1 = sentence.split(" ");
		
		for (int i = s1.length -1 ; i >= 0; i--) {
			System.out.println(s1[i]);
		}
		
		
		
		
		
	}
}
