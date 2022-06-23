package DP.knapSack;

import java.util.Arrays;
import java.util.Scanner;

public class KnapSack01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of items:");
		int n = sc.nextInt();
		
		System.out.println("Enter the capacity of bag/knapScak:");
		int capacity = sc.nextInt();
		
		int weight[] = new int[n];
		int value[] = new int[n];
		
		System.out.println("Enter the weight and value for " + n + " items:");
		for(int i = 0; i < n ; i++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}
		
		System.out.println("Priniting the item's weight and values");
		for(int i = 0; i < n ; i++) {
			System.out.println(i + " -- "+ weight[i] + " -- " + value[i]);
		}
		
		//step 1
		//rows = numbers of items + 1 = n+1 
		//cols = capacity + 1
		
		int table[][] = new int[n+1][capacity+1];
		
		
		//Step 2
		//set the base condition
		//my first row and my col are zeros
		
		for (int i =0 ; i <= n ; i++) { 
			// i =  0, 1, 2,....n -> rows
			// cols = 0		
			table[i][0] = 0;
		}
		
		for(int j = 0 ;  j<= capacity; j++) {
			//j -> cols -> 0, 1, .... capacity
			table[0][j] = 0;
		}
		
		//step3 
		//Use the knapsack formula
		//T(i,j) = max { T(i-1, j) , Vi + T(i-1, j -Wi)
		//table[i][j] = Math.max(x,y)
		//x = T(i-1, j) = table[i-1][j]
		//y = Vindex + T(i-1,j- Windex)  //index = i-1;
		//y = value[index] + table[i-1][j-Windex]
		//table[i-1][j-Windex] when my j > Windex
		
		for  (int i = 1 ;  i <=n ; i++) {
			for (int j = 1; j <= capacity; j++) {
				//in table array, here i = 1  means item 1
				//whereas in weight and values array, index = 0 means item 1
				int index = i-1;
				
				int x = table[i-1][j];
				int y = 0;
				
				if (j >= weight[index]) {
					y = value[index] + table[i-1][j-weight[index]];
				}
				
				table[i][j] = Math.max(x, y);
				System.out.println("i = " + i  + ", j = " + j + ", at table = "+ table[i][j] );
				
			}
			System.out.println("-----------------------------------");
		}
		
		int max = table[n][capacity];
		System.out.println(max);
		
		int included[] = new int[n];
		int W = capacity;
		int remProfit = max;
		
		for (int i = n ; i> 0 && remProfit > 0; i--) {
			//comparing with the previous rows
			//if its same
			//then moving a step up
			if (remProfit == table[i-1][W]) {
				continue;
			}
			else {
				// including that item and reducing its value and weight from the maxValue and Capacity
				int index = i-1;
				included[index] = 1;
				remProfit = remProfit - value[index];
				W = W - weight[index];
			}
		}
	System.out.println(Arrays.toString(included));
		
	}

}
