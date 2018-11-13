package Day_26;

public class WarmUpTask1ncrementArrayValues {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		//////// Second Way for the first task ///////
		System.out.println("\n");

		for (int n : nums) {
			System.out.print(n + " ");
		}

		System.out.println("\n" + "2 nd task");

		for (int l = 0; l < nums.length; l++) {

			if (nums[l] % 2 == 0) {

				nums[l] = 2 * nums[l];

			} else {
				nums[l] = 3 * nums[l];
			}

		}

//			for(int num : nums) {
//				int Double = num * num;
//				int Triple = num * num * num;
//			
//				if(num % 2 == 0) {
//				
//					System.out.print( Double + " ");
//				}else if ( num % 2 == 1 ) {
//					
//					System.out.print(Triple + " ");
//				}
//			}

		System.out.println("\n");

		int[] num3 = { 3, 4, 9, 8, 15, 12, 21, 16, 27 };

		for (int k = 0; k < num3.length; k++) {
			System.out.print(num3[k] + " ");
		}
	}

}
