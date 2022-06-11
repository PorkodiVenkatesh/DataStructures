package Recursions;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("factorialUsingForLoop = "+factorialUsingForLoop(n));
		System.out.println("Using Recursion = " + factorial(n));
	}
	
	public static int factorialUsingForLoop(int n) {
		int fact = 1;
		for (int i =n ; i>=1; i --) {
			fact = fact * i;
			System.out.println("i = " + i + " fact = " +fact);
		}
		
		return fact;
	}
	
	public static int factorial (int n) {
		System.out.println("n = " + n);
		if (n==1)
			return 1;
		
		return n* factorial(n-1);
	}

}
