package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//creating a linked list
		LinkedList<Integer> ll = new LinkedList<>();
		
		//add any elments
		ll.add(12);
		ll.add(0, 11);
		ll.addFirst(88);
		ll.addLast(17);
		
		for (Integer integer : ll) {
			System.out.println(integer);
		}
		
		ll.add(2, 99);
		
		ll.remove(1);		
		
		System.out.println(ll.contains(12));
		
		
		for (Integer integer : ll) {
			System.out.println(integer);
		}
		
	} 

}
