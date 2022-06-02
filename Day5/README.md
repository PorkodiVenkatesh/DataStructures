## HackerRank Problems

- Prb9: [Java List](https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true) 
   - Click [here](./HRPrb9.java) to see the solution
   - **Note:** We chose LinkedList to solve this problem because this problem wants us to do insertion and deletion in the middle.

## LeetCode Problems

- Prb3: [Sum of Unique Elements](https://leetcode.com/problems/sum-of-unique-elements/) 
   - Click [here](./LCPrb3.java) to see the solution
   - **Note:** If you want to find duplicate or unique elements in the array, first do sort the array. Then compare with the adjancent element whether the element is duplicate or unique.

# Set

- Set is an interface extends the collection interface (Part of the collection framework)
- It allows us to only store the unique values (doesn't allows duplicates)
- **We can't access the elements using index like set.get(0)**

![image](https://user-images.githubusercontent.com/70228962/170874135-d34c38f9-dc3b-4768-8469-7a7f7b7a31ee.png)

- **3 classes that implements Set Interface**
	- **HashSet** 
		- implements Set Interface
		- store unique values
		- can have one null value
		- It doesn't maintain any order
	- **LinkedHashSet** 
		- extends HashSet Class 
		- store unique values
		- can have one null value
		- It maintain insertion order
	- **TreeSet** 
		- implements Set Interface as well as SortedSet Interface
		- store unique values
		- can't have null value
		- It maintain sorted order

- Code - Click [here](./SetDemo.java) to see the full code 
```java
      		//creating a HashSet
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(12);
		hs.add(11);
		hs.add(13);
		hs.add(12); //2nd time adding 12
		hs.add(14);
		hs.add(14);	//2nd time adding 14
		hs.add(null); //adding null value
		
		System.out.println(hs); //Output - [null, 11, 12, 13, 14]
		
		//creating a LinkedHashSet
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(12);
		lhs.add(11);
		lhs.add(13);
		lhs.add(12); //2nd time adding 12
		lhs.add(14);
		lhs.add(14); //2nd time adding 14
		lhs.add(null); //adding null value
		
		System.out.println(lhs); //Output - [12, 11, 13, 14, null]
		
		//creating a TreeSet
        	TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(12);
		ts.add(11);
		ts.add(13);
		ts.add(12); //2nd time adding 12
		ts.add(14);
		ts.add(14);	//2nd time adding 14
	//	ts.add(null); //adding null value will throw NullPointerException
		
		System.out.println(ts); //Output - [11, 12, 13, 14]
		
  ```  
 > **Note: A HashSet does not guarantee any order of its elements. If you need this guarantee, consider using a TreeSet to hold your elements.**
 
 ## List Vs Set
 
 -  List allows duplicate elements where as Set doesn’t allow duplicate elements.
 -  In List, I can access the element using their index. Whereas, In Set, I'm not allowed to access the element using the index.
 	- That is, I can do `list.get(0)`, I can't do this with set -  `hs.get(i)` -> this result error (not possible)
 	- **Note:** we have to use the forEach loop to access each element of the set. 
 - In List, multiple null elements can be stored, where as in  set, only one null element can be stored
 - List implementations are ArrayList, LinkedList, Vector, Stack. Set implementations are HashSet, LinkedHashSet and TreeSet.
 - **Converting a List to the Set**
 ```java
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
```
 - **Converting a Set to the List**
 ```java
 		// creating a HashSet
		HashSet<Integer> hs = new HashSet<>();

		hs.add(12);
		hs.add(11);
		hs.add(13);
		hs.add(12); // 2nd time adding 12
		hs.add(14);
		hs.add(14); // 2nd time adding 14

		System.out.println(hs);

		// converting hashSet to the arrayList
		ArrayList<Integer> alfromhs = new ArrayList<>(hs);
		System.out.println(alfromhs); // Output: [11, 12, 13, 14]
		// adding some values to the converted list
		alfromhs.add(12);
		System.out.println(alfromhs); // Output: [11, 12, 13, 14, 12]
```
> Click [here](./ListVSSetDemo.java) to see the full code.

# String Problems

## 1. String Diagonal Printing

![image](https://user-images.githubusercontent.com/70228962/170875891-b8e8aa4a-06cf-4931-b738-cd0932e4a2e0.png)


- Click [here](./StringsDiagonalPriniting.java) to see the solution

## 2. RemovingVowelsInString

![image](https://user-images.githubusercontent.com/70228962/170875484-60e3d6fb-ad74-425b-b83c-5e0fdd78969b.png)

- Click [here](./RemovingVowelsInString.java) to see the solution

## 3. UpperCase to LowerCase and Viceversa

![image](https://user-images.githubusercontent.com/70228962/170875554-cd373876-de8e-4246-81b5-66341c692997.png)

- Click [here](./LcaseTOUcaseAndViceversa.java) to see the solutions

## 4. IsValidPassword

- Get an Input String.Check whether the input String has atleast one Lowercase, Uppercase, Digit, and Special characters.If it has, print its a valid password or print its not a valid password.

![image](https://user-images.githubusercontent.com/70228962/170876012-72508d87-cae5-4b13-bdc8-f9ebfb8b1f58.png)

- Click [here](./isValidPassword.java) to see the solution

## 5. Count AtoZ's in String

![image](https://user-images.githubusercontent.com/70228962/170875766-aa6fc36f-aa3b-4c73-aa0d-e988591874b5.png)

- Click [here](./CountAtoZInString.java) to see the solution
