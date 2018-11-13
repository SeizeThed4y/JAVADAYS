package Day_40_customclasses;

public class Employee {

	
	
	/*
	 * 
	 * instance variables:
	 * 
	 * first name, last name , email , jobTitle, Salary
	 * 
	 * 
	 * 
	 */
	
	
	
	String firstName;
	String LastName;
	String eMail;
	String jobTitle;
	double hourlySalary;
	
	
	public void work() {
		System.out.println(firstName +" is working as " + jobTitle);
	}
	
	public void yearlySalary() {
		
		
		double total = hourlySalary * 2080;
		
		System.out.println(firstName + " " + LastName +  " earns :" + total + " yearly");
	}
	
	
	
	
//	public static void main(String[] args) {
//		
//		
//		Employee emp1 = new Employee();
//		
//		emp1.firstName = "Faruk";
//		emp1.LastName = "Coskun";
//		emp1.eMail= "frk.coskunn@gmail.com";
//		emp1.jobTitle = "Automation Tester";
//		emp1.hourlySalary = 65;
//		
//		
//		System.out.println("First name: " +emp1.firstName);
//		System.out.println("Last name: " +emp1.LastName);
//		System.out.println("Email address: " +emp1.eMail);
//		System.out.println("Job Title: " +emp1.jobTitle);
//		System.out.println("Hourly Salary: " +emp1.hourlySalary);
//		
//		
//		emp1.yearlySalary();
//		
//		
//		
//		
//	}
	
	
	
}
