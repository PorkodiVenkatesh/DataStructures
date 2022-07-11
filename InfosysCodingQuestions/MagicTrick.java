import java.util.*;
/*
5
3
5
1
4
2
 */
public class MagicTrick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> pile = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			pile.add(sc.nextInt());
		}

		int cost = 0;
		

		for (int i = 1; i <= n; i++) {
			System.out.println("Searching for " + i + " in pile " +pile);
			int index = pile.indexOf(i);
			System.out.println("index of " + i  + " is " + index);
			int mid = pile.size()/2;

			if (index == 0) {
				System.out.println("is in top with no cost");
				pile.remove(index);
			} else if (index == pile.size() - 1) {
				pile.remove(index);
				cost += i;
				System.out.println("is in last removing with cost " + i );
			} else {
				cost +=  isInmid(pile , mid);
			} 
			
			System.out.println("Total Cost = " + cost);
			

		}
		System.out.println(cost);

	}

	private static int isInmid(ArrayList<Integer> pile, int mid) {
		int c = 0;
		int upSum =0;
		int downSum =0;
		for (int i=0; i< mid; i++) {
		  upSum += pile.get(i);
		}
		for (int i= mid+ 1; i< pile.size(); i++) {
			  downSum += pile.get(i);
		}
		if (upSum < downSum) {
			System.out.println("upSum = " + upSum);
			 for(int i = 0; i < mid; i++) {
				 int e = pile.get(i);
				 pile.remove(i);
				 pile.add(e);
				 System.out.println("moving " + pile);
			 }
			 pile.remove(0);
			 c = upSum;
			 System.out.println("removed with cost " + c + " pile is " + pile );
			
		}else {
			System.out.println("downSum = " + downSum);
			for(int i = mid+1; i < pile.size(); i++) {
				 int e = pile.get(i);
				 pile.remove(i);
				 pile.add(0, e);
				 System.out.println("moving " + pile);
			 }
			 c = downSum + pile.get(pile.size() - 1);
			 pile.remove(pile.size() - 1);
			 System.out.println("removed with cost " + c + " pile is " + pile);
		}
		
		return c;
		
	}

}
