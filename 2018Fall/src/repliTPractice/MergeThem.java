package repliTPractice;

public class MergeThem {
	public static void main(String[] args) {
		System.out.println(mergeStrings("asdasdasdasdasd", "12123123123123123"));
	}

	public static String mergeStrings(String one, String two) {
		String total  = "";
	       
		if(one.length() < two.length()){
			for(int i = 0; i <= two.length(); i++){
				if(i == two.length()-1) {
					total = total+two.substring(i);
				}else if(i > one.length()-1){
					total = total+two.substring(i);
					break;
				}else {
		        total = total+ one.charAt(i)+two.charAt(i);
		    		    }
			}      	
		}if(one.length() > two.length()){
			for(int i = 0; i < one.length(); i++){
				if(i == one.length()-1) {
					total = total+one.substring(i);
				}else if(i > two.length()-1){
					total = total+one.substring(i);
					break;
				}else {
					total = total+ one.charAt(i)+two.charAt(i);
		    		    }
			}
		}if(one.length() == two.length()) {
		for(int i = 0; i < one.length(); i++){
			total = total+ one.charAt(i)+two.charAt(i);
	    		    }
	}
		return total;
		
		

	}

}
