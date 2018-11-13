package Day_32_methodswithreturn01;

public class MethodTaskPractice1 {
	public static void main(String[] args) {

		System.out.println(isValidDay("Friday"));

		System.out.println(isValidDay2("Sunday"));

		System.out.println(isValidDay3("Monday"));

	}

	// isValidDay method accepts a weekdayName, and checks
	// if it is a valid one of 7 days then return true , otherwise return false

	// 1st way
	public static boolean isValidDay(String day) {

		switch (day) {
		case "Monday":
			return true;

		case "Thusday":
			return true;

		case "Wednesday":

			return true;
		case "Thursday":
			return true;
		case "Friday":
			return true;
		case "Saturday":
			return true;

		case "Sunday":
			return true;

		}

		return false;

	}

	// 2nd way
	public static boolean isValidDay2(String day) {

		//day = day.toLowerCase().trim();

		if (day.equals("Monday") || day.equals("Thueday") || day.equals("Wednesday") || day.equals("Thursday")
				|| day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")) {
			return true;
		}
		return false;
		
	}

	// 3rd way
	public static boolean isValidDay3(String day) {
		return (day.equals("Monday") || day.equals("Thueday") || day.equals("Wednesday") || day.equals("Thursday")
				|| day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday"));
	}

}