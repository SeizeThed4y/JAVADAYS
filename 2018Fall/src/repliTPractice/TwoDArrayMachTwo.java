package repliTPractice;

public class TwoDArrayMachTwo {
	public static void main(String[] args) {
		int matches = 0;

		int[][] arr = { { 2, 2, 1, 3, 4, 5 }, { 5, 2, 3, 3, 4, 5 }, { 3, 2, 9, 1, 4, 5 } };

		
		
		
		for (int i = 0; i <= arr.length -1 ; i++) {
			
			for (int j = 0; j <= arr[0].length - 1; j++) {
				
				if (j < arr[0].length - 1) {
					

					if (arr[i][j] == arr[i][j + 1]) {
						matches++;
					}
				}

			}

		}

		System.out.println(matches);
		
		
		
		
	}

}
