package HomeworkArray;

public class Task7 {

	public static void main(String[] args) {
		
		
	/*get the biggest number in an int array using a loop and print the biggest number
	to console.
	use this loop:
	*/
		
		
		
	int[] nums = new int[] {60,73,9,15,200,350};
	
	int largest = nums[0];
	
	for ( int num : nums) {
		
		
		if(num > largest) {
			largest = num;
		}
	}
		System.out.println(largest);
	}
	
}
