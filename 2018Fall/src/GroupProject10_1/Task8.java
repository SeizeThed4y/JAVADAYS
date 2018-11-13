package GroupProject10_1;

public class Task8 {

	public static void main(String[] args) {

		int result = 0;
		for (int i = 1; i <= 19; i++) {

			if (i % 2 == 1) {

				result += i;
				System.out.print(result + " ");
			}

		}

		
		
		///////////////////////////////////////
		
		
		int number = 1;
		int result2 = 0;
		
		while(number <= 19) {
			
			if(number % 2 == 1) {
				result2 += number;
				System.out.print(result2+ " ");
				
			}
			number++;
		}
		
	}

}
