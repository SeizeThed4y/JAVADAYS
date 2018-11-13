package Day_38_WrapperClass_StringBuilder;

import java.util.ArrayList;

public class ConvertStringToPrimitive {
	public static void main(String[] args) {
		
		String count = "432";
		
		int iCount = Integer.parseInt(count); // It converts String to Integer.
		
		if(iCount > 0) {
			System.out.println("Positive");
		}else {
			System.out.println("not positive");
		}
		
		
		String str = "Price is 45.77";
		
		
		String [] sp = str.split(" ");
		
		/*
		 * sp ==  
		 * 
		 * 		Price
		 * 		
		 * 		is
		 * 
		 * 		45.77
		 * 		
		 */
		
		double price = Double.parseDouble(sp[2]);
		
		System.out.println(price);
		
		
		String etsyResult = "”wooden spoon” (13,950 Results)";
		
		String[] etsyArray = etsyResult.split(" ");
		
		String strSpoonCount = etsyArray[2].replace("(", "").replace(",", "");		
		
		int woodenSpoons = Integer.parseInt(strSpoonCount);	
	

		System.out.println(woodenSpoons);
		///////////////////////
		
		
		
		
		// Convert String to Integer ArrayList 
		
		String[] sNums = {"234" , "345" , "23" , "12"};
		
		ArrayList<Integer> listNums = new ArrayList<>();
		
		for(String num : sNums) {
			
			listNums.add(Integer.valueOf(num));
		}
		
		System.out.println(listNums);
		
	}

}
