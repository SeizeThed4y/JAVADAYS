package GroupProject10_1;

public class Task2 {

	public static void main(String[] args) {
		
			//2.Write for and while loops so that they print only the even numbers between 1 and 20.
		
//		for(int i = 1; i <= 20; i++) {
//			if(i % 2 == 0) {
//				System.out.print(i+" ");
//			}
//		}
		int number = 1;
		
		while(number <= 20 ) {
			if(number % 2 == 0) {
				System.out.print(number+ " ");
				
				
			}
			number++;
		}
		
	}

}
