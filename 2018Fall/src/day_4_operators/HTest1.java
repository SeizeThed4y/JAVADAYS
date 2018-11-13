package day_4_operators;

import java.util.Scanner;

public class HTest1 {
		public static void main(String[] args) {
			
			// ~~~ (Scanner Task) how much money would you save between next weekend and this weekend. ~~ //
			
			char dollars = '$';
			
			Scanner scan = new Scanner(System.in);
				System.out.println("Please Enter the next weekend ticket prices");
				
				int nextweekendTicket = scan.nextInt();
				
				System.out.println("How much is the ticket for this weekend");
			
				int thisweekendTicket = scan.nextInt();
				
				int saving = nextweekendTicket - thisweekendTicket;
				
				System.out.println("If you would like to fly next weekend the price is " + nextweekendTicket + dollars + " for this weekend the price is " + thisweekendTicket + dollars
						+ " and you saving for next weekend is " + saving + dollars);
				
				scan.close();
		}

}
