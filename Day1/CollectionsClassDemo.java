package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		// Collections - helper class 
		// helps you all with some predefined methods
		//syntax - Collections.method(arraylist);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(23);
		al.add(35);
		al.add(18);
		al.add(13);
		al.add(89);
		
		
		System.out.println("Printing the arraylist");
		for (Integer i : al) {
			System.out.println(i);
		}
		
		System.out.println("Min element in the arraylist " + Collections.min(al));
		
		System.out.println("Max element in the arraylist " + Collections.max(al));
		
		//Ascending order
		Collections.sort(al);
		//after sorting the insertion order will go
		System.out.println("Printing the arraylist after sorting in ascending order");
		for (Integer i : al) {
			System.out.println(i);
		}
		
		//Descending order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Printing the arraylist after sorting in descending order");
		for (Integer i : al) {
			System.out.println(i);
		}  
		
		
		al.add(-1);
		al.add(-3);
		al.add(-7);
		
	
		
		
		// doesn't make any changes
				// just i'm traversing from back to front
		System.out.println("Just traversing from back to front");
				for (int i = al.size() -1; i >= 0 ; i--) {
					System.out.println(al.get(i));
				}
				
				System.out.println("Printing the arraylist before reversing");
				for (Integer i : al) {
					System.out.println(i);
				}		
		
		// reverse the list 
		//changes in the actual list
		Collections.reverse(al); 
		System.out.println("Printing the arraylist after reversing");
		for (Integer i : al) {
			System.out.println(i);
		}
		
		// collections.sort and .reverse affects yr original
		// make changes in the list i gave 
	}

}
