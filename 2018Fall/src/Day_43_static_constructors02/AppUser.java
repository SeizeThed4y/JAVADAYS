package Day_43_static_constructors02;

public class AppUser {

	private String userID;
	private String name;
	private String password;
	private static int count = 0;

	public AppUser() {
		count++;
	}

	public AppUser(String userID, String name, String password) {

		this.userID = userID;
		this.name = name;
		this.password = password;
		count++;

	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
