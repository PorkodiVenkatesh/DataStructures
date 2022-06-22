package infosys;

import java.util.*;

public class StringRotation {

	public static void main(String[] args) {
		//rhdt:246,ghftd:1246
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String pairs[] = input.split(",");
		//System.out.println(Arrays.toString(pairs));
		
		for (String s : pairs) {
			
			int indexOFColon = s.indexOf(':');
			
			String s1 =  s.substring(0, indexOFColon);
			String s2 = s.substring(indexOFColon + 1);
			
			//System.out.println("s1 = " + s1 + " s2 = " + s2);
			
			int sum = findSum(s2);
			//System.out.println(sum);
			
			if(sum%2 == 0) {
				//even
				// so rotate rhdt left by 1 position 
				//so after rotating by one position so it will become trhd.
				
		      // last 1 character moved to front
				//last character s1.charAt(s1.length() -1); as wells substring
				//remaining strin s1.subString(0,s1.length() -1)
				
				int lastIndex = s1.length() -1;
				System.out.println(s1.substring(lastIndex) + s1.substring(0, lastIndex));
				
				
			}else {
				//odd
				//then rotate ghftd right by 2 position so it will become ftdgh.
				//first 2 chars - s.substring(0,2) at the last
				System.out.println(s1.substring(2) + s1.substring(0,2));
				
			}
			
		}

	}
	


	private static int findSum(String s2) {
		int sum =0;
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			int n = Character.getNumericValue(c);
			sum = sum + (n*n);
		}
		return sum;
	}

}
