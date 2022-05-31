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
		for (int i = 0; i< q; i++){
		    int n = sc.nextInt();
		    int count =0;
		    for (int j = 0; j <n; j++){
		        int temp = sc.nextInt();
		        if(temp >= 1000){
		            count++;
		        }
		    }
		    System.out.println(count);
		    
		}
	}
}
