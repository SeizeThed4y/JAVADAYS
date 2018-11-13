package day_13;

public class StringEquality {

	public static void main(String[] args) {
		String str1 = "abc";

		String str2 = "abc";

		// System.out.println(str1==str2); ->>>>> True

		System.out.println(str1.equals(str2));
////////////////////////////////////////////////////////////////////////////
		String str3 = new String("abc");

		String str4 = "abc";

		// System.out.println(str3==str4); ->>>>> False

		System.out.println(str3.equals(str4));
//////////////////////////////////////////////////////////////////////////
		String str5 = new String("abc");
		String str6 = new String("abc");

		// System.out.println(str5==str6); ->>>>> False

		System.out.println(str5.equals(str6));

		////////////////////////////////////////////////////

		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str5.equals(str6));

	}

}
