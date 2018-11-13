package Day_26;

public class ArrayPrintUniqueValuesWithNestedLoop {

	public static void main(String[] args) {

		// take a number from array
		// compare with the rest of number in the array.
		// if no matches found
		// it is unique and print out

		// take a number from array
		// create a variable counter and assign 0 to it. int counter = 0;
		// compare the number with all other numers(dont compare the number with it
		// self)
		// if a match found counter++, if not dont touch counter
		// check if counter is still 0, if yes, print that numbere because it is unique

		int[] nums = new int[] { 1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4 };

		for (int outer = 0; outer < nums.length; outer++) {

			int currentNum = nums[outer];
			boolean duplicate = false;

			for (int inner = 0; inner < nums.length; inner++) {

				if (nums[inner] == currentNum && outer != inner) {
					duplicate = true;
					break;
				}

			}
			if (duplicate == false) {
				System.out.print(currentNum + " ");
			}

		}

	}

}
