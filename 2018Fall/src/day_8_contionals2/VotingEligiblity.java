package day_8_contionals2;

import java.util.Scanner;

public class VotingEligiblity {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Age: ");
		int voteAge = scan.nextInt();

		 //int voteAge = 646;

		if (voteAge >= 18) {
			System.out.println("You are eligiblity to vote");
		} else {
			System.out.println("You are not eligiblity to vote");
		}

		scan.close();

	}

}
