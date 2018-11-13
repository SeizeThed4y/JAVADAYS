package day_4_operators;

public class BasicMathOperators {

	public static void main(String[] args) {
//		//create 2 int variables and assign values
//		int num1 = 100;
//		int num2 = 200;
//		System.out.println(num1+num2);
//		System.out.println(num1+num2 + 1000);
//		
//		
//	
//		
//		int sum = num1 + num2 + 10;
//		System.out.println("sum is " + sum);
//		

		// create 3 variables: apples, carrots, tomato
		// add prices to it with decimals
		// create a variable called total and assign total price
		// also print the tax add the task to the total
		// print your total is price after with tax
		// 6 tax

		double apples = 10.55;
		double carrots = 3.87;
		double tomatoes = 6.23;

		double totalBeforeTax = apples + carrots + tomatoes;
		System.out.println(totalBeforeTax);

		// calculate tax
		double tax = totalBeforeTax * 0.06;
		System.out.println("Total tax: " + tax);

		double grandTotal = totalBeforeTax + tax;

		System.out.println("Your total is $ " + grandTotal);

		
		System.out.println(248 % 100 / 5);
	}

}
