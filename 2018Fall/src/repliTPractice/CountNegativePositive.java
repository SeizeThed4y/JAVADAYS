package repliTPractice;

public class CountNegativePositive {
	public static void main(String[] args) {
		
	}
	/*
	 * Create a method called plus_minus that gets an array of ints (int[]), it
	 * outputs how many negative , positive and zero numbers are in the array.
	 * 
	 * for example:
	 * 
	 * plus_minus (new int[]{1,2,55,-9,-2,0});
	 * 
	 * will output: positives:3, negatives:2, zeros:1
	 */

	public static void plus_minus(int [] num) {
		
		int p=0;
		int n=0;
		int z=0;
		for(int i = 0; i < num.length; i++) {
			
			if(num[i] > 0) {
				p++;
			}else if(num[i] < 0) {
				n++;
			}else if(num[i] == 0) {
				z++;
			}
			
		}
		
		System.out.println("Positives: " + p);
		System.out.println("Negatives: " + n);
		System.out.println("Zeros: " + z);
		
	}

}
