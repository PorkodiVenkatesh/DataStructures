package Strings;

import java.util.Scanner;

public class AllSubStrings {

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
    	//write a code to print all the subsequence
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
