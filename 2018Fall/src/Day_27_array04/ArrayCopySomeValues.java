package Day_27_array04;

public class ArrayCopySomeValues {
	public static void main(String[] args) {
		String[] arr = { "zero", "one", "two", "three", "four" };

		// count how many words have 'e' in the arr

		int counter = 0;
		for (String str : arr) {
			if (str.contains("e")) {
				counter++;
			}
		}

		System.out.println(counter);

		// create array fewValues, with size of counter
		String[] fewValues = new String[counter];

		// go over arr one more time and add the words with 'e' into fewValues

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].contains("e")) {
				fewValues[counter - 1	] = arr[i];
				counter--;
				System.out.print(fewValues[counter] + " ");
			}

		}

	}

}
