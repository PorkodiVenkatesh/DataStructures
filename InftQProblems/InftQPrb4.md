## Minimum Consecutive Number in Matrix

There will be a matrix of m * n given. 

If any number is consecutive 3 times either in rows ,columns ,diagonals print that number.

Note : If there are multiple numbers then print minimum of those numbers.

Note : If no consecutive number found in the given matrix then print -1.

### Constraints

3 <= m,n <= 100

### Input Format :

First line will be given values of m and n.(m rows and n columns)

Next m lines will be given with n integers in each lines.

### Output Format :

Print the minimum value according to given condition above.

## Test Case 1

**Input :**
6 7

2 3 4 5 6 2 4

2 3 4 7 6 7 6

2 3 5 5 5 5 2

2 3 1 1 2 1 3

1 1 1 1 9 0 3

2 3 1 1 5 1 2


**Output :** 

1

**Explanation**

There is minimum 3 consecutive 1's at row number 6th and 1 is minimum in the given matrix.  

hence output will be -1.

## Test case 2 

**Input**

4 4

0 0 2 1

0 2 1 3

2 1 3 0

1 3 0 0

**Output**
1

## Test case 3

**Input**

6 6 

![image](https://user-images.githubusercontent.com/70228962/171023199-3d0180af-43f4-4b40-a441-9147d8315ecc.png)


**output**

10


