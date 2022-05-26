package SubArrays;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0; i< n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i =0; i<n; i++) {
			for (int j = i; j<n; j++) {
				int sum =0;
				for(int k =i ; k<=j; k++) {
					System.out.print(a[k] + " ");
					sum = sum + a[k];
				}
				System.out.print(" sum = " + sum);
				System.out.println();
			}
		}
	}

}
