package MentoringWithAkpar01;

public class Uen_Student {

	
	//instance variable
	static String race = "UYGHUR";
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Uen_Student() {
		System.out.println("Default constructor");
	}

	public Uen_Student(String aName, int aAge) {

		this.name = aName;
		this.age = aAge;

		System.out.println("2 args constructor");

	}

	public void study() {
		System.out.println("Studying");
	}

}
