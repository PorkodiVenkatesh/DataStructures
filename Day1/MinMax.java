package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMax {
	
public static void main(String[] args) {
		
		// Arrays -> store same kind of values and size is fixed
		//collection of numbers -> int
		//1. I need to know about the size
		
		Scanner sc  = new Scanner(System.in);	
		System.out.println(" enter size: ");
		int size = sc.nextInt();
		
		// 2. declare the array with the given size
		
		int[] array = new int[size];
		
		// 3. I need to get the values form the user
		// index 0 -> n-1 -> array[index] = sc.nextInt()
		System.out.println("enter " + size + " values: ");
		for (int index = 0; index < size ; index++) {
			array[index] = sc.nextInt();
		}
		
		

		
		int min = array[0];
		for (int i = 1; i<size ; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		
		int max = array[0];
		for (int i = 1; i<size ; i++) {
			if(array[i] > max)  {
				max = array[i];
			}
		}
		
		System.out.println(" min -> " + min);
		System.out.println(" max  -> " + max);
		
}

}
