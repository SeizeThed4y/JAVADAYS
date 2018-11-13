//		// Making object when the method is not  " Static " and call it 
//		Calculator calc = new Calculator();
//		calc.plus(1234, 400);

package Day_31_Method02;

public class Calculation  {
	
	
	public static void main(String[] args) {
		
		
		// it is calling plus(a + b ) method  from Calculator.
		Calculator.plus(1234, 400);
		
		// we are mentionin the class name because divide method is not in same class
		
		Calculator.divide(500, 100);
		

		
	}
	
	

}
