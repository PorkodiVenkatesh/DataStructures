/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=0;i<4;i++)
		{
 		    int n=sc.nextInt();
		    if(n>=10) 
 		      count+=1;
 		}
		System.out.println(count);


	}
}
