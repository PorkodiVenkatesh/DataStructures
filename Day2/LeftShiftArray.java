package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class LeftShiftArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you go enter? ");
		int n = sc.nextInt();
		
		ArrayList<Integer>  al = new ArrayList<>();
		
		System.out.println("Enter " + n + " numbers: ");		
		for(int i =0 ; i< n; i++ ) {
			// int n1 = sc.nextInt();
		   // al.add(n1);
			al.add(sc.nextInt());
		}
		
		System.out.println("How many times you want to do left shift? ");
		int k = sc.nextInt();
		
		System.out.println("Priniting " + n + " values in the array list");
		for(int i = 0; i < n; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Printing elements after "  +  k  + "  left shifts");
		for (int i =k; i < n ; i++) {
			System.out.println(al.get(i));
		}
		for (int i =0; i < k ; i++) {
			System.out.println(al.get(i));
		}
	}

}
