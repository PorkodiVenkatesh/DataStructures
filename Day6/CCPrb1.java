/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static boolean isPalindrome(String s){
        
        StringBuffer sb = new StringBuffer(s);
		 
		 sb.reverse();
		 
		 String rev_s = sb.toString();
		 
		 if(s.equals(rev_s)) 
		   return true;
		 else
		  return false;
		 
    }
    
	public static void main (String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 String[]  s = new String[n];
		 
		 
		 for (int i =0; i< n; i++){
		     s[i] = sc.next();
		 }
		 
		 for (int i =0; i< n; i++){
		     if(isPalindrome(s[i]))
		      System.out.println("wins");
		      else
		      System.out.println("loses");
		 }
		 
	}
}
