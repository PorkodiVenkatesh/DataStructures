package DP2;

import java.util.Scanner;

public class LCS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		// s1.length() -> n and s2.length() ->m 
		int n = s1.length();
		int m = s2.length();
		
		//table -> n+ 1 rows and m + 1 cols
		int table[][] = new int[n+1][m+1];
		// i -> rows -> n  -> s1
		//j -> cols -> m -> s2
		
		for (int i =0; i<=n; i++) {
			for(int j =0; j<=m; j++) {
				//filling first row and cols with zero
				if (i ==0 || j ==0 ) {
					table[i][j] = 0;
				}else if(s1.charAt(i -1) == s2.charAt(j-1)) {
					table[i][j] = table[i-1][j-1] + 1;
				}else {
					table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
				}
			}
		}
		printTable(table, n, m);
		int lcsLength = table[n][m];
		System.out.println("LCS length is " + lcsLength);
		
		String lcs = "";
		int i = n, j = m; //started from the last row and last column
		while(i > 0 && j >0) {
			if(s1.charAt(i-1) == s2.charAt(j-1)) {
				//added to the lcs
				lcs = s1.charAt(i-1) + lcs;
				//goes to the diagonal
				i--;
				j--;
			} else if (table[i-1][j] > table[i][j-1] ){
				i--;
			}else {
				j--;
			}	
		}
		System.out.println("lcs  is " + lcs);
		
	}
	private static void printTable(int[][] table, int n, int m) {
		System.out.println("Table: ");
		for(int i =0; i <=n; i++) {
			for(int j =0; j<=m; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
}
