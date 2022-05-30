package Strings;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1:");
		String s1 = sc.nextLine();
		System.out.println("Enter s2:");
		String s2 = sc.nextLine();

		int count_s1[] = new int[26];
		int count_s2[] = new int[26];
				
		//Counting how many A's to Z's in the s1 string and
		//storing it in the count array
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch != ' ') {
				int countIndex = ch - 97;
				count_s1[countIndex]++;
			}
		}

		//Counting how many A's to Z's in the s2 string and
		//storing it in the count array
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (ch != ' ') {
				int countIndex = ch - 97;
				count_s2[countIndex]++;
			}
		}
		
		//comparing the 2 count arrays
		// if i says 2 a's in s1 that should be the same is in s2
		//then only its an anagram
		boolean isAnagram = true;
		for(int i =0; i< 26; i++ ) {
			if(count_s1[i] != count_s2[i]) {
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("s1 and s2 are anagrams");
		}
		else {
			System.out.println("s1 and s2 are not anagrams");
		}

	}

}
