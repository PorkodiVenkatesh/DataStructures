package LeetCode;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		
		int q = decimal/2;
		int r = decimal%2;
		
		String binary = r+ "";
		
		while( q >= 2) {
			
			r = q%2;
			binary = r + binary;
			q = q/2;
			
		}
		if(q<2) {
			binary = q+ binary;
		}
		System.out.println(binary);
		
		

	}

}
