package repliTPractice;

public class HamletLogic {
	public static void main(String[] args) {
		
		System.out.println(hamletQuote(true, false));
		
	}
	
	 public static boolean hamletQuote(boolean toBe,boolean notToBe){
		 
		 if(toBe == true || notToBe == true) {
			 return true;
		 }
		 return false;
	 }

}
