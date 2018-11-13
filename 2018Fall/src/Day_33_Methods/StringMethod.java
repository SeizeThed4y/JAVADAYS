package Day_33_Methods;

public class StringMethod {
	public static void main(String[] args) {

		System.out.println(reverse("Zuhre321"));
		//System.out.println(reverse2("qwertyjk"));
		
		

	}

	public static String reverse(String word) {

		StringBuilder str = new StringBuilder(word);

		str.reverse();

		return str.toString();

	}

//	public static String reverse2(String orginal) {
//
//		String reversed = "";
//
//		for (int i = orginal.length() - 1; i >= 0; i--) {
//			reversed += orginal.charAt(i);
//		}
//		return reversed;
//	}

	

}
