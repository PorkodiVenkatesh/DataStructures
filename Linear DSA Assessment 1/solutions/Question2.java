
package LeetCode;

import java.util.Arrays;

public class testimocha { 
	
	public static void question(int[] arr, int m) {
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		//System.out.println(9*8*2);
//		arr[0] = arr[0]* (int)Math.pow(2,m);
		
		for (int i = 0 ; i< m ; i++) {
			Arrays.sort(arr);
			arr[0] = arr[0] * 2;
		}
		
		int sum =0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int arr1[] = {87, 63, 45, 27, 82, 16, 96, 32};
		int m1 =2;
		question(arr1, m1); //491
		//2 2
		//1 10
		int arr2[] = {1,10};
		int m2 = 2;
		question(arr2, m2); //14
		//2 5
		//60 80
		int arr3[] = {60,80};
		int m3 = 5;
		question(arr3, m3); //800
		int arr4[] = {77, 19, 9, 26, 56, 85};
		int m4 = 8;
		question(arr4, m4); //526
		
		int arr5[] = { 1, 10};
		int m5 =2;
		question(arr5, m5);
		
	}

}
