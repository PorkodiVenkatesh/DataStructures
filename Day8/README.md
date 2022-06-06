## BigInteger

- Java provides some primitives, such as int or long, to perform integer operations. But sometimes, we need to store numbers, which overflow the available limits for those data types. 
- If you have a number really that big, we can store them using BigInteger
- BigInteger is a class defined in the java.math package
- **Note: You can manipulation with BigInteger with only another Big Integer.**
- Creating a BigInteger from a String
```java
BigInteger b1 = new BigInteger("12345678");
```
- If you want to convert a Integer to BigInteger so that you can perform some operation like addition, subtraction, division, multiplication and division
```java
BigInteger b2 = BigInteger.valueOf(5);
```
- Methods to perform some arithmetic operations
```java
BigInteger sum = b1.add(b2);
BigInteger diff = b1.subtract(b2);
BigInteger prod = b1.multiply(b2);
BigInteger qut = b1.divide(b2);
BigInteger rem = b1.mod(b2);
```
- Methods to find min and max from 2 BigInteger
```
BigInteger minValue = b1.min(b2);
BigInteger minValue = b1.max(b2);
```
- Click [here](./BigIntegerDemo.java) to see the full code.
- Here is the code to find a given BigInteger is multiple by 7 or not
```java
  // Taking the BigInteger as Input
  BigInteger b1 = sc.nextBigInteger();
  
  // getting rem from  dividing by 7 i.e typical n%7 
  // Why BigInteger.valueOf(7)? I have to convert Integer 2 to the BigInteger 
  // because that's when I can perform operations with BigInteger
  BigInteger rem = b1.mod(BigInteger.valueOf(7)); 
  
  // Checking the remainder is 0 or not.. so comparing with BigInteger.ZERO
  if (rem == BigInteger.ZERO)
    System.out.println("Divisible by 7");
  else
    System.out.println("Not Divisible by 7");
```    
- Click [here](./BigIntegerDivisibleBy7.java) to see the full code.

# Decimal to Binary

The steps to convert Decimal Numbers to Binary numbers are given below:

- 1st Step: Check if the given decimal number is less than 2. If it is less than 2 then the given Decimal No is the same when converted to its binary equivalent.
- 2nd Step: If the given decimal number is greater than 2, then divide the given number by 2.
- 3rd Step: Note down the Remainder.
- 4th Step: Repeat steps 2 and 3 until the quotient is less than 2.
- 5th Step: Now note down the remainders from bottom to top.
*Note: If the given Decimal Number is even then the remainder will be 0. If the given Decimal Number is odd then the given number will be 1.*

**Example: Convert 18 and 15 to Binary Equivalent number.**

<img width="802" alt="decimal to binary (2)" src="https://user-images.githubusercontent.com/70228962/171802599-348d342e-34d6-4ee3-963f-8a9246d59695.png">

- Click [here](./DecimalToBinary.java) to see the code where we convert decimal to binary 
- InBuilt Method in Java to convert decimal and binary - `Integer.toBinaryString(decimal)`
```java
		System.out.println("enter decimal (Integer): ");
		Integer decimal = sc.nextInt();
	
		String binary = Integer.toBinaryString(decimal);
		System.out.println(binary);
```

# Binary to Decimal

The steps to convert Binary Numbers to Decimal numbers are given below:
- Step 1: Write down the binary number.
- Step 2: Starting with the least significant digit (LSB - the rightmost one), multiply the digit by the value of the position. Continue doing this until you reach the most significant digit (MSB - the leftmost one).
- Step 3: Add the results and you will get the decimal equivalent of the given binary number.

**Example: Convert 10101 to the Decimal Number.**

![image](https://user-images.githubusercontent.com/70228962/171806384-5318a840-5065-4cf2-af3a-a653d56e0d0c.png)

- Click [here](./BinaryToDecimal.java) to see the code where we convert binary to decimal
- InBuilt Method in Java to convert binary to decimal - `Integer decimal = new Integer(binary, 2);`
```java
		String binary = "100101101011010000111";
		
		Integer decimal = new Integer(binary, 2);
		System.out.println(decimal)
```

# Map

- Map is an Interface, Part of the collection framework
- but doesn't extend collection Interface
- It allows us the store the key and value pairs
- A Map contains **unique keys**
- A Map doesn't allow duplicate keys, but you can have duplicate values.

![image](https://user-images.githubusercontent.com/70228962/171667575-395e7eea-579b-4418-ba12-f489156c1d41.png)

- **3 classes that extends Map Interface**  
  - **HashMap**
    - implements Map Interface
    - Unique Keys 
      - Allows only one null key
    - Values can be duplicates as well as null
    - It doesn't maintain any order. 
  - **LinkedHashMap**
    - extends HashMap Class
    - Unique Keys 
      - Allows only one null key
    - Values can be duplicates as well as null
    - It maintains the Insertion Order
  - **TreeMap** 
    - implements Map as well as SortedMap Interface
    - Unique Keys 
      - doesn't allows null key
    - Values can be duplicates as well as null
    - Maintains the sorted Order

- Code: Click [here](./MapDemo.java) to see the full code
```java
		// Creating HashMap
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(2, "Two");
		hm.put(1, "One");
		hm.put(3, "Three");
		hm.put(4, null); // adding null value
		hm.put(null, "some"); // adding null key
		hm.put(1, "ONE"); // adding already added key with new value
		hm.put(22, "Two"); // adding new key with existing value

		System.out.println(hm);
		      // OUTPUT: {null=some, 1=ONE, 2=Two, 3=Three, 4=null, 22=Two}

		// Creating LinkedHashMap
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(2, "Two");
		lhm.put(1, "One");
		lhm.put(3, "Three");
		lhm.put(4, null); // adding null value
		lhm.put(null, "some"); // adding null key
		lhm.put(1, "ONE"); // adding already added key with new value
		lhm.put(22, "Two"); // adding new key with existing value

		System.out.println(lhm);
		      // OUTPUT: {2=Two, 1=ONE, 3=Three, 4=null, null=some, 22=Two}
		
		// Creating TreeMap
		TreeMap<Integer, String> tm = new TreeMap<>();

		tm.put(2, "Two");
		tm.put(1, "One");
		tm.put(3, "Three");
		tm.put(4, null); // adding null value
	//	tm.put(null, "some"); // adding null key - will throw NullPointerException
		tm.put(1, "ONE"); // adding already added key with new value
		tm.put(22, "Two"); // adding new key with existing value

		System.out.println(tm);
		      // OUTPUT: {1=ONE, 2=Two, 3=Three, 4=null, 22=Two}
```

# HashMap Methods

- Click [here](./HashMapDemo.java) to see the code
- Methods
	- HashMap<Integer, String> hm = new HashMap<>(); -> creating an HashMap where Keys are Integer and  values are String 
	- hm.put(2, "Two") -> used to insert the key value pair to the Map (i.e here hm)
	- hm.get(2) -> return the value for the key (i.e. here 2)
	- hm.size() -> returns the number of entries(key-value pair) in the map.
	- hm.keySet() -> returns the set of the keys in map
	- hm.values() -> returns the values in the map
	- hm.containsKey(keyToCheck) -> return true if keyToCheck is present in the map else false
	- hm.containsValue(valueToCheck) -> return true if valueToCheck is present in the map else false

## HashMap Practice Problems

- Program to count how many a's, b's, c's ... z's in the given String using HashMap. Click [here](./CountCharactersInString.java) to see the solution

## Code Chef Problems

- Prb5: [Small factorials](https://www.codechef.com/submit-v2/FCTRL2) - Click [here](./CCPrb5.java) to see the solution

## Geeks For Geeks Problems

- Prb5: [HashMap Operations](https://practice.geeksforgeeks.org/problems/java-collection-set-3-hashmap/1#) - Click [here](./GFGPrb5.java) to see the solution
- Prb6: [Run Length Encoding](https://practice.geeksforgeeks.org/problems/run-length-encoding/1/?page=1&company%5b%5d=Microsoft&category%5b%5d=Strings&sortBy=submissions) - Click [here](./GFGPrb6.java) to see the solution
- Prb7: [Replace the Bit](https://practice.geeksforgeeks.org/problems/replace-the-bit3212/1/?page=3&company%5b%5d=Microsoft&category%5b%5d=Strings&sortBy=submissions) - Click [here](./GFGPrb7.java) to see the solution
