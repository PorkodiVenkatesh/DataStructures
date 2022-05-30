package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String s = sc.next();
		 
		 StringBuffer sb = new StringBuffer(s);
		 
		 sb.reverse();
		 
		 String rev_s = sb.toString();
		 
		 if(s.equals(rev_s)) {
			 System.out.println("It is a Palindrome");
		 }else {
			 System.out.println("It is not a Palindrome");
		 }
		 

	}

}
