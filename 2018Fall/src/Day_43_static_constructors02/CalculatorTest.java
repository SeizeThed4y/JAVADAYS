package Day_43_static_constructors02;

public class CalculatorTest {

	public static void main(String[] args) {

		System.out.println(Calculator.plus(1, 2));
		System.out.println(Calculator.minus(23, 10));
		System.out.println(Calculator.multiply(2, 3));

		System.out.println("Below code called with object");

		Calculator c1 = new Calculator();

		System.out.println(c1.plus(4, 2));
		
		testStatic();
		

	}
	

	public static void testStatic() {
		System.out.println("this is test static");
	}

}
