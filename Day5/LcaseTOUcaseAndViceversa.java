package Strings;

import java.util.Scanner;

public class LcaseTOUcaseAndViceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println("Length = " + input.length());
		
		for (int i = 0 ; i < input.length(); i++) {
		   char c = input.charAt(i);
		   if (Character.isLowerCase(c)) {
			   System.out.print(Character.toUpperCase(c));
		   }
		   else if (Character.isUpperCase(c)) {
			   System.out.print(Character.toLowerCase(c));
		   }
//		   else {
//			   //not a letter a-z or A-Z
//		   }
		  
		}
	//	 System.out.println(i + "->" + c + " ascii code ->" + (int) c);	
	//char c1 = 'e';
 // int ascii_c1 = c1;
//  System.out.println(c1 + "  " + ascii_c1);
//  if (Character.isLowerCase(c1)) {//(ascii_c1 >= 97) &&(ascii_c1 <=122)
//	  System.out.println("Its a lowercase");
//	  System.out.println("Converting to UpperCase: " + Character.toUpperCase(c1));
//  }
//  else if (Character.isUpperCase(c1)) {//(ascii_c1>=65) && (ascii_c1<=90)
//	  System.out.println("Its a Uppercase");
//	  System.out.println("Coverting to Lowercase: " + Character.toLowerCase(c1));
//  }

	}

}
