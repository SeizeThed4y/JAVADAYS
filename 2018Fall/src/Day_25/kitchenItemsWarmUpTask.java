package Day_25;

import java.util.Scanner;

public class kitchenItemsWarmUpTask {
		public static void main(String[] args) {
			
			
			
					
			
			String [] kitchkenItems = {"knife", "wooden spoons", "plates", " cups", "forks", "pan", "pot","trash can", "fridge", "dishwasher"};
			
			
			
			for (String items : kitchkenItems ) {
				switch(items) {
				case "knife":
					System.out.println("Knife is used for cutting veggies");
					break;
				case "wooden spoons":
					System.out.println("mix soups");
					break;
				case "plates":
					System.out.println("plates use for serving foods");
					break;
				case "cups":
					System.out.println("cups use for drink coke");
					break;
					
				case "forks":
					System.out.println("forks use for eat pasta");
					break;
					
				case "pan":
					System.out.println("Pan use for fried egg");
					break;
						
				case "pot":
					System.out.println("use for chinese food Hot Pot");
					break;
					
				case "trash can":
				System.out.println("Put somebody you really dont need it");
				break;
				
				case "fridge":
					System.out.println("Use to put your food in to keep it cool");
					break;
					
				case "dishwasher":
					System.out.println("use for washing dishes without human power + saving money and water");
					break;
					
					default:
						System.out.println("I dont know this item");
				}
			}
				
			
				
			
		}
}
