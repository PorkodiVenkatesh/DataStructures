package Patterns;

import java.util.Scanner;

/*
input - an integer
4

*
***
*****
*******

5
*
***
*****
*******
*********
 */
public class StarPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many lines you want to print?");
		int n = sc.nextInt();
		int odd = 1;
		for(int line = 1; line <=n ; line++) {
			
			for(int star = 1; star <= odd; star++) {
				System.out.print("*");
			}
			odd = odd + 2;
			System.out.println();	
			
		}
		
		


	}

}
