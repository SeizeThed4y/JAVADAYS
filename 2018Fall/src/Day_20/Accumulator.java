package Day_20;

public class Accumulator {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 2; i <= 100; i++) {
			sum += i; // sum = sum + i;

		}
		System.out.println("Sum is: " + sum);

		// program to calculate the sum of all odd and even numbers
		// between 0 and 100+
		// sumOfOdds --> will have all sum of odd numbers
		// sumOfEvens --> will have all sum of even numbers

		int sumOfOdds = 0;

		int sumOfEvens = 0;

		for (int number = 0; number <= 100; number++) {

			if(number % 2 == 0) {
				sumOfEvens += number;
				
				
			}else  {
				sumOfOdds = sumOfOdds + number;
			}
				
				System.out.println("Sum Of Evens: " + sumOfEvens);
				
				System.out.println("Sum Of Odds: " + sumOfOdds);
			}
			
			
		}

	}


