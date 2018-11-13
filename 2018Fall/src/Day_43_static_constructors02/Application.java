package Day_43_static_constructors02;

public class Application {
	
	public static void main(String[] args) {
		
	
	
	AppUser user1 = new AppUser("faruk123", "feruk", "123abc");
	AppUser user2 = new AppUser("kurxat123", "kurxat", "abc123");
	AppUser user3 = new AppUser("abida123", "abida", "9876abc");
	
	
	user1.setCount(100);
	
	System.out.println(user1.getCount());
	System.out.println(user2.getCount());
	System.out.println(user3.getCount());
	
	
	AppUser user4 = new AppUser();
	
	
	System.out.println(user4.getCount());
		
	
	
	System.out.println(user1.getUserID());
	System.out.println(user2.getUserID());
	
	
	}
	
	
	

}
