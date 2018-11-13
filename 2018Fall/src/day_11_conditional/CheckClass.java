package day_11_conditional;

import java.util.Scanner;

public class CheckClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the Day: ");
		int day = scan.nextInt();
				
				String ClassAtSchool= "";
				String WeekDayName = "";

				
				switch(day) {
				case 1:
					ClassAtSchool = "Group Project";
					WeekDayName = "Monday";
					break;
				case 2:
					ClassAtSchool = "Java";
					WeekDayName = "Thursday";
					break;
				case 3:
					ClassAtSchool = "Java";
					WeekDayName = "Wednesday";
					break;
				case 4:
					ClassAtSchool = "Soft Skill";
					WeekDayName = "Thursday";
					break;
				case 5: 
					ClassAtSchool = "Mentoring / No class";
					WeekDayName = "Friday";
					break;
				case 6:
					ClassAtSchool= "Java";
					WeekDayName = "Saturday";
					break;
				case 7:
					ClassAtSchool = "java";
					WeekDayName = "Sunday";
					break;
					default:
						System.out.println("Week has only 7 days");
				}
				System.out.println(WeekDayName+ " we have "+ ClassAtSchool +" class.");
				scan.close();
	}

}
