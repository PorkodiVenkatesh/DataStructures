package ArraysAndArrayList;

import java.util.Scanner;

public class LeftDiagonal2DArray {

	public static void main(String[] args) {
		// 1. I have to get the number of rows and cols
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows:");
		int rows = sc.nextInt();
		
		System.out.println("Enter cols:");
		int cols = sc.nextInt();
		
		//2. declare the array with row & cols
		
		int[][] a = new int[rows][cols];
		
		//3. get the rows* cols elemts from the user
		System.out.println("enter " + (rows * cols) + " elements:");
		 for (int i = 0; i < rows ; i++) { // rows 
			 
			 for (int j = 0; j < cols; j++) {
				 
				 a[i][j] = sc.nextInt();
			 }
			 
		 }
		 
		 System.out.println("Printing " + (rows * cols) + " elements in a Matrix format:");
		 for (int i = 0; i < rows ; i++) { // rows 	 
			 for (int j = 0; j < cols; j++) {

				System.out.print(a[i][j] +  " ");
			 }
			 System.out.println(); // creates a new line after each rows
		 }
		 
		 System.out.println("Printing the left diagonal elmts"); 
		 for (int i = 0; i < rows ; i++) { // rows 	 
			 for (int j = 0; j < cols; j++) {
			 if(i == j)//1 -> 0,0  5 -> 1,1 9 -> 2,2
				 //i and j are equal for all of my diagonal elements
				System.out.println(a[i][j]);
			 }
			
		 }

	}

}
