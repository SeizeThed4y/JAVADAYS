package day_8_contionals2;

import java.util.Scanner;

public class ChooseALangauge {

	public static void main(String[] args) {
		/*
		 * English --> 1
		 * Spanish --> 2
		 * Turkish --> 3
		 * Russian --> 4
		 * Uyghur  --> 5
		 * Uzbek   --> 6
		 * Kyrgyz  --> 7
		 * Tajik   --> 8
		 */

		System.out.println("Please Select: English --> 1 \n"+ 
										"Spanish --> 2 \n"+
										"Turkish --> 3 \n"+
										"Russian --> 4 \n"+
										"Uyghur --> 5 \n"+
										"Uzbek --> 6 \n"+
										"Kyrgyz --> 7 \n"+
										"Tajik --> 8 \n");
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter the number of language");
		int language = scan.nextInt();
					
		//int language = 1;
		String greeting = "";
		
		if(language == 1) {
			greeting = " Hello, how are you ";
		}else if (language == 2) {
			greeting = " Hola como estas ";
		}else if (language == 3) {
			greeting = " Merhaba, Nasilsin ";
		}else if (language == 4) {
			greeting = ("Privet kak dela");
		}else if (language == 5) {
			greeting =("Yahxi mu");
		}else if (language == 6) {
			greeting =("salom qaleysan");
		}else if (language == 7) {
			greeting = ("salam Kandaysin ");
		}else if (language == 8) {
			greeting = 	("Salom, sumo ci xel");
		}else {
			System.out.println("I cannot speak that langauge sorry :/");
		}
		
		System.out.println(greeting);
		
		scan.close();
					
									
	}

}
