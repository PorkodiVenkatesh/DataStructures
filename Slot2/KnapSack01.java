package DP2;
import java.util.Arrays;
import java.util.Scanner;
public class KnapSack01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many items?");
		int n = sc.nextInt();
		
		int wt[] = new int[n]; //weights of all items
		int val[] = new int[n];  // values or profit of all items
		// index = 0, refers to the item 1
		//index = 1, refers to the item 2
		
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter the weight for item " + (i+1));
			wt[i] = sc.nextInt();
			System.out.println("Enter the value or profit for item " + (i+1));
			val[i] = sc.nextInt();
		}
		
		System.out.println("Enter the knapszack/bag capacity:");
		int capacity = sc.nextInt();
		
		//table: rows -> no of items + 1 -> n + 1
		//       cols -> capacity + 1
		
		int table[][] = new int[n+1][capacity +1];
		//i-> rows -> 0 to n
		//j -> cols -> 0 to capacity
		// in table i = 1 refers to the item 1
		// in table i = 2 refers to the item 2
		
		// index = i -1 -> then its refers to the same item 
		
		//0th row as 0
		//i have not included any items, so profit goona be 0
		for (int j = 0; j <= capacity ; j++) {
			table[0][j] = 0;
		}
		
		//0 th cols
		//i have not included any items, so profit goona be 0
		for (int i = 0; i <= n ; i++) {
			table[i][0] = 0;
		}
		
		//t(i,j) = max{ t(i-1, j), val[i] + t(i-1, j - wt[i])}
		//j < wt[i] -> - value -> not include
		
		for (int i = 1; i <=n ; i++) {
			for (int j = 1;  j<= capacity; j++) {
				int index = i-1;
				if(j < wt[index]) {
					table[i][j] = table[i-1][j];
				}else {
					table[i][j] = Math.max(table[i-1][j], val[index] + table[i-1][j - wt[index]]);
				}
			}
		}
		printTable(table , n, capacity);
		
		int maxProfit = table[n][capacity];
		int col = capacity;
		System.out.println("Max profit is " + maxProfit);
		
		int included[] = new int[n];
		int remProfit = maxProfit;
		for (int i =n; i > 0 && remProfit > 0; i--) {
			if(remProfit == table[i-1][col]) {
				continue;
			}else {
				int index = i-1;
				System.out.println("Included the item " + i);
				col = col - wt[index];
				included[index]  = 1;
				remProfit = remProfit - val[index];
			}	
		}
		
		System.out.println(Arrays.toString(included));
		
	}

	private static void printTable(int[][] table, int n, int capacity) {
		System.out.println("Table: ");
		for(int i =0; i <=n; i++) {
			for(int j =0; j<=capacity; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}

}
