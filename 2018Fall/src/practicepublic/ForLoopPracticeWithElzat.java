package practicepublic;

public class ForLoopPracticeWithElzat {
	public static void main(String[] args) {
		
		 int [][] arr = {{13,90,34} , {3,12,9}};
		 			//       0			  1
		 
		 int largest = arr[0][0];
		 
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j<arr[i].length; j++) {
				 if(largest < arr[i][j]) {
					 largest = arr[i][j];
				 }
			 }
		 }
		 System.out.println(largest);
		
	}

}
