package Day_30;

import java.util.Scanner;

import Day_31_Method02.Calculator;



public class MethosIntro {
	
	
	public static void main(String[] args) {

		// Anytime you write a method in java, it is associated to a class
		// You write methods within classes.

		/*
		 * Class is template: can have 2 things:
		 * 
		 * - data / attributes - behaviour / methods
		 */
		
		
		/*
		 * We can define our custom methods with in a class. All methods must be written
		 * within a class, it cannot be written outside the class.
		 * 
		 * we can put any number of statements that we want to reuse within the methods.
		 * 
		 * once we write the methods, they do not run unless you call / use them
		 * 
		 * when you calling , you type the "Method Name" it will go and execute the code
		 * within that custom method.
		 * 
		 * 
		 * Example:
		 * 
		 * public class Main
		 * 
		 * public static void main (String[] args){
		 * 
		 * 
		 * sayBye();
		 * 
		 * }
		 * 
		 * 
		 * public static void sayBye(){
		 * 
		 * System.out.println("Bye! have a good day"); }
		 * 
		 */
		
		
		
		/*
		 * write a method askHowRu		that asks " How are you doing " 
		 * 
		 * 
		 * 
		 * 
		 * Write a method reply , that prints " I am doing well , How about you ? "
		 * 
		 * 
		 * 
		 * Write a method sayBye. that says " Bye !! Have good day " 
		 * 
		 * 
		 */

		
		
		Calculator.multiply(10, 2);
		
		
		sayHello();
		askHowRu();
		
		reply();
		reply1();
		sayBye();
		
		
		
		sayHelloTo("Faruk");
		
		
		String nameofOnlineFriend = "Umit";
		
		sayHelloTo(nameofOnlineFriend);
	}
	
public static void sayHelloTo(String name) {
		
	
		System.out.println("Hello " + name);
	}

	public static void sayHello() {

		System.out.println("Hello ");

		
	}
	
	

	
	public static void askHowRu() {
		
		System.out.println("How are you doing");
		
	}
	
	public static void reply() {
		System.out.println("I am doing well , how about you ? ");
	}
	
	public static void reply1() {
		System.out.println("I am good , see you soon");
	}
	
	public static void sayBye() {

		System.out.println("Bye! have a good day");
	}

}
