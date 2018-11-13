package HomeworkArray;

public class Task10 {

	public static void main(String[] args) {

		int [] cm = {1,2,3};
		
		int size = 0;
		
		for ( int i = 1; i < 10; i++) {
			if(i <= 3) {
				System.out.println("\n year " + i + " grows " + cm[0]+ " cm \n \t tree size is " + (size += cm[0]) + " cm");
			}else if ( i > 3 && i < 6) {
				System.out.println("\n year " + i + " grows " + cm[1]+ " cm \n \t tree size is " + (size += cm[0]) + " cm");
			}else {
				System.out.println("\n year " + i + " grows " + cm[2]+ " cm \n \t tree size is " + (size += cm[0]) + " cm");
			}
		}

	}

}
