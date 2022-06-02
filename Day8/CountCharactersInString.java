package Map;
import java.util.*;
public class CountCharactersInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next();
		//p ->1, o->2, r -> 1
		HashMap<Character, Integer>  map = new HashMap<>();
		
		for(int i =0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if(map.containsKey(ch)) {
				int prevCount = map.get(ch);
				map.put(ch, ++prevCount);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		for(Character key : map.keySet()) {
			System.out.println( key + "->" + map.get(key));
		}
		//how can i get a character from an user
		System.out.println("Enter the character : ");	
		Character chToCheck  = sc.next().charAt(0);
		if(map.containsKey(chToCheck)) {
			System.out.println("The count of " + chToCheck + " is " + map.get(chToCheck));
		}
		else {
			System.out.println("The count of " + chToCheck + " is 0. "
					+ "\nCharacter is not present in the string.");
		}
	}

}
