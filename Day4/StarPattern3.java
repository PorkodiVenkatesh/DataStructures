package Patterns;

import java.util.Scanner;

/*
input - an integer
4 //line
2 //stars
**
****
******
********

4 //line
3  //stars
***
******
*********
************
 */
public class StarPattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many lines you want to print?");
		int n = sc.nextInt();
		System.out.println("Which multiple?");
		int mul = sc.nextInt();
		for(int line = 1; line <=n ; line++) {
			
			int starCount = mul*line;
			for(int star = 1; star <= starCount; star++) {
				System.out.print("*");
			}
			System.out.println();		
		}
		
		


	}
	
}
