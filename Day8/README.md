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
  //Taking the BigInteger as Input
  BigInteger b1 = sc.nextBigInteger();
  
  //getting rem from  dividing by 7 i.e typical n%7 
  // Why BigInteger.valueOf(7)? I have to convert Integer 2 to the BigInteger because that's when I can perform operations with BigInteger
  BigInteger rem = b1.mod(BigInteger.valueOf(7)); 
  
  //Checking the remainder is 0 or not.. so comparing with BigInteger.ZERO
  if (rem == BigInteger.ZERO)
    System.out.println("Divisible by 7");
  else
    System.out.println("Not Divisible by 7");
```    
- Click [here](./BigIntegerDivisibleBy7.java) to see the full code.
