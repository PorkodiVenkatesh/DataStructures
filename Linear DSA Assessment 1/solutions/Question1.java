
package LeetCode;

import java.util.ArrayDeque;
import java.util.Scanner;

public class linearDSAQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> queue = new ArrayDeque();
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			queue.add(sc.nextInt());
		}
		System.out.println(queue);
		
		int workDone =0;
		for(int i =3; i>=1 ; i--) {
		System.out.println("Checking for " + i + " to execute");
		while(queue.contains(i)) {	
			if(queue.getFirst() == i) {
				workDone = workDone+2;
				queue.removeFirst();
				System.out.println(i + " is in the first so executed ");
				System.out.println("WorkDone= " + workDone);
				System.out.println(queue);
			}else {
				int elmt = queue.removeFirst();
				queue.addLast(elmt);
				workDone = workDone+1;
				System.out.println(i + " is in there in queue but not at the first!"
						+ "\n" + elmt + " is in first so shifting " + elmt + " to the back");
				System.out.println("WorkDone= " + workDone);
				System.out.println(queue);
			}
		}
		}
		System.out.println(workDone);
		System.out.println(queue);
	}

}
