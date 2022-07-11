package infosys;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer>  pile = new ArrayList<>();
		for (int i =0; i < n; i++) {
			pile.add(sc.nextInt());
		}
		System.out.println(pile);
		//top - > index :0
		//bottom -> index: n-1

		// 1. have to find where is 1
		//2. if it is in top that is at the index 0, i can remove
		// if not -> move top cards to the bottom -> movingTopCardsCost
		//         -> move bottom cards to the top -> movingBottomCardsCost
		// Choose which is lesser
		int cost = 0;
		for (int cardToThrow = 1;  cardToThrow <= n ; cardToThrow ++) {
			int index = pile.indexOf(cardToThrow);
			if(index == 0) {
				System.out.println("Throwing "+ cardToThrow +" updated cost = " + cost);
				pile.remove(cardToThrow);
			} else {
				int costByMovingTopCards = 0;
				int costByMovingBottomCards = 0;
				for (int i = 0 ;  i < index; i++) {
					costByMovingTopCards+= pile.get(i);
				}
				for(int i = index; i< pile.size(); i++) {
					costByMovingBottomCards+= pile.get(i);
				}
				if (costByMovingBottomCards < costByMovingTopCards) {
					cost += costByMovingBottomCards;
					System.out.println("Moving Bottom cards to the top");
					for (int i = index + 1; i<  pile.size() ; i++) {
						int temp = pile.get(pile.size() -1);
						pile.remove(temp);
						pile.add(0, temp);
					}
					System.out.println("Throwing "+ cardToThrow +" updated cost = " + cost);
					pile.remove(0);
				}else {
					cost += costByMovingTopCards;
					System.out.println("Moving top cards to the bottom");
					for (int i = 0; i < index; i++) {
						int temp = pile.get(0);
						pile.remove(temp);
						pile.add(temp);
					}	
					System.out.println("Throwing "+ cardToThrow +" updated cost = " + cost);
					pile.remove(0);
				}
				
			}
			System.out.println(pile);
		}
	 
		
	}


}
