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
	   int q = sc.nextInt();
	   for (int i =0; i < q; i++){
	       int length = sc.nextInt();
	       int x = sc.nextInt();
	       String s = sc.next();
	       Set<Integer>  points = new HashSet<>();
	       points.add(x);
	       
	       for (int j = 0; j < length ; j++){
	            char ch = s.charAt(j);
	            if (ch == 'R'){
	                ++x;
	                points.add(x);
	            }
	            if (ch == 'L'){
	                --x;
	                points.add(x);
	            }
	       }
	       
	       System.out.println(points.size());
	   }
	}
}
