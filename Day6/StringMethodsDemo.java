package Strings;

import java.util.Arrays;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s = "animals";
		System.out.println("String is " + s);

		// length() returns the number of characters in the String
		System.out.println("Length of the string " + s.length());

		// charAt(index) lets you to find out the character is at given index
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
	//	System.out.println(s.charAt(7)); //throws exception ->
		// IndexOutofBoundsException

		// indexOf('charValue') lets you to find out index of the character in the given
		// string
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('e')); // returns -1 if the character not present in the String

		// convert the string to uppercase/lowercase
		System.out.println(s.toUpperCase()); // ANIMALS
		System.out.println("Abc123".toLowerCase()); // abc123
		
		//Concat used to combine
		System.out.println(s.concat(" kingdom"));
		System.out.println(s+ " kingdom");

		// substring is used to get some part of the string
		System.out.println(s.substring(3)); // start index
		System.out.println(s.substring(1, 5)); // start and end index

		// to check if string starts and end with a particular charSequence
		System.out.println("abc".startsWith("a")); // true
		System.out.println("anbc".startsWith("an")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("s")); // true
		System.out.println("abc".endsWith("ls")); // true
		System.out.println("abc".endsWith("a")); // false

		// to check the particular charSequence in the string or not
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false
		System.out.println("abc".contains("bc")); // true

		// to replace particular char sequence with other charSequence
		System.out.println("abcabc".replace("a", "A")); // AbcAbc
		System.out.println("abcabc".replaceFirst("a", "A"));
		
		System.out.println("abcabc".replace("a", ""));
		System.out.println("abcabc".replaceFirst("a", ""));
		
		// to check two string values are equal or not
		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); // true

		//remove the spaces only in the front and back
		System.out.println(" a b c ".trim());
		System.out.println(" b c".trim());
		System.out.println("a b c".trim());
		
		
		//strings are immutable
		String s1 = " a b ";
		s1.trim();
		System.out.println("s1 =" + s1);
		System.out.println("s1 address" + s1.hashCode());
		s1 = s1.trim();
		System.out.println("s1 =" + s1);
		System.out.println("s1 address" + s1.hashCode()); 
		
		
		//converting string to char array
		String s4 = "hello";
        char[] ch = s4.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        
        //Split Method Demo
        String st = "Data Structure and Algorithms";
        String spaceSplit[] = st.split(" "); // returns {I,love,data,structure,and,algorithms}
        System.out.println(Arrays.toString(spaceSplit));
        
        String aSplit[] = st.split("a");// returns {I love d,t, structure ,nd ,lgorithms}
        System.out.println(Arrays.toString(aSplit));

	}

}
