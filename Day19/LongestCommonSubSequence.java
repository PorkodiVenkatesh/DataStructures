package DP.LCS;

import java.util.Scanner;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		// Step 1
		// rows -> n + 1 -> s1.length() + 1;
		// cols -> m+ 1 -> s2.length() + 1;

		int n = s1.length();
		int m = s2.length();

		int table[][] = new int[n + 1][m + 1];

		// step 2 & 3:
		// i and n -> s1
		// j and m -> s2
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i == 0 || j == 0) {
					table[i][j] = 0;
				} else if (s1.charAt(i-1) == s2.charAt(j-1)) {
					table[i][j] = table[i - 1][j - 1] + 1;
				} else {
					table[i][j] = Math.max(table[i][j - 1], table[i - 1][j]);
				}
			}
		}
		
		int length = table[n][m];
		System.out.println(length);
		
		String lcs = "";
		int i = n, j = m;
		while (i >0 && j >0) {
			if (s1.charAt(i-1) == s2.charAt(j-1)) {
				// it should be added in the front
				lcs = s1.charAt(i -1) + lcs;
				//making it to move diagonal
				i--;
				j--;
			}else if ( table[i-1][j] > table[i][j-1]) {
				// if table[i-1][j] is greater/max, that is an element above row same cols
				// making i to decrement 
				// so its goes to above row
				i--;
			}else {
				//if table[i][j-1] is greater/max, that is an element in same row previous cols
				// making j to decrement
				//so its goes to the previous col
				j--;
			}
		}
		
		System.out.println(lcs);

	}
	

}
