package Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<>();
		
		//inserting A,B,C in the stack
		//push
		stack.push('A');
		stack.push('B');
		stack.push('C');
		
		//if i want to see what's my top element
		System.out.println("top of the stack -> " + stack.peek());
		
  // it deletes the element in the top of the stack
 // also returns which element is popped/deleted
	System.out.println(stack.pop() + " is popped");
	
	
	System.out.println("top of the stack -> " + stack.peek());

	}

}
