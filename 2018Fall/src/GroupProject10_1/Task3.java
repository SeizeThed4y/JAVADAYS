package GroupProject10_1;

public class Task3 {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			if(i % 3 == 0) {
				System.out.print(i+ " ");
			}
		}
		
		int number = 0;
		while(number <= 20) {
			if(number % 3 == 0) {
				System.out.print(number);
				
			}
			number++;
		}
	}

}
