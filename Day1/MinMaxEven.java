package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MinMaxEven {
	
public static void main(String[] args) {
		
		// Arrays -> store same kind of values and size is fixed
		//collection of numbers -> int
		//1. I need to know about the size
		
		Scanner sc  = new Scanner(System.in);	
		System.out.println("enter size: ");
		int size = sc.nextInt();
		
		// 2. declare the array with the given size
		
		int[] array = new int[size];
		
		// 3. I need to get the values form the user
		// index 0 -> n-1 -> array[index] = sc.nextInt()
		System.out.println("enter " + size + " values: ");
		for (int index = 0; index < size ; index++) {
			array[index] = sc.nextInt();
		}
		
		//not sure how many even numbers are going to
		//be in my array
		//that's why i'm going for arraylist
		ArrayList<Integer>  evenNums = new ArrayList<>();
		
		// even numbers
		//traversing through my array
		//if i found any even number i'm
		//going to add that to my arraylist (evenNum)
		for (int i = 0 ; i < size; i++) {
			int num = array[i];
			if (num % 2 == 0) {
			
				evenNums.add(num); //add method is used to add an elemt to the arraylist
			}
		}
		
		for(int i = 0 ; i < evenNums.size() ; i++) {
			System.out.println(evenNums.get(i)); // retrive/get an elemt in the arraylist
		}
		
		
		int min = evenNums.get(0);
		for(int i = 1 ; i < evenNums.size() ; i++) {
			if (evenNums.get(i) < min)
				min = evenNums.get(i);
		}
		
		System.out.println(" min even -> " + min);
		
		Collections.sort(evenNums);
		System.out.println("After Sorting");
		for(int i = 0 ; i < evenNums.size() ; i++) {
			System.out.println(evenNums.get(i)); // retrive/get an elemt in the arraylist
		}
		
		System.out.println(" min -> " + evenNums.get(0));
		int last = evenNums.size() -1;
		System.out.println(" max -> " + evenNums.get(last));
}

}
