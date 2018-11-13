package Day_40_customclasses;

public class Company {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.firstName = "Zuhre";
		emp1.LastName = "Jawdet";
		emp1.eMail = emp1.firstName + emp1.LastName+ "@gmail.com";
		emp1.jobTitle = "Automation Tester";
		emp1.hourlySalary = 0;

		emp2.firstName = "Faruk";
		emp2.LastName = "Coskun";
		emp2.eMail = emp2.firstName + emp2.LastName + "@gmail.com";
		emp2.jobTitle = "Automation Tester";
		emp2.hourlySalary = 80;

		
		
		
		System.out.println(emp1.eMail.toLowerCase());
		System.out.println(emp2.eMail.toLowerCase());
		
		
		emp1.work();
		
		emp1.yearlySalary();
		emp2.yearlySalary();
	}

}
