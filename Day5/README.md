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
- It allows us to only store the unique values
- It doesn't maintain the insertion order
- 3 classes that implements Set Interface
   - HashSet -> no duplicates, not maintain insertion order 
   - LinkedHashSet -> no duplicates, maintains insertion order
   - TreeSet -> no duplicaties, sorted order
```java
      //creating a HashSet
		HashSet<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(11);
		hs.add(13);
		hs.add(12); //2nd time adding 12
		hs.add(14);
		hs.add(14);	//2nd time adding 14
		System.out.println(hs); //Output - [11, 12, 13, 14]
      
      LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(12);
		lhs.add(11);
		lhs.add(13);
		lhs.add(12); //2nd time adding 12
		lhs.add(14);
		lhs.add(14);	//2nd time adding 14
		System.out.println(lhs); //Output - [12, 11, 13, 14]
      
      TreeSet<Integer> ts = new TreeSet<>();
		ts.add(12);
		ts.add(11);
		ts.add(13);
		ts.add(12); //2nd time adding 12
		ts.add(14);
		ts.add(14);	//2nd time adding 14
		System.out.println(ts); //Output - [11, 12, 13, 14]
  ```  
 > **Note: A HashSet does not guarantee any order of its elements. If you need this guarantee, consider using a TreeSet to hold your elements.**
