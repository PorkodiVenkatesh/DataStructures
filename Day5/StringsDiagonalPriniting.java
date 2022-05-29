package Strings;

import java.util.Scanner;

public class StringsDiagonalPriniting {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String s = sc.next();
		 
		 for (int i =0; i<s.length(); i++) {
			 char c = s.charAt(i);
			 for(int spaces = 1; spaces <=i; spaces++) {
				 System.out.print(" ");
			 }
			 System.out.println(c);
		 }

	}

}
