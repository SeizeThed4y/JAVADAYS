package day_19_loops2;

public class SlowlyPrintMyNumbers {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 
		 * write a program to print 
		 */

		
		
int num = 1;
		
		while(num <= 10) {
			System.out.print(num+ " ");	
			
			num++;
			
			Thread.sleep(1000); // Slow down the loop	
		}
		System.out.println("num value " + num);
	}

}
