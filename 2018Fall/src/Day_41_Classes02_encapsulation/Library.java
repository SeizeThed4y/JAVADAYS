package Day_41_Classes02_encapsulation;

public class Library {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setTitle("Silence");
		b1.setAutor("Mike");
		b1.setPages(123);
		
		Book javaBook = new Book();
		javaBook.setTitle("Headfirst Java");
		javaBook.setAutor("Kathy Siearra , Bert bates");
		javaBook.setPages(543);
		
		System.out.println("Title 1: " + b1.getTitle());
		System.out.println("Title 2: " + javaBook.getTitle());
		
		
		System.out.println("Autor 1: " + b1.getAutor());
		System.out.println("Autor 2: " + javaBook.getAutor());
		
		
		System.out.println("Book #1 Page: " + b1.getPages());
		System.out.println("Book #2 Page: " + javaBook.getPages());
		
		
		
	}
	
	

}
