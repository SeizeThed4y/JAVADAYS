package Day_18;

public class warmUpStringManupulation {

	public static void main(String[] args) {

		String SMSmessage = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

		String sender,phoneNumber,message;
	
		
		
		sender = SMSmessage.substring(SMSmessage.indexOf("<")+1, SMSmessage.indexOf(">"));
		
		System.out.println(sender);
		
		
		phoneNumber = SMSmessage.substring(SMSmessage.indexOf("[")+1, SMSmessage.indexOf("]"));
		System.out.println(phoneNumber);
		
		
		message = SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}"));
		System.out.println(message);

//		System.out.println(SMSmessage.indexOf("Mike"));
//		System.out.println(SMSmessage.indexOf("Smith"));
//
//		sender = SMSmessage.substring(8, 18);
//
//		System.out.println(sender);
//
//		System.out.println(SMSmessage.indexOf("[202-123-3456"));
//
//		phoneNumber = SMSmessage.substring(33, 47);
//		System.out.println(phoneNumber);
//
//		System.out.println(SMSmessage.indexOf("{"));
//
//		message = SMSmessage.substring(57);
//
//		System.out.println(message);
	}

}
