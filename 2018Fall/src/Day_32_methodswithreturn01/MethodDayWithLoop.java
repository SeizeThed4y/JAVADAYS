package Day_32_methodswithreturn01;

public class MethodDayWithLoop {
	public static void main(String[] args) {
		
		System.out.println(isValidDay123("asd"));
		
		System.out.println(isValidDay321("Friday"));
	}
	
	
	
	// For Loop
	
	public static boolean isValidDay123(String day) {
		
		String [] days = {"Monday" , "Tuesday", "Wednesday" , "Thursday", "Friday" , "Saturday" , "Sunday"};
		
		
		
		for (int i = 0; i < days.length; i++) {
			if(day == days[i]) {
				return true;
			}
		}
		return false;
	}
	
	
	// For Each Loop
	public static boolean isValidDay321(String day2) {
		
		String [] days = {"Monday" , "Tuesday", "Wednesday" , "Thursday", "Friday" , "Saturday" , "Sunday"};
		
		for(String validday : days) {
			
			if(validday.equals(day2)) {
				return true;
			}
			
		}
		return false;
	}

}
