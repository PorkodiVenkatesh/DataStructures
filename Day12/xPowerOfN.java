package Recursions;

import java.util.Scanner;

public class xPowerOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println(power(x, n));

	}
	
	public static int power(int x , int n) {
		if (n==1)
			return x;
		
		return x * power(x, n-1);
	}

}
