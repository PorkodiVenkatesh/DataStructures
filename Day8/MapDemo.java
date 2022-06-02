package Map;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		// Creating HashMap
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(2, "Two");
		hm.put(1, "One");
		hm.put(3, "Three");
		hm.put(4, null); // adding null value
		hm.put(null, "some"); // adding null key
		hm.put(1, "ONE"); // adding already added key with new value
		hm.put(22, "Two"); // adding new key with existing value

		System.out.println(hm);
		// OUTPUT: {null=some, 1=ONE, 2=Two, 3=Three, 4=null, 22=Two}

		// Creating LinkedHashMap
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(2, "Two");
		lhm.put(1, "One");
		lhm.put(3, "Three");
		lhm.put(4, null); // adding null value
		lhm.put(null, "some"); // adding null key
		lhm.put(1, "ONE"); // adding already added key with new value
		lhm.put(22, "Two"); // adding new key with existing value

		System.out.println(lhm);
		// OUTPUT: {2=Two, 1=ONE, 3=Three, 4=null, null=some, 22=Two}
		
		// Creating TreeMap
		TreeMap<Integer, String> tm = new TreeMap<>();

		tm.put(2, "Two");
		tm.put(1, "One");
		tm.put(3, "Three");
		tm.put(4, null); // adding null value
	//	tm.put(null, "some"); // adding null key - will throw NullPointerException
		tm.put(1, "ONE"); // adding already added key with new value
		tm.put(22, "Two"); // adding new key with existing value

		System.out.println(tm);
		// OUTPUT: {1=ONE, 2=Two, 3=Three, 4=null, 22=Two}
		
	}

}
