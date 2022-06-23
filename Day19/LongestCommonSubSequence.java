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

	}
}
