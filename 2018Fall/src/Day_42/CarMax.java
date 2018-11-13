package Day_42;

public class CarMax {
	
	public static void main(String[] args) {
		Car carOne = new Car();
		
		carOne.setMake("Acura");
		carOne.setModel("ILX");
		carOne.setType("Sedan");
		carOne.setSpeed(35);
		
		
		
		
		System.out.println("Make: " + carOne.getMake());
		System.out.println("Current Speed: " + carOne.getSpeed());
		
		
		carOne.accellerate(30);
		
		
		Car carTwo = new Car();
		System.out.println("Car 2 make: " + carTwo.getMake());
		System.out.println("Car 2 model: " + carTwo.getModel());
		System.out.println("Car 2 type: " + carTwo.getType());
		
		
		Car carThree = new Car("Coupe", "Ford", "Mustang");
		
		
		System.out.println("Car 3 type : " + carThree.getType());
		System.out.println("Car 3 make : " + carThree.getMake());
		System.out.println("Car 3 model : " + carThree.getModel());
		
	}

}
