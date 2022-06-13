
package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> perfectSquares = new ArrayList<Integer>();
		
		for (int i = 1; i < n; i++) {
			int square = i*i;
			if(square <= n) {
				perfectSquares.add(square);
			}
			else {
				break;
			}
		}
		
		System.out.println(perfectSquares);
		
		int pairs = 0;
		for(int n1 = 1; n1 <= n; n1++) {
			for (int sq : perfectSquares) {
				int n2 = n1+ sq;
				if(n2 <= n) { 
					System.out.println("pair: " + n1 + " , " + n2 + " with difference " + sq);
					pairs++;
				}
				else {
					break;
				}
			}
		}
		System.out.println(pairs);
	}

}
