package infosys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer>  factors = new ArrayList<Integer>();
		factors.add(1);
		
		
		for(int i = 2; i <= Math.sqrt(n); i++ ) {
			if (n%i == 0) {
				factors.add(i);
				factors.add(n/i);
			}
		}
		
//		for(int i = 2; i <= n/2; i++ ) {
//			if (n%i == 0) {
//				factors.add(i);
//			}
//		}
		
		if (n> 1) {
			factors.add(n);
		}
		
		System.out.println(factors);

	}

}
