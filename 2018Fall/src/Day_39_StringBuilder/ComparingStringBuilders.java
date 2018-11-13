package Day_39_StringBuilder;

public class ComparingStringBuilders {
	public static void main(String[] args) {

		StringBuilder builder1 = new StringBuilder("java");
		StringBuilder builder2 = new StringBuilder("java");

		System.out.println(builder1 == builder2);// FALSE. SINCE BOTH OBJECTS ARE DIFFERENT LOCATIONS
		System.out.println(builder1.equals(builder2));// FALSE.

		// equals method in StringBuilder also checks if both of them are same memort
		// location

		/*
		 * How do we compare
		 * 
		 * Convert to String then call String`s equals method
		 */

		boolean b1 = builder1.toString().equals(builder2.toString());

		System.out.println(b1);

		StringBuilder builder3 = builder1;

		System.out.println(builder3 == builder1);
		System.out.println(builder3.equals(builder1));
		
		
		builder3.append(" programming");
		
		System.out.println(builder3);
		System.out.println(builder1);
		
		
		StringBuilder builder4 = new StringBuilder(builder1);
		System.out.println(builder4);
		
		
		builder1.append("!!!");
		
		System.out.println(builder4);
		System.out.println(builder1);
		System.out.println(builder3);
		
		
		
		
	}

}
