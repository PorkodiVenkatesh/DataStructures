package infosys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfFactors {
	
	public static int sumofFactors(int n) {
		
		int sum = 1;
		
		for(int i = 2; i <=n/2; i++ ) {
			if (n%i == 0) {
				sum += i;
			}
		}
		
		if(n>1) {
			sum +=n;
		}
		
		
		return sum;
		
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			List<Integer>  list = new ArrayList<Integer>();
			for(int i = 0 ; i< n ; i++) {
				list.add(sc.nextInt());
			}
			
			List<Integer> output = new ArrayList<Integer>();
			
			for (Integer num : list) {
				int sum = sumofFactors(num);
				System.out.println(num + " factors sum -> " + sum);
				if(list.contains(sum)) {
					output.add(num);
				}
			}
			
			if(output.isEmpty()) {
				System.out.println(-1);
			}else {
				System.out.println(output);
			}

	}

}
