package Imocha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i =0 ; i<n ; i++) {
			int num = sc.nextInt();
			al.add(num);
		}
		
		int y = sc.nextInt();
		
		int sum = 0;
		for (int i =0 ; i<n ; i++) {
			sum = sum + al.get(i);
		}
		
		int x  = (y * n) - sum;
		
		System.out.println(x);
	}

}
