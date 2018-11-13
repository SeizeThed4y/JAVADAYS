package Day_38_WrapperClass_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingVsUnBoxing {

	public static void main(String[] args) {
		
		
		//auto boxing. take primitve and convert into Wrapper class object
		
		
		int i = 1000;
		
		Integer j = i;
		
		boolean b = true;
		Boolean b1 = b;
		
		
		List<Integer> nums = new ArrayList<>();
		
		
		nums.add(433);
		int p = 555;
		
		nums.add(p);
		
		
		//Unboxing ==> taking the wrapper class object and converting into primitive and it happens automatically
		
		
		int r = nums.get(0);
		
		
		Boolean bool = new Boolean(false);
		boolean boolPrim = bool;
		
		
		
		Character chObj = '^';
		char chPrim = chObj;
		
		System.out.println(chPrim);
		
	}
}
