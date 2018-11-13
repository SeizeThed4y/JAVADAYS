package Day_33_Methods;

public class CalculatorVer2 {
	
	
	public static void main(String[] args) {
			System.out.println(add(3, 4));
			
			System.out.println(divide(0, 0));
			
			
			System.out.println(calculate(30, 2, '*'));
	}

	
	public static double calculate(double n1, double n2, char operator) {
		
		switch(operator) {
		case '+':
			return add(n1,n2);
			
		case '-':
			return subtract(n1,n2);
			
		case '*':
			return multiply(n1, n2);
			
		case'/':
			return divide(n1, n2);
			
			
		default:
			throw new RuntimeException("ERROR: Invalid Operator " + operator);
			
		}
		
	}
	
	public static double add(double a, double b) {
		return a + b;

	}

	public static double subtract(double a, double b) {
		return a - b;

	}

	public static double multiply(double a, double b) {
		return a * b;

	}

	public static double divide(double a, double b) {
		double result = 0;

		if (b == 0) {
			System.out.println("Error Cannot divide it to Zero");
		} else {
			result = a / b;

		}
		return result;

	}

	

}
