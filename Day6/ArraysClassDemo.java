package ArraysAndArrayList;

import java.util.Arrays;

public class ArraysClassDemo {

	public static void main(String[] args) {
		
		int a[] = {14,21,13,46};
		
		System.out.println(a);
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int key1 = 12;
		
		int key2 = 21;
		
		System.out.println(Arrays.binarySearch(a, key1));
		
		System.out.println(Arrays.binarySearch(a, key2));
	}

}
