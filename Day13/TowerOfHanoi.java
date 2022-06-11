package Recursions;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many disks?");
		int n = sc.nextInt();
		
		towerOfHanoi(n, "A", "B" , "C");
		
		//The minimal number of moves required to solve the Tower of Hanoi puzzle of n disks would be (2 power of n)-1.
		
		System.out.println("Moves done are " +(int) (Math.pow(2, n) - 1 ));


	}
/*
 * TowerOfHanoi(N, source, destination, helper)
         IF N == 1, THEN
      	    Move N from source to destination            
         ELSE
 	          TowerOfHanoi(N - 1, source, helper, destination)     // Step 1
      	    Move N from source to destination          // Step 2
 	          TowerOfHanoi(N - 1, helper, destination, source)     // Step 3
 */
	public static void towerOfHanoi (int n , String source, String destination, String helper ) {
		if (n==1) {
			System.out.println("Move disk " + n  + " form " + source + " to  " + destination);
		}
		else {
			towerOfHanoi(n -1 , source, helper, destination);
			System.out.println("Move disk " + n  + " form " + source + " to  " + destination);
			towerOfHanoi(n -1 , helper, destination, source);
		}
	}

}
