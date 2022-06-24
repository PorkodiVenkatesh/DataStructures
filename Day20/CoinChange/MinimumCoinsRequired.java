package DP.CoinChange;

import java.util.Scanner;

public class MinimumCoinsRequired {

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
		
		
		//base conditions
		//when your target sum is zero that time you not 
		//included any of the coin
		//table[i][0] = 0
	     for(int i =0; i <= n ; i++) {
	    	 table[i][0] = 0;
	     }
	     
	     //when your sum is from1
	    // that time on row 0 you can have value as sum + 1
	     for(int j = 1; j <= sum; j++) {
	    	 table[0][j] = sum +1;
	     }
	     
	     for (int i =1; i <=n ; i++) {
	    	 for (int j = 1; j <= sum; j++) {
	    		 int index = i -1;
	    		 if ( j >= coins[index]) {
	    			 table[i][j] = Math.min(table[i-1][j], 1 + table[i][j - coins[index]]);
	    		 }else {
	    			 table[i][j] = table[i-1][j];
	    		 }
	    		 System.out.println("i = " + i + " j= " + j + " At table = " + table[i][j]);
	    	 }
	    	 System.out.println("-------------------------------------------");
	     }
	     
	     int min = table[n][sum];
	     System.out.println("Mininmun number of coins required = " + min);
	     
	     System.out.println("The coins are:");
	     int targetSum = sum; //col
	     int i = n; //row
	     while(i > 0 && targetSum >0) {
	    	 if (table[i][targetSum] == table[i-1][targetSum]) {
	    		 i--;
	    	 }else {
	    		 int index = i-1; // i -> c1 in the coin array its in the 0 th index
	    		 int tookCoin = coins[index];
	    		 System.out.println(tookCoin);
	    		 targetSum = targetSum - tookCoin;
	    	 }
	     }

	}

}
