package day_9_conditional;

import java.util.Scanner;

public class RangeTests {

	public static void main(String[] args) {
		
		
		//max range for in class student is 60 !!
		//check if student is more than or equal 5 and less than 30
		// print "lets do mentoring session"
		//students more then or equal to 30 and less than or equal to 60
		//print lets have a lecture
		//if more than 60
		// print how many students need to take class online
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Add How many Students in the class");
		int students = scan.nextInt();
		
		
		//int students = 10;
		
		if(students >= 5 && students < 30){
			System.out.println("Lets do mentoring session");
		}else if (students >= 30 && students <=60) {
			System.out.println("Lets have a lecture");
		}else if(students > 60) {
			int online = students - 60;
			System.out.println(online + " students need to take online class");
		}else {
			System.out.println("Not enought student for mentoring , lecture , class online and ask them WHAT ARE THEY DOING EXCEPT COME TO THE SCHOOL :/");
		}
		
		scan.close();

	}

}
