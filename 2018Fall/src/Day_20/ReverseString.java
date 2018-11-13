package Day_20;

public class ReverseString {

	public static void main(String[] args) {

		String a = "faruk";
		String reversed = "";

		for (int idx = a.length() - 1; idx >= 0; idx--) {

			reversed += a.charAt(idx);

			

		}
		System.out.println(reversed);
	}

}
