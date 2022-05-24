package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
Common operations of List ADT are: 
- Creating a list 
- Checking if a list is empty or not 
- Inserting an element 
    - at the Beginning 
     - at the End 
   - at the given ith position 
- deleting an element  
	 - at the Beginning 
	- at the End 
 - at the given ith position  
- Traversing through the whole list 
- Searching for an element in the list, etc 

 */
public class ListADTDemo {

	public static void main(String[] args) {
		// Creating a list
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//checking the list empty or not
		// 1. using size  -> al.size() returns a num ->0 
		if (al.size() == 0)
			System.out.println("List is Empty");
		// 2. using isEmpty() -> boolean -> true/ false 
		// -> returns true when list is empty
		// returns false when list has any elements
		if( al.isEmpty())
			System.out.println("list is empty");
		else
			System.out.println("list has elements");
		
		
		// Inserting a element at the end
		al.add(12);
		al.add(13);
		al.add(14);
		
		// Insert a element at front -> index -> 0
		// insert at the given position -> index -> given
		
		al.add(0, 11); // inserted at the first -> index as 0
		al.add(2, 88);
		// it creates a space if there any element already present
		// how its creating a space -> by shifting elements one step backward 
		// then its inserts
		
		//Traversing through the whole list 
		for(int i =0 ; i< al.size() ; i++) {
			System.out.println(i + "->" + al.get(i));
		}
		
//		for (Integer i : al) {
//			System.out.println(i);
//		}	
		
		//remove(index) used to delete the element in the specified index
		//after deletion, if there is any element on the right side... it just shifts
		// one step forward
		al.remove(3); // deletes at index -3
		// begining -> index -> 0
		//end -> index -> al.size() -1
		
		System.out.println("After removing");
		for(int i =0 ; i< al.size() ; i++) {
			System.out.println(i + "->" + al.get(i));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element you want to search in the list");
		int elmtToSearch = sc.nextInt();
		
		// contains() -> returns boolean -> true or false
		// true -> the elemt present in the list
		//false -> the elmt is not present in the list
		
		if(al.contains(elmtToSearch))
			System.out.println("The given element present in the array list");
		else
			System.out.println("The given element not present in the array list");
		
		
		//indexof() -> return an integer -> index
		// indecx -> 0 , 1, 2,...
		// -1 -> the element not present in the array
		
		System.out.println(al.indexOf(elmtToSearch));
		
		al.add(88);
		System.out.println("After adding 88 again");
		for(int i =0 ; i< al.size() ; i++) {
			System.out.println(i + "->" + al.get(i));
		}
		
		// there are two occurrence of 88
		
		System.out.println(al.indexOf(elmtToSearch)); 
		// this return only index 2 not the index 4
		
		System.out.println(al.lastIndexOf(elmtToSearch));
		
		al.add(88); // no
		System.out.println("After adding 88 again");
		for(int i =0 ; i< al.size() ; i++) {
			System.out.println(i + "->" + al.get(i));
		}
		
		System.out.println(al.indexOf(elmtToSearch)); 
		// this return only index 2 not the index 4
		
		System.out.println(al.lastIndexOf(elmtToSearch));
		
		
		// when there are 2 or more occurence of a same number
		// indexOf -> return the first index where 88 is there
		//lastIndexof -> returns the last index where 88 is there
		/* if i going to search 88
 0->11
1->12
2->88
3->14
4->88
5->88
2 //output of index of
5 // output of last index of
		 */
	}

}
