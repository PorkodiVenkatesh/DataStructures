package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ActsAsStack {
	public static void main(String[] args) {
		
	
		//creating an object
		ArrayDeque<Character> stackfromDeque = new ArrayDeque<>();
		System.out.println("stack from ArrayDeque Class");
		stackfromDeque.push('A');
		stackfromDeque.push('B');
		stackfromDeque.push('C');	
		
		System.out.println(stackfromDeque);
		System.out.println(stackfromDeque.peek());
		
		stackfromDeque.pop();
		
		System.out.println(stackfromDeque.peek());
		
		
		LinkedList<Character> stackfromLL = new LinkedList<>();
		System.out.println("stack from LinkedList Class");
		stackfromLL.push('A');
		stackfromLL.push('B');
		stackfromLL.push('C');	
		
		System.out.println(stackfromLL.peek());
		
		stackfromLL.pop();
		
		System.out.println(stackfromLL.peek());
		
	}

}
