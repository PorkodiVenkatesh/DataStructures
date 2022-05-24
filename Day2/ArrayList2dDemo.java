package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2dDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. I have to get the number of rows and cols
	Scanner sc = new Scanner(System.in);
				
	System.out.println("Enter rows:");
	int rows = sc.nextInt();
				
		System.out.println("Enter cols:");
		int cols = sc.nextInt();

		//2. create 2d Arraylist
		
		ArrayList<Integer> list = new ArrayList<>();
		
		ArrayList al2d = new ArrayList(list);
		//3. get the rows* cols elemts from the user
				System.out.println("enter " + (rows * cols) + " elements:");
				 for (int i = 0; i < rows ; i++) { // rows 
					 ArrayList list1 = new ArrayList();
					 for (int j = 0; j < cols; j++) {
						 
						int n = sc.nextInt();
						
						list1.add(n);
					 }
					 
					 al2d.add(list1);
				 }
		
		//print 
				 System.out.println("Printing " + (rows * cols) + " elements:");
				 for (int i = 0; i < rows ; i++) { // rows 
					 
					 ArrayList list1 = (ArrayList) al2d.get(i);
					 for (int j = 0; j < cols; j++) {
						 
						//System.out.println(a[i][j]);
						
						 System.out.println(list1.get(j));
					 }
					 
				 }	 
				 

	}

}
