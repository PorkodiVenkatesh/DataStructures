package Imocha;

import java.util.*;

// Array Operations: Maximum Absolute Difference


public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i =0 ; i<n ; i++) {
			int num = sc.nextInt();
			al.add(num);
		}
		
		
		ArrayList<Integer> evenNums = new ArrayList<>();
		ArrayList<Integer> oddNums = new ArrayList<>();
		
		for (int i =0 ; i<n ; i++) {
			int num = al.get(i);
			if (num % 2 == 0) {
				evenNums.add(num);
			}else {
				oddNums.add(num);
			}
		}
		
		int minEven = Collections.min(evenNums);
		int maxEven = Collections.max(evenNums);
		
		int minOdd = Collections.min(oddNums);
		int maxOdd = Collections.max(oddNums);
		
		int x = maxEven - minEven;
		int y = maxOdd - minOdd;
		
		System.out.println(x+y);
		
	}

}
