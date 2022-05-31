package Queue;

import java.util.*;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		//creating an object
		ArrayDeque<Character> deque = new ArrayDeque<>();
		
		//insert or add at the last/back/rear
		//also at the First/front
		
		deque.addLast('A'); //deque.add('A') -> both are same
		deque.addLast('B');
		
		System.out.println(deque);
		
		deque.addFirst('C');
		deque.addFirst('D');
		
		System.out.println(deque);
		
		System.out.println("Element in the first: " + deque.getFirst());
		System.out.println("Element in the last: " + deque.getLast());
		
		//deletion on the front/first &back/last/rear
		
		Character c1 = deque.removeLast();
		System.out.println(c1 + " is removed/deleted from the quue");
		System.out.println(deque);
		
		
		Character c2 = deque.removeFirst();
		System.out.println(c2 + " is removed/deleted from the quue");
		System.out.println(deque);
		
		System.out.println("Element in the first: " + deque.getFirst());
		System.out.println("Element in the last: " + deque.getLast());
		
		// deque.get(0); - not allowed like set
		//Converting deque to list
		ArrayList<Character> alfromdeque = new ArrayList<>(deque);
		System.out.println(alfromdeque.get(0));
		
		
	}

}
