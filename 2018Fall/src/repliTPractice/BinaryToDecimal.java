package repliTPractice;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		    
		    int[] binary = new int[100];
		    
		    
		    
		    for(int i =0; i < binary.length; i++) {
		      binary[i] = input.nextInt();
		    }
		
		
		int sum=0; 
	    int powers=binary.length-1;
		   for (int a=0; a<8; a++) {
		   	if (binary[a]==1) {
		   		sum+=(int) Math.pow(2, (powers-a));
		   	}
		   	
		    }System.out.println(sum);
	}

}
