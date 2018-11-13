package Day_40_customclasses;

public class ArrayToStb {
	public static void main(String[] args) {
		
		
		String[] words = {"a","b", "c", "d", "e"};
		
		
		StringBuilder stb = new StringBuilder();
		
		for(@SuppressWarnings("unused") String str : words) {
			stb.append(words);
		}
		
		
		
		for(int i = 0; i < words.length; i++) {
			stb.append(words[i]);
		}
		

	}
}
	