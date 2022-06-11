package Recursions;

import java.util.Scanner;

public class FibDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int elmt = fib(n);
		System.out.println(elmt);

	}
	
	static int fib (int n) {
		if (n==1 || n==2 )
			return 1;
		
		return fib(n-1) + fib(n-2);
	}

}
