package Searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// array
		// k -> element to search
		int arr[] = { 3, 4, 5, 8 , 9};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key you want to search in the array: ");
		int k = sc.nextInt();
		
		System.out.println(linearSearch(arr, k));
		
	}
	
	public static int linearSearch(int[] arr, int k) {
		
		int n = arr.length;
		//linear search
		//traverse each and every element of the array and compare that element with "k". 
		for(int i = 0; i< n; i++) {
			if(arr[i] == k) { //If it is equal to "k" then return index its present, 
				return i;
			}
		}
			
		return -1;
		//otherwise, keep on comparing for more elements in the array and 
		//if you reach at the end of the array and you did not find any element, then return -1.


	}

}
