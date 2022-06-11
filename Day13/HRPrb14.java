package Recursions;

import java.util.Scanner;

public class SuperDigit {

	private static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum += r;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1:");
		int n = sc.nextInt();
		System.out.println("Enter n2");
		int k = sc.nextInt();

		int d = sumOfDigits(n) * k;

		System.out.println(superdigit(d));

	}

	private static int superdigit(int d) {

		if (d <= 9)
			return d;

		return superdigit(sumOfDigits(d));

	}

}
