package Day_43_static_constructors02;

public class TvRunner {

	public static void main(String[] args) {

		TV myTV = new TV();  // INSTANTIATION	
		TV smartTV = new TV("Sharp"); //instantiating TV class
		TV cTV = new TV("HP");

		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cTV.isOn());

		myTV.turnOn();
		smartTV.turnOn();
		cTV.turnOn();

		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cTV.isOn());

		myTV.turnOn();
		System.out.println(myTV.isOn());

		myTV.setChannel(20);
		smartTV.setChannel(55);

		System.out.println("MyTV: " + myTV.getChannel());
		System.out.println("SmartTV: " + smartTV.getChannel());
		System.out.println("cTV: " + cTV.getChannel());
		
		
		myTV.channelUp();
		smartTV.channelDown();
		
		System.out.println("MyTV: " + myTV.getChannel());
		System.out.println("SmartTV: " + smartTV.getChannel());
		
		
		cTV.turnOff();
		
		cTV.setChannel(22);
		
		
		
		
		
	}

}
