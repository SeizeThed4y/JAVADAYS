package Day_39_StringBuilder;

public class AppendAlphabet {
	public static void main(String[] args) {
		
		StringBuilder stb1 = new StringBuilder();
		
		char ch = 'A';
		ch++;
		
		System.out.println(ch);
		
		
		for(char chars = 'A'; chars <= 'Z'; chars++) {
			System.out.println(chars);
			
			stb1.append(chars);
		}
		
		
		System.out.println(stb1);
		
		String a = "12,2";
		
		double d1 = Double.parseDouble(a);
		
	
		
		
		
	}

}
