package Strings;

import java.util.Scanner;

public class RemovingVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	   String s = "Apple";
//	   char charToRemove = 'p';
//	   System.out.println(s.replace(charToRemove, ' '));
//	   System.out.println(s + " Length -> " + s.length());	 
	  
//	   s = s.replace(charToRemove,' ');
//	   System.out.println(s + " Length -> " + s.length());
//	   
//	   s = "Apple";
//	   String charToRemoveAsString = "p";
//	   s = s.replace(charToRemoveAsString,"");
//	   System.out.println(s + " Length -> " + s.length());
		
		
//		String s =""; //s is pointing a empty String 
//		System.out.println(s.length()); //length is 0
		
//		String s1 = null; //s1 is not pointing to nothing
//		System.out.println(s1.length());
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toLowerCase();
		
		for(int i = 0; i< s.length(); i++) {
			char ch = s.charAt(i);
			if(( ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
				//converting char to string 
				//why -> thats when i can use replace with empty string
				//to remove a char from the string
				String charToRemoveAsString = String.valueOf(ch);
				s = s.replace(charToRemoveAsString, "");
			}
		}
	
		System.out.println(s);
		

	}

}
