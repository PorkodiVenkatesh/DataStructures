package Strings;

import java.util.Scanner;

public class AllSubStringsandSubSequences {

	 // Prints all subarrays in arr[0..n-1]
    static void allSubString(String s)
    {
        int n = s.length();
        // Pick starting point
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++)
                {
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
           
        }
    }
    static void allSubSequence(String s) {

        int n = s.length();
        // Pick starting point
        for (int i=0; i <n; i++)
        {   
        	//System.out.println("Printing the char in starting point-> " + s.charAt(i));	
        	System.out.println(s.charAt(i));
        	
        	//fixing the pos // j-> ending point for fixing temp
        	for(int j = i+1; j <n ; j++) {
        		String temp = s.substring(i, j);
        		//System.out.println("fixing-> " + temp);
    
        		//interchanging chars
        		for(int k = j; k < n; k++) {
        			System.out.println(temp + s.charAt(k));
        		}
        	}
        }
    	
    	
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("::SubStrings::");
		allSubString(s);
		System.out.println("::SubSequence::");
		allSubSequence(s);
	}
}
