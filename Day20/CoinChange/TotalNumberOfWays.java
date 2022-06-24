package DP.CoinChange;

import java.util.Scanner;

public class TotalNumberOfWays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many no of coins?");
		int n = sc.nextInt();
	
		int coins[] = new int[n];
		System.out.println("Enter the coins");
		for (int i =0; i < n; i++) {
			coins[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount/sum:");
		int sum = sc.nextInt();
		
		//rows -> no of coins + 1 -> n+1
		//cols -> sum + 1		
		int table[][] = new int[n+1][sum+1];
		
		//base condition
		//when my sum is 0 that means i'm not considering any coins
		//so I would take that as 1 way
		for (int i = 0; i <= n ; i++ ) {
			table[i][0] = 1;
		}
		
		//1st row as 0
		for (int j = 0; j <= sum ; j++ ) {
			table[0][j] = 0;
		}
	
	     
	     for (int i =1; i <=n ; i++) {
	    	 for (int j = 1; j <= sum; j++) {
	    		 int index = i -1;
	    		 if ( j >= coins[index]) {
	    			 table[i][j] = table[i-1][j] + table[i][j - coins[index]];
	    		 }else {
	    			 table[i][j] = table[i-1][j];
	    		 }
	    		 System.out.println("i = " + i + " j= " + j + " At table = " + table[i][j]);
	    	 }
	    	 System.out.println("-------------------------------------------");
	     }
	     
	     
	     int ways = table[n][sum];
	     System.out.println("Total Number of ways = " + ways);
	}

}
