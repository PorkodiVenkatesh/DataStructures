package Searching;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// array
		// k -> element to search
		int arr[] = { 3, 4, 5, 8 , 9, 10, 24, 56, 78 , 91, 100, 231};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key you want to search in the array: ");
		int k = sc.nextInt();
		
		System.out.println(binarySearch(arr, k));
		System.out.println("Using Recrusion");
		System.out.println(binarySearchUsingRecurison(arr, k, 0,  arr.length -1));
	}
	
	public static int binarySearch(int[] arr, int k) {
		
		int f = 0;
		int l = arr.length -1;
		
		while (f <= l) {
		int mid = f + (l -f)/2;  // int mid = (f + l) /2
		System.out.println("f = " + f + " l = " + l + " mid =" + mid);
		
		if(k == arr[mid]) { // check mid elment is the k
			System.out.println("k = " + k + " equal mid = " + arr[mid]);
			return mid;
		}else if( k < arr[mid]){ // check mid element less than k
			System.out.println("k = " + k + " is lesser than mid = " + arr[mid]);
			l = mid -1;
		}else { // check mid element greater than k
			System.out.println("k = " + k + " is greater than mid = " + arr[mid]);
			f = mid +1;
		}
		}
			
		return -1;
		//otherwise, keep on comparing for more elements in the array and 
		//if you reach at the end of the array and you did not find any element, then return -1.


	}
	
public static int binarySearchUsingRecurison(int[] arr, int k, int f, int l) {
		
		if (f <=l) {
			int mid = f + (l -f)/2;  // int mid = (f + l) /2
			System.out.println("f = " + f + " l = " + l + " mid =" + mid);
		
		if(k == arr[mid]) { // check mid elment is the k
			System.out.println("k = " + k + " equal mid = " + arr[mid]);
			return mid;
		}else if( k < arr[mid]){ // check mid element less than k
			System.out.println("k = " + k + " is lesser than mid = " + arr[mid]);
			//l = mid -1;
			return binarySearchUsingRecurison(arr, k, f, mid-1);
		}else { // check mid element greater than k
			System.out.println("k = " + k + " is greater than mid = " + arr[mid]);
			//f = mid +1;
			return binarySearchUsingRecurison(arr, k, mid +1 , l);
		}
		}	
		return -1;
		//otherwise, keep on comparing for more elements in the array and 
		//if you reach at the end of the array and you did not find any element, then return -1.


	}

}

