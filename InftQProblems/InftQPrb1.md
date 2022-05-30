## Add and Concatenate List Values

Given a List of numbers separated with comma. The numbers 5 and 8 are present in the list.
Note : Assume that 8 always comes after 5 and there is only one 8 and only one 5 in the input list.

Perform these two Cases on input list.
- Case 1 : num1 -> Add all numbers which do not lie between 5 and 8 in the input List.
- Case 2 : num2 -> Number formed by concatenating all numbers from 5 to 8 in the input list.

After that print sum of num1 and num2. For better understanding refer to the Input and Output sections.

### Constraints

5 <= N <= 1000

### Input Format :

First line will be given an Integer N which will denote number of integers in the list.

Second line you will get N integers be Integers separated with commas.

### Output Format :

Print Output in a single line according to given rules above.

## Test Case 1

**Input :**

8

3,2,6,5,1,4,8,9

**Output :** 

5168

**Explanation 1**

num1 : 3+2+6+9 = 20 ( According to Case 1 : adding all numbers which do not lie between 5 and 8 ).

num2 : 5148 ( According to Case 2 : Concatenating all numbers which is lie between 5 and 8, including 5 and 8 ).

Adding num1 and num2 will be our final output.

so num1 + num2 = 20 + 5148 = 5168.

## Test Case 2

**Input :**

10

3,4,5,10,20,8,9,7,45,66

**Output :** 

510342

**Explanation 2**

num1 : 3+4+9+7+45+66 = 134 ( According to Case 1 : adding all numbers which do not lie between 5 and 8 ).

num2 : 510208 ( According to Case 2 : Concatenating all numbers which is lie between 5 and 8, including 5 and 8 ).

Adding num1 and num2 will be our final output.

so num1 + num2 = 134 + 510208 = 510342.


