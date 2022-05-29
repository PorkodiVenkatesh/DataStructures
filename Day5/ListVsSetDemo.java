package Sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ListVsSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       //creating a HashSet
		       HashSet<Integer> hs = new HashSet<>();
		
				hs.add(12);
				hs.add(11);
				hs.add(13);
				hs.add(12); //2nd time adding 12
				hs.add(14);
				hs.add(14);	//2nd time adding 14
				
				System.out.println(hs);
				
				//converting hashSet to the arrayList
				ArrayList<Integer>  alfromhs = new ArrayList<>(hs);
				System.out.println(alfromhs); //Output: [11, 12, 13, 14]
				//adding some values to the converted list
				alfromhs.add(12);
				System.out.println(alfromhs); //Output: [11, 12, 13, 14, 12]
				
			
		//creating arraylist		
		ArrayList<Integer>  al = new ArrayList<>();
		al.add(12);
		al.add(11);
		al.add(13);
		al.add(12); //2nd time adding 12
		al.add(14);
		al.add(14);	//2nd time adding 14
		System.out.println(al); //Output - [12, 11, 13, 12, 14, 14]
		
		//converting arraylist to hashset
		HashSet<Integer> hsfromal = new HashSet<>(al); 
			// we need pass arraylist object in the HashSet constructor
	
		System.out.println(hsfromal); //Output - [11, 12, 13, 14]

	}

}
