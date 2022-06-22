package DP.Fibnacci;

import java.util.Arrays;

public class TopDown {

	public static void main(String[] args) {
		//top down
		//memoization
		//recrusion
		int n = 7;
		
		int memo[] = new int[n + 1];
		
		memo [1] = 1;
		memo [2] = 1;
		
		System.out.println(Arrays.toString(memo));
	    System.out.println(fib(n, memo));
	    System.out.println(Arrays.toString(memo));

	}

	private static int fib(int n, int[] memo) {
		
		if (memo[n] == 0) {
			 memo[n] = fib(n-1, memo) + fib(n-2, memo);
		}
		return memo[n];
	}

}

















