package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
public static void main(String[] args) {
	// Array -> same kind of types + size is fixed
	
	//Array list ->  Dynamic array -> size is dynamic
	// when you're not sure about the size
	// or else intially you know the size, you have a suitation that increasing the size
	
	
	//1. creating a arraylist
	// collections of nums 
	// array -> int  -> int[] num = new int[5]; or Integer[] num = new Integer[5]; 
	// arraylist -> Interger -> wrapper classes -> it just a class for your primitive types
	
	ArrayList<Integer> al = new ArrayList<>();
	
	//Arralist<int> - not allowed.. only wrapper classes
	
	// a[i] -> array -> refers to the elment in the i th index
	// al.get(i) -> arraylist -> refers to the elment in the i th index
	
	// common thing btw array and arrayList
	// index -> 0 to n-1
	//n -> size/length
// length of the array -> attribute in java -> a.length;
//size/length of the arraylist -> method in java -> al.size()
	
	
	/* Array -> to add or store values in array (from user)
	 * System.out.println("enter " + size + " values: ");
		for (int index = 0; index < size ; index++) {
			array[index] = sc.nextInt();
		}
	 */
	
	/*
	 * ArrayList -> add 5 numbers to the arraylist
	 * get those 5 numbers from the users
	 */
	Scanner sc = new Scanner(System.in);
	
	
	
//	int n1 = sc.nextInt();
//	int n2 = sc.nextInt();
//	int n3 = sc.nextInt();
//	int n4 = sc.nextInt();
//	int n5 = sc.nextInt();
//	
//	al.add(n1);
//	al.add(n2);
//	al.add(n3);
//	al.add(n4);
//	al.add(n5);
	
	// im doing the same action for the 5 times
	// whenever if youre doing a same action for an range -> loops

	System.out.println("enter n:");
	int n = sc.nextInt();
	
	System.out.println("Enter " + n + " numbers to add in the array list");
	for (int i = 1; i<= n; i++) {
		int num = sc.nextInt();
		al.add(num);
	}
	
	System.out.println("size ->" + al.size());
	al.add(45);
	al.add(56);
	System.out.println("size ->" + al.size());
	
	System.out.println("Printing using the for each loop");
	for (Integer i : al) {
		System.out.println(i);
	}
	
	System.out.println("Printing using the for loop");
	for (int i = 0 ; i < al.size(); i++) {
		System.out.println(i + " -> " + al.get(i));//arr[i]
	}
	
	
}
}
