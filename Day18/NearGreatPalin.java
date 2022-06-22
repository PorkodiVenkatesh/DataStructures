package infosys;

import java.util.Scanner;

public class NearGreatPalin {
	public static boolean isPalindrome(String s)
    {
       String revS  = new StringBuffer(s).reverse().toString();
         return s.equals(revS);
    }
   
    public static void main(String[] args)
    {  
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
       
        String  s = num + "";
   
        while (isPalindrome(s) == false) {       
        	num = num + 1;
        	s = num +"";
  
        }
        //System.out.print("Next Palindrome :");
        System.out.println(num);
    }
}

