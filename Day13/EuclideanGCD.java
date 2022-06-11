package Recursions;

import java.util.Scanner;

public class EuclideanGCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1:");
		int n1 = sc.nextInt();
		System.out.println("Enter n2");
		int n2 = sc.nextInt();
		
		int gcd = GCD(n1, n2);
		
		System.out.println("Greatest Common Divisor = " + gcd);
	
	}

	private static int GCD(int n1, int n2) {
		int g,s,r;
		if(n1>n2) {
			//if n1 is greater
			g = n1;
			s = n2;
		}else {
			//n1 is smaller
			g = n2;
			s = n1;
		}
		
		r = g%s;
		if (r == 0)
			return s;
		
		return GCD (s, r);
	}

}
