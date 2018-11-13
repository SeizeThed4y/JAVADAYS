package day_6_operators_boolean;



public class IncrementDecRementOperators {

	public static void main(String[] args) {
		
		
		int windowsComputers = 35;
		//iccrease by one. add one
		windowsComputers++;
		windowsComputers++;
		
		System.out.println(windowsComputers);
			// long way
			windowsComputers = windowsComputers + 1;
			//shorthand operator
			windowsComputers +=1;
			System.out.println(windowsComputers);
			
			int unreadMessages = 50;
			
			System.out.println("unread messages: " + unreadMessages);
			System.out.println("Reading one message ");
			
			unreadMessages--;
			System.out.println("unread messages: " + unreadMessages);
			unreadMessages--;
			System.out.println(unreadMessages);
	}

}
