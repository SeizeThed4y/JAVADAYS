package HomeworkArray;

public class Task8 {

	public static void main(String[] args) {
		/*loop a string array filled with fruit names and count how many instances of the
		string "banana" are inside the array, after the loop print how many instances of
		banana you find.
		this is the array:
		*/
		
		
		String[] list = new String[]
		{"banana","apple","pinapple","banana","mango","banana"};
		
		String result = "banana";
		boolean found = false;
		for ( int i = 0; i < list.length ;i++) {
			if(list[i] == result) {
				System.out.println(result + " Banana found at inxde " + i);
				
			}
		}

	}

}
