/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String s  = sc.next();
	    int n = sc.nextInt();
	    String words[] = new String[n];
	    for (int i =0; i< n; i++){
	        words[i] = sc.next();
	    }
	    
	    ArrayList<Character> letters  = new ArrayList(); // 'a', 'c', 't'
	    for(int i = 0; i < s.length(); i++){
	        letters.add(s.charAt(i));
	    }
	    
	   for (int i =0; i< n; i++){//book has n words
	       String wordStr = words[i]; //word in the book
	       boolean canRead = true; // jeff canRead tat word
	       for(int k = 0 ; k < wordStr.length(); k++){ // going through each char in the word to check that char 
	       //is known by jeff or not
	           char c = wordStr.charAt(k);
	           if(!letters.contains(c)){
	               canRead = false;
	               break;
	           }
	       }
	       if(canRead){
	           System.out.println("Yes");
	       }
	       else{
	           System.out.println("No");
	       }
	       
	   }
	    
	    
	}
}
