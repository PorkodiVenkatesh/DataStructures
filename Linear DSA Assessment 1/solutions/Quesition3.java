import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList();
		
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			ll.add(sc.nextInt());
		}
		
		Collections.sort(ll);//ascending
		Collections.reverse(ll); //descending
		
		System.out.println(ll.get(0)+ll.get(1)+ ll.get(2));
	}

}
