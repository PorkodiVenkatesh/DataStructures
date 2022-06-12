# Introduction Algorithm


### You can find the content in this [ppt](./Algorithm%20IntroductionPPT.pdf)

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

# Linear Search

- In Linear Search,
- **Input**-  integer array of size ‘n’ and integer to search ‘k’
- **Output** -  If the element "k" is found in the array, then we have return 1, otherwise we have to return 0.
- **Steps:**
	- We will traverse each and every element of the array and compare that element with "k"  
	- If it is equal to "k" then return 1, otherwise, keep on comparing for more elements in the array and if you reach at the end of the array and you did not find any element, then return 0.
	
![image](https://user-images.githubusercontent.com/70228962/173245734-30e6c1b4-00ce-44a6-9119-3d6baab4b4aa.png)


- **Code:** Click [here](./LinearSearch.java) to see the full code

```java
public static int linearSearch(int[] arr, int k) {
		
		int n = arr.length;
		//linear search
		//traverse each and every element of the array and compare that element with "k". 
		for(int i = 0; i< n; i++) {
			if(arr[i] == k) { //If it is equal to "k" then return index its present, 
				return i;
			}
		}
			
		return -1;
		//otherwise, keep on comparing for more elements in the array and 
		//if you reach at the end of the array and you did not find any element, then return -1.


	}
```

### Time Complexity and Space Complexity of Linear Search

- Best Case Time Complexity : O(1)
- Average Case Time Complexity : O(N)
- Worst Case Time Complexity : O(N)
- Space Complexity : O(1)

# Recursions

Recursion is the technique of making a function call itself until reach the base condition

To build a recursive algorithm, you will break the given problem statement into two parts. The first one is the base case, and the second one is the recursive step.

- **Base Case:** It is nothing more than the simplest instance of a problem, consisting of a condition that terminates the recursive function. This base case evaluates the result when a given condition is met.
- **Recursive Step:** It computes the result by making recursive calls to the same function, but with the inputs decreased in size or complexity.

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

---

**Question 2: What will be returned if we call `fun2(4,3)` in the main method?**
```java
static int fun2(int x, int y) 
	{
	  if (x == 0)
	    return y;
	  return fun2(x - 1,  x + y);
	} 
```

**Answer: 13**

**Explantion Pic:**

![Screenshot (598)](https://user-images.githubusercontent.com/70228962/173192588-c62fff0a-94e0-407b-8ce4-a337b5bd948f.png)

---

**Question 3: What will be returned if we call `fun3(25);` in the main method?**
```java
static void fun3(int n)
	{
	  if (n == 0)
	    return;
	 
	  System.out.println(n%2);
	  fun3(n/2);
	} 
```

**Answer:**
```
1
0
0
1
1
```

**Explantion Pic:**

![Screenshot (600)](https://user-images.githubusercontent.com/70228962/173192638-9d64275b-12a6-4e61-a052-b81bcd0308c2.png)

### Click [here](./examples.java) to see the full example code

## Fibonacci Series Using Recursion

- nth term in the fibonacci series is the addition of previous two terms i.e. ` nth term  =  (n-1)th term + (n-2)th term
- Base condition: first term and second term in the series is 1
- Code: Click [here](/FibDemo.java) to see the full code
```java
static int fib (int n) {
		if (n==1 || n==2 )
			return 1;
		
		return fib(n-1) + fib(n-2);
	}
```

![Screenshot (604)](https://user-images.githubusercontent.com/70228962/173192883-ce5c668e-53cc-44da-97cf-85bc75b5084f.png)
