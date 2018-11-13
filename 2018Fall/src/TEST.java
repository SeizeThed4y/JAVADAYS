import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TEST {
	public static void main(String[] args) {
		
		String db,op,id,data;  
		
		db = "1test#2bla#3foo";
		
		op = "add";
		
		id = "4";
		
		data = "aaa";
		
		String result = "";

		if (op.equalsIgnoreCase("add")) {
			result = db + "#" + id + data;
		}

		if (op.equalsIgnoreCase("edit")) {

			String[] str = db.split("#");

			result = str[0] + str[1].replaceAll(str[1], "#" + id + data) + "#" + str[2];

		}
		String[] split2 = db.split("#");

		 if (op.equalsIgnoreCase("delete")) {
			
			if (split2[0].contains(id)) {
				result = db.replace(split2[0], "");

			} else if (split2[1].contains(id)) {
				result = db.replace(split2[1], "");
			} else if (split2[2].contains(id)) {
				result = db.replace(split2[2], "");
			}

		}
		 
		 
		 
		if(op.equalsIgnoreCase("none")) {
			result = db;
			
			
		}
		
		System.out.println(result);
	}
}
