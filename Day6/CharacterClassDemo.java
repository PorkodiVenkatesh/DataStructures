package Strings;
import java.util.ArrayList;
public class CharacterClassDemo {
	public static void main(String[] args) {
		
		System.out.println(Character.isLetter('w'));
		
		System.out.println(Character.isUpperCase('w'));
		
		System.out.println(Character.isLowerCase('w'));
		
		System.out.println(Character.isSpaceChar(' '));
		
		char c = '3';
		
		System.out.println(Character.isDigit(c));

		int i = Character.getNumericValue(c);
		
		System.out.println(c+ 5);
		
		System.out.println(Character.toLowerCase('P'));
		
		System.out.println(Character.toUpperCase('k'));
	}

}
