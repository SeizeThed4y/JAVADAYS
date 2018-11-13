package MentoringWithAkpar01;

public class Uen_Student_TEst {
	public static void main(String[] args) {
		
		
		Uen_Student u3 = new Uen_Student("faruk", 24);
		
//			System.out.println(u3.getName());
//		
//			u3.setName("Feruk2");
//			System.out.println(u3.getName());
		
			
			System.out.println(Uen_Student.race);
			
			Uen_Student.race = "Uighur";
			
			
			System.out.println(u3.race);
			
			u3.race = "Uyghur";
			
		
			Uen_Student u4 = new Uen_Student("faruk", 24);
		
			System.out.println(u4.race);
		
		
		
		
		
		
		
//		Uen_Student u1 = new Uen_Student();
//		System.out.println(u1.name);
//													// Return Null and 0 , the values are have to before the print
//		System.out.println(u1.age);
//		
//		u1.name = "faruk";
//		u1.age = 24;
//		
//		System.out.println(u1.name);
//		System.out.println(u1.age);
		
	}

}
