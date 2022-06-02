## Arrays Class

- Helper Class
- In java.util package
- Allows to manipulate arrays
- Arrays.toString(array)
- Arrays.sort(array)
- Arrays.binarySearch(array, key)
- Click [here](./ArraysClassDemo.java) to see the code

## String Class

- Immutable
- In java.lang package
- String Methods
    - s.length()  -> returns the number of characters in the String
    - s.charAt(i) -> lets you to find out the character is at given index i
    - s.indexOf('a') ->  lets you to find out index of the character in the given string,  returns -1 if the character not present in the String
    - s.toUpperCase() -> converts the string to the upper case
    - s.toLowerCase() -> converts the string to the lower case
    - s1.concat(s2) -> combines two string s1 and s2
    - s.substring(1) -> substring is used to get some part of the string, if you didn't specify, s.length() will be end value
    - s.substring(1, 5) -> substring with start and end index -> return the chars start at 1 and ends at (5-1) = 4
    - s.startsWith("a") -> return true if string starts  with a particular charSequence, else returns false
    - s.endsWith("a") -> return true if  string ends with a particular charSequence, else returns false
    - s.contains("Ab") -> return true if the particular charSequence in the string, else returns false
    - s.replace("a", "A") -> replaces the all "a" with "A" in the string
    - Note: to remove a particular charSequene, you can replace that with empty string, eg: "abcabc".replace("a", "")
    - s.replaceFirst("a", "A") -> replaces only the first occurence
    - s1.equals(s2) -> return true if the two string values are equal, else returns false
    - s1.equalsIgnoreCase(s2) -> return true if the two string values are equal ignoring the case, else returns false
    - s.trim() -> removes the spaces in the front and back
    - char[] ch = s4.toCharArray(); -> converts string to the character array
    - String spaceSplit[] = st.split(" "); -> splits a string into an array of substrings, based on the charSequence specified in the split Method (here its space)
    - Click [here](./StringMethodsDemo) to see the code
    - See the code [here](./StringToNumbers.java) for converting string to numbers type like Integer, Double, etc
        - Eg: Integer i = Integer.parseInt("123");
    - See the code [here](./NumbersToString.java) for converting numbers type like Integer, Double, etc to string
        - Eg: int i = 12345;  String s1 = String.valueOf(i);  or String s2 = i+ "";

## String Buffer and String Bulider

![image](https://user-images.githubusercontent.com/70228962/171012233-6c08dc37-ed95-41b0-b365-3fa1cc2c795a.png)

- Mutable
- In java.lang package
- Methods
  - sb.append(value) -> value can be char,string, charsequence, int, double, etc
  - sb.reverse() 
  - sb.deleteCharAt(0)
  - sb.insert(1, '-')
  - sb.delete(1, 5) -> delets the chars start at 1 and ends at (5-1) = 4
  - sb.setCharAt(1, 'A') -> updates the character in the index -1 to 'A'
  - sb.toString() -> converts stringbulider or string buffer to string.
  - Click [here](./StringBufferDemo.java) to see the code

## Palindrome

String -> s and the reverse of String s -> rev_s
- If the string (s) and the reverse of string (rev_s) are same, then the string is a palindrome
- Eg: s = mam , rev_s = mam, s and rev_s are same, "mam" is palindrome
- Eg: s = hello, rev_s =olleh,  s and rev_s are not same, "hello" is not a palindrome
- Click [here](Palindrome.java) to see the code for palindrome

## Anagrams

String -> s1 and another String s2 
- If the a string (s2) can be derived/formed from the another string (s1), then s1 and s2 are anagrams
- Eg: s1 = signature and s2 = a true sign 
  - character and  occurence are same. s is appeared once in s1 and it also appeared once in s2.
  - s1 and s2 are anagrams
- Eg: s1 = a gentleman and s2 = elegant man
  - s1 and s2 are anagrams
- Click [here](./Anagrams.java) to see the code for Anagrams

 
 ## Character Class Methods (used frequently)
 
 - Character.isLetter(ch)
 - Character.isUpperCase(ch)
 - Character.isLowerCase(ch)
 - Character.isDigit(ch)
 - Character.toUpperCase(ch)
 - Character.toLowerCase(ch)
 - Character.isSpaceChar(ch)
 - Character.getNumericValue(ch)
 - Click [here](./CharacterClassDemo.java) to see the code

# Stack

- LIFO Principle
- Stack class in Collection framework , in java.util package
- Operation performed on the stack
  - **Push** - Inserting an element to the top of the stack
  - **Pop** - Deleting an element from the top of the stack
  - **Peek** - Retrieving the element at the top of the stack
- Methods
  - stack.push(elmt)
  - stack.pop()
  - stack.peek()
  - Click [here](./StackDemo.java) to see the code  

## HackerRank Problems

- Prb10: [Alternating Character](https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=strings) - Click [here](./HRPrb10.java) to see the solution
- Prb11: [Maximum Element](https://www.hackerrank.com/challenges/maximum-element/problem) - Click [here](./HRPrb11.java) to see the solution
- Prb12: [Balanced Brackets](https://www.hackerrank.com/challenges/balanced-brackets/problem) - Note: similar to the leetcode prb 6

## Leet Code Problems

- Prb4: [Reverse Only Letters](https://leetcode.com/problems/reverse-only-letters/) - Click [here](./LCPrb4.java) to see the solution
- Prb5: [Robot Return to Origin](https://leetcode.com/problems/robot-return-to-origin/) - Click [here](./LCPrb5.java) to see the solution
- Prb6: [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) - Click [here](./LCPrb6.java) to see the solution

## CodeChef Problems

- Prb1: [The Block Game](https://www.codechef.com/submit-v2/PALL01) - Click [here](./CCPrb1.java) to see the solution

## Geeks for Geeks Problem (Home work Problems)

- Prb1: [Missing number in array ](https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1/?page=1&curated%5b%5d=8&sortBy=submissions) - Click [here](./GFGPrb1.java) to see the solution
- Prb2: [Divisible by 7 ](https://practice.geeksforgeeks.org/problems/divisible-by-73224/1/?page=1&curated%5b%5d=3&sortBy=submissions) - Click [here](./GFGPrb2.java) to see the solution
- Prb3: [Rotate by 90 degree ](https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1/?page=1&curated%5b%5d=8&sortBy=submissions) - Click [here](./GFGPrb3.java) to see the solution
