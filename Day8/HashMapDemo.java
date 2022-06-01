package Map;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		//name -> age
		//key -> value pair -> Map -> HashMap clss
		//name: String -> age:Integer
		HashMap<String, Integer> hm = new HashMap<>();
		
		//if i want to store some key-> value pairs or name->age
		//put(key, value)
		hm.put("porkodi" , 24);
		hm.put("shreysh", 21);
		hm.put("Sayali", 20);
		
		//printing the hashmap
		System.out.println(hm);
		
		//printing only the keys in the hashmap
		System.out.println(hm.keySet());
		
		//priniting only the values in the hashmap
		System.out.println(hm.values());
		
		//key are uniques
		// only one null value -> 1,2,3,4,null
		hm.put("porkodi" , 25); //trying to put the key "porkodi" which is already there
		
		//printing the hashmap
		System.out.println(hm);
		
		hm.put("murugan" , 20); //already 20 is there
		
		//printing the hashmap
		System.out.println(hm);
		
		//if i want to get value for a key
		//using key i'm able to get that value
		System.out.println(hm.get("murugan"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to check: ");
		String keyToCheck = sc.next();
		if(hm.containsKey(keyToCheck)) {
			System.out.println("Key Found!! The value for that key is " + hm.get(keyToCheck));
		} 
		else {
			System.out.println("Key is not Found!!");
		}
		
		System.out.println("Printing keys and values in the hash map"
				+ "\nKey ->Value"
				+ "\n---------------");
		for(String key : hm.keySet()) {
			System.out.println(key + "->" + hm.get(key));
		}
		
		
		hm.remove("porkodi");
		
		System.out.println("After Removing"
				+ "\nKey ->Value"
				+ "\n---------------");
		for(String key : hm.keySet()) {
			System.out.println(key + "->" + hm.get(key));
		}
		
		System.out.println(hm.size());
	}

}
