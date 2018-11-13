package HomeworkArray;

public class Task6 {

	public static void main(String[] args) {
		
	//print to console the sum of this int array:
		
		System.out.println("-------With For Loop------");
		
		
		int[] nums = new int[] {6,7,11,12,2,3};
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		System.out.println(sum );
		
		
		
		System.out.println("------With Normal Long Way -----------");
		
		
		System.out.println(nums[0] + nums[1] + nums [2] + nums [3] + nums [4] + nums[5]);
		
		
		System.out.println("\nOR\n");
		
		
		int sum2 = nums[0] + nums[1] + nums [2] + nums [3] + nums [4] + nums[5];
		
		System.out.println(sum2);
		
		
	}
	
}
