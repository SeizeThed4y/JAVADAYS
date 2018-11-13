package practicepublic;

import java.util.Arrays;
import java.util.Scanner;

public class Snake {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter decimal num: ");
		int decimal = scan.nextInt();
		Boolean go = true;
		
		int arrSize = 0;
		
		int temp = decimal;
		while(decimal != 0) {   // gets number of bits needed 
			temp /= 2;
			if(temp == 0) { 
				arrSize++; 
				break;
			}
			arrSize++;
		}
		
		int binaryArray[] = new int[arrSize]; // array made with appropriate "bit" elements
		
		for(int i = 0; i < arrSize; i++) {
			int remainder = temp /= 2;
			temp %= 2;
			binaryArray[i] = remainder;
			
		}
		System.out.print(Arrays.toString(binaryArray));
		
		
		
		
		
	}

}
