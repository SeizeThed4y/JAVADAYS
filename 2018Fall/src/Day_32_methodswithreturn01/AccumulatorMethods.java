package Day_32_methodswithreturn01;

public class AccumulatorMethods {
	public static void main(String[] args) {

		System.out.println(getStarts(5));

		SumTon(2);	

	}

	/*
	 * methods getStarts that accepts an int and returns a string it will return
	 * that many * stars.
	 *
	 *
	 * for example (5) --> *****
	 */

	public static String getStarts(int number) {

		String star = "*";

		for (int i = 1; i < number; i++) {

			star = star + "*";

		}
		return star;

	}

	/*
	 * method: sumToN: accepts an int and return sum of ints starting from 1 to that
	 * int. sumToN(3) -> 6 (1+2+3) sumToN(5) -> 15 (1+2+3+4+5)
	 */

	public static int SumTon(int num) {

		int sum = 0;

		for (int i = 1; i <= num; i++) {

			sum += i;

		}
		System.out.println(sum);
		return sum;

	}

}
