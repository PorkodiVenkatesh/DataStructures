package Strings;

import java.util.Scanner;

public class isValidPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password:");
		String password = sc.next();
		
		/*
		 *  atleast one
		 *  Lowercase
		 *  Uppercase
		 *  Digit 
		 *  Splchar
		 */
		
		/* 
		 * Input -> password
		 * Output -> yeah, its valide
		 * Output -> its not you're missing(UC/LC/D/SPl)
		 */
		int lowerCase = 0;
		int upperCase = 0;
		int digits =0;
		int splChars =0;
		for (int i = 0 ; i < password.length(); i++) {
			char  ch = password.charAt(i);
			if(Character.isLowerCase(ch))
				lowerCase++;
			else if (Character.isUpperCase(ch))
				upperCase++;
			else if(Character.isDigit(ch))
				digits++;
			else
				splChars++;
		}
		
		System.out.println("upperCase = " + upperCase);
		System.out.println("lowerCase = " + lowerCase);
		System.out.println("Digits = " + digits);
		System.out.println("splChars = " + splChars);
		
		
		if((upperCase == 0) || (lowerCase == 0) ||(digits ==0) ||(splChars ==0))
			System.out.println("Its not a valid password");
		else
			System.out.println("Its a valid password");
		

	}

}
