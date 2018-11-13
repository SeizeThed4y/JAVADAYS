package practicepublic;

import java.util.Scanner;

public class TipCalculation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Amount of people");
		int numberOfPeople = scan.nextInt();

		System.out.println("Enter Total Amount");
		double totalAmount = scan.nextDouble();

		System.out.println("Enter Quality Of service ~ Poor / Fair / Good / Great / Excellent");
		String qualityOfServers = scan.next();
		 
		System.out.println("Would you like to split or not");
		String splitOrNot = scan.next();

		double afterSplitAmount = 0;

		double totalAmountWithTip = 0;
		System.out.println("=================================");
		switch (splitOrNot) {

		case "Split":

			System.out.println("Split");

			if (qualityOfServers.equalsIgnoreCase("Poor")) {

				totalAmountWithTip = totalAmount + (totalAmount * 0.05);
				afterSplitAmount = totalAmountWithTip / numberOfPeople;

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));
				System.out.println("Total per person: " + afterSplitAmount);
				System.out.println("Tip per person: " + (totalAmountWithTip - totalAmount) / numberOfPeople);

				break;

			} else if (qualityOfServers.equalsIgnoreCase("Fair")) {

				totalAmountWithTip = totalAmount + (totalAmount * 0.1);
				afterSplitAmount = totalAmountWithTip % numberOfPeople;

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));
				System.out.println("Total per person: " + afterSplitAmount);
				System.out.println("Tip per person: " + (totalAmountWithTip - totalAmount) / numberOfPeople);
				break;

			} else if (qualityOfServers.equalsIgnoreCase("Good")) {

				totalAmountWithTip = totalAmount + (totalAmount * 0.15);
				afterSplitAmount = totalAmountWithTip / numberOfPeople;

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));
				System.out.println("Total per person: " + afterSplitAmount);
				System.out.println("Tip per person: " + (totalAmountWithTip - totalAmount) / numberOfPeople);
				break;

			} else if (qualityOfServers.equalsIgnoreCase("Great")) {
				totalAmountWithTip = totalAmount + (totalAmount * 0.20);
				afterSplitAmount = totalAmountWithTip / numberOfPeople;

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));
				System.out.println("Total per person: " + afterSplitAmount);
				System.out.println("Tip per person: " + (totalAmountWithTip - totalAmount) / numberOfPeople);
				break;

			} else if (qualityOfServers.equalsIgnoreCase("Excellent")) {
				totalAmountWithTip = totalAmount + (totalAmount * 0.25);
				afterSplitAmount = totalAmountWithTip / numberOfPeople;

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));
				System.out.println("Total per person: " + afterSplitAmount);
				System.out.println("Tip per person: " + (totalAmountWithTip - totalAmount) / numberOfPeople);
				break;
			}

		case "Not":
			System.out.println("Not Split");

			if (qualityOfServers.equalsIgnoreCase("Poor")) {
				totalAmountWithTip = totalAmount + (totalAmount * 0.05);

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Before Tip Amount: " + totalAmount);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));

				System.out.println();

			} else if (qualityOfServers.equalsIgnoreCase("Fair")) {
				totalAmountWithTip = totalAmount + (totalAmount * 0.1);

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Before Tip Amount: " + totalAmount);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));

			} else if (qualityOfServers.equalsIgnoreCase("Good")) {
				totalAmountWithTip = totalAmount + (totalAmount * 0.15);

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Before Tip Amount: " + totalAmount);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));

			} else if (qualityOfServers.contains("Great")) {

				totalAmountWithTip = totalAmount + (totalAmount * 0.20);

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Before Tip Amount: " + totalAmount);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));

			} else if (qualityOfServers.contains("Excellent")) {
				totalAmountWithTip = totalAmount + (totalAmount * 0.25);

				System.out.println("Number of people ented: " + numberOfPeople);
				System.out.println("Before Tip Amount: " + totalAmount);
				System.out.println("Total pay: " + totalAmountWithTip);
				System.out.println("Total tip: " + (totalAmountWithTip - totalAmount));

				break;
			}

		}
		scan.close();

	}

}
