package Strings;
import java.util.Scanner;
public class CountAtoZInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toLowerCase();
		
		//count how many a's,b's.c's till z's in my given string
		int[]  count = new int[26];
		//a -> 0, b->1
		//how i can get this index
		//a -> 0
//		System.out.println('a' - 97); //0
//		System.out.println('b' - 97);
//		System.out.println('c' - 97);
//		System.out.println('x' - 97);
//		System.out.println('y' - 97);
//		System.out.println('z' - 97);
		
		for(int i = 0 ; i < s.length(); i++) {
			int countIndex = s.charAt(i) - 97;
			count[countIndex]++;		
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.println(i+ " -> " + 
								(char) (i+ 97)  + 
									" -> "+ count[i]);
		}
	}

}
