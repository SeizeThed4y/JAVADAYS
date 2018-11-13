package practicepublic;

public class StringSplitMethod {

	public static void main(String[] args) {
		
		
		/*email -> info@cybertekschool.com
		Print:  
		Email id: info
		Email domain: cybertekschool.com
		*/
		String str = new String("Java is fun");
		
		
		
		String [] word = str.split(" ");
		
		for ( int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		
		
		
			
			
		
	
	
	}

}
