package DP.Fibnacci;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib (n));
		
		//memo is array using here for top down approach
		int memo[]  =  new int[n+1]; // not 0 th tern -> n+1
		memo[1]  = 1;
		memo[2] = 1;
		System.out.println(Arrays.toString(memo));
		System.out.println(fib(n, memo));
		
		//using bottom up approach
		//tabluation
		//starting from next to base condition and ending at the nth term
		int table[]  = new int[n+1];
		table[1] = 1;
		table[2] = 1;
		for(int i = 3 ; i <= n; i++) {
			table[i] = table[i-1] + table[i-2];
		}
		System.out.println(table[n]);
	}
	
	//using recursion
	public static int fib(int n) {
		System.out.println("fib(" + n + ")" );
		if ( n ==1 || n == 2) 
			return 1;
		return fib(n-1) + fib(n-2);
	}
	
	//using top down -> recursion and storing it  or Memoization
		public static int fib(int n , int[] memo) {
			System.out.println("fib(" + n + ", " + Arrays.toString(memo) + ")" );
			if (memo [n] == 0) {
				memo[n] = fib(n-1, memo) + fib(n-2, memo);
			}
			return memo[n];
		}

}
