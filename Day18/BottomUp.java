package DP.Fibnacci;

import java.util.Arrays;

public class BottomUp {
	public static void main(String[] args) {
		// bottom up
		//tabulation
		//iterative approach
		
		int n = 7;
		int f[] = new int[n+1];
		
		f[1] = 1;
		f[2] = 1;
		System.out.println(Arrays.toString(f));
		
		
		for(int i = 3; i  <= n; i++) {
			f[i] = f[i-1] + f[i-2];
			System.out.println(Arrays.toString(f));
		}
		
		System.out.println(f[n]);
	}

}
