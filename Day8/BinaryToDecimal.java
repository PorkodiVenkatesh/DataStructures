package LeetCode;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int decimal = 0;
		int pow = 0;
		
		for(int i = s.length() -1 ; i >=0 ; i--) {
			 int digit = Character.getNumericValue(s.charAt(i));
			 decimal += digit * Math.pow(2, pow);
			 pow++;
		}
		
		System.out.println(decimal);

	}

}
