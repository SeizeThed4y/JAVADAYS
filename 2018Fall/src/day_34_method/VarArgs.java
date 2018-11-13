package day_34_method;

public class VarArgs {
	public static void main(String[] args) {
		sum(10, 20);
		
		sumAll(10,12,3,4,5,23,3,423,423,423,423,4,653,6);
		
		
		shoppingList("apple", "Kiwi", "Bananas", "cucumber" , "coke");
		
		shoppingList("pc" , "ps" );
	}
	
	public static void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public static void sumAll(int... nums) { // you can add ass much as int [] with VarArgs. if you want to add single argument (String str, int... nums) --> VarArgs has to be at the end.
		System.out.println("Number of input:" + nums.length);
		int sum = 0;
		for(int num: nums) {
			sum += num;
			
			
		}
		System.out.println(sum);
	}
	
	/*
	 * Methods shoppingList 
 		Args :VarArgs.
 		Return type : void
	 */

	public static void shoppingList(String... items) {
		System.out.print("Shopping List : ");
		for(String item : items) {
			
			System.out.print(item + " ");
		}
		
		//when ever we want to create a method that is able to accept any number of parameters (same type), then we can use VarArgs in java
		
		/*
		 * 
		 * 		IMPORTANT: VarArgs can ONLY be used in method signature / Method definition as argument.
		 * 
		 * ------------------------
		 * 		How :
		 * 
		 * 
		 * 		public static void myMethod(double... values){
		 * 
		 * }
		 * 
		 * 
		 * In above example myMethod can accept 0 or more double inputs.
		 * 
		 * ------------------------
		 * 		How We call the method:
		 * 	
		 * 			method();
		 * 			method(12.4 , 14.5);
		 * 			method(12.4 , 14.5 , 43.2, 123,);
		 * 
		 * 
		 * 
		 * ------------------------
		 * 		How to Work with it 
		 * 
		 * 
		 * 				When you have VarArgs parameter in your method.
		 * 				then you can treat that parameter as an ARRAY.
		 * 
		 * 			public static void myMethod(double... values){
		 * 
		 * 				System.out.println(values[0]);
		 * 			}
		 * 
		 * 
		 * 			Output:
		 * 
		 * 			method();  // ArrayIndexOutOfBount Exception
		 * 			method(12.4 , 14.5); // 12.4
		 * 			method(12.4 , 14.5 , 43.2, 123,); // 162.4
		 * 
		 * ------------------------
		 * 
		 * If you want to add more parameters to your method, 
		 * VarArgs needs to be always the last one:
		 * 
		 * 			Example:
		 * 
		 * 			public static int sum(String name ,int... nums){
		 * 					int sum = 0;
		 * 					System.out.println(name);
		 * 					for( int n : sum){
		 * 						sum += n;
		 * 				}
		 * 					return sum;
		 * 				}
		 * 
		 * 
		 * 			public static int sum(boolean ok,String str ,int... nums){
		 * 
		 * 
		 * ------------------
		 * 
		 * 	When we call method with VarArgs:
		 * 
		 * 	it is very flexible so:
		 * 
		 * 		- we can pass Zero inputs
		 * 		- we can pass any number of inputs
		 * 		- we can pass an array of same type
		 * 
		 * 
		 * public static int addAll(int... nums){
		 * 
		 * }
		 * 
		 * 
		 * 1) add();
		 * 
		 * 2) addAll(23,34,45,46,56);
		 * 
		 * 3) int[] arr = {43,234234,23,43,25,};
		 * 			
		 * 
		 * 
		 */
		
	}
	
}
