package practicepublic;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack1 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		   for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    //TODO. Write you code below this line. 
		  
				int day = 0;
				boolean alive = true;
				while (alive) {
					int count = 0;
					System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
					for (int i = 0; i < inhabitants.length; i++) {
						inhabitants[i] /= 2;   

					}
					day++;
					for (int j = 0; j < inhabitants.length; j++) {
						if (inhabitants[j] == 0) {
							count++;
						}
					}
					if (count == inhabitants.length) {
						alive = false;
					}

				}

				System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
				System.out.println("---- EXTINCT ----");
		    

	}
}