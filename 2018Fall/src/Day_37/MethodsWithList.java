package Day_37;

import java.util.*;

public class MethodsWithList {
	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
//		nums.add(1000);
//		nums.add(4000);
//		nums.add(10000);
//		int result = sumList(nums);
//		System.out.println(result);

		ArrayList<Integer> n1 = new ArrayList<>();
		ArrayList<Integer> n2 = new ArrayList<>();

		n1.add(1);
		n2.add(2);

		int result = sum2(n1, n2);

		System.out.println(result);

		System.out.println(buildIntList(500));

		List<Integer> randomList = buildIntList(5000);
		System.out.println(randomList);

		sumList(buildIntList(1000));
		
		System.out.println(sumList(buildIntList(1000)));
	}

	// how to write method that accepts an ArrayList
	// calculate sum of values and return

	public static int sumList(List<Integer> list) {

		list.add(1);
		list.add(2);
		list.add(3);

		int sum = 0;
		


//		for(int num : nums) {
//			sum += num;
//		}

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;

	}

	public static int sum2(ArrayList<Integer> n1, ArrayList<Integer> n2) {

		int totalSum1 = 0;
		int totalSum2 = 0;
		int total = 0;

		for (int i = 0; i < n1.size(); i++) {
			totalSum1 += n1.get(i);

		}
		for (int j = 0; j < n2.size(); j++) {
			totalSum2 += n2.get(j);
		}

		total = totalSum1 + totalSum2;

		return total;

		// 2nd way

		/*
		 * 
		 * nums1.addAll(nums2);
		 * 
		 * int sum=0; for(int a:nums1){ sum+=a; }
		 * 
		 * return sum;
		 *
		 * 
		 */

	}

	/*
	 * How to write a method that return an ArrayList of integers
	 * 
	 * 
	 * 
	 * Method name: BuildIntList
	 * 
	 * 
	 * Return type: ArrayList of Integer
	 * 
	 * 
	 * 
	 * Args: int;
	 * 
	 * 
	 * 
	 * This method gets an int and creates an ArrayList with that many random
	 * numbers between 0 - 100 and resturns it;
	 * 
	 */

	public static List<Integer> buildIntList(int num) {

		Random random = new Random();
		ArrayList<Integer> returnList = new ArrayList<>();

		for (int Z = 1; Z <= num; Z++) {
			returnList.add(random.nextInt(101));
		}

		return returnList;
	}

}
