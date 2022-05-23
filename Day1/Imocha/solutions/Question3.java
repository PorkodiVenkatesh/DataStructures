package Imocha;

import java.util.ArrayList;
import java.util.Scanner;
//werid sum
public class Question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i =0 ; i<n ; i++) {
			int num = sc.nextInt();
			al.add(num);
		}
		
		for (int i =0 ; i<n ; i++) {
		 int sum = 0;
		 
			for (int j =0 ; j<n ; j++) {
				if (i != j) {
					sum = sum + al.get(j);
				}
			}
			
			System.out.println(sum);
		}
		
	}
	
}
