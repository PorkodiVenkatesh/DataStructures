# Introduction Algorithm

- What is Algorithm
- Examples of Algorithm
- What do you mean by a good Algorithm?
- Efficiency Matters
- Analysis of Algorithm
- Space Complexity
- Time Complexity
- Asymptotic Notation : Big O , theta and Omega
- Best, Average and Worst Case using Linear Search Algorithm
- Big O 
- O(1): Constant Time
- O(N) linear Time
- Sum of N natural numbers
- 4 Rules in Big O
- O(logn)
- Big O Complexity Chart
- Advantages and Disadvantages of Algorithm
- Types of Algorithm
- Brute Force

### You can find the content in this [ppt](./Algorithm%20IntroductionPPT.pdf)

# Recursion

Recursion is the technique of making a function call itself until reach the base condition

## Factorial of given Number n

- `n! = n* (n-1)!`
- Base condition: 1! = 1
- Code: - Click [here](./FactorialOfNum.java) to see the full code
```java
public static int factorial (int n) {
		System.out.println("n = " + n);
		if (n==1)
			return 1;
		
		return n* factorial(n-1);
	}
```
![Screenshot (591)](https://user-images.githubusercontent.com/70228962/173191985-023fe3a7-0055-4dbf-96c8-09b046007f00.png)

## x power of n

- $x^n$ = x * $x^n-1$
- base condition: $x^1$ = x
- Code: - Click [here](./xPowerOfN.java) to see the full code
```java
public static int power(int x , int n) {
		if (n==1)
			return x;
		
		return x * power(x, n-1);
	}
```
![Screenshot (593)](https://user-images.githubusercontent.com/70228962/173192249-051c7b5b-49f7-4103-97d5-075a62876131.png)


## Predict the Output 

**Question 1: What will be returned if we call `fun1(1);` in the main method?**
```java
public static int fun1(int n)
	{
	    if (n == 4)
	       return n;
	    else 
	    	return 2*fun1(n+1);
	}
```
**Answer: 32**
**Explantion Pic:**
![Screenshot (595)](https://user-images.githubusercontent.com/70228962/173192402-6e00d704-de00-400c-9b85-79e651731e19.png)

--



