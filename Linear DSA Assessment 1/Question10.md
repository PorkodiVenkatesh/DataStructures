# Array Operations: Array Sum 

You are given an array A having N elements, and an integer M.

In one operation, you can select any index i and replace the element A[i] with 2*A[i].

You have to perform M such operations. Let arraysum be the sum of all elements in the final array.

Find out the minimum arraysum that you can obtain. 

## Input Format

The first line contains 2 space-separated integers N and M.

The second line contains N space-separated integers, i.e. elements of array A.

## Sample Input
```
2 2
1 10
```

## Constraints
1 <= N <= 100
1 <= M <= 10
1 <= A[i] <= 100

## Output Format
The output contains the required integer in a single line.

## Sample Output
```
14
```
 
## Explanation
```
We can get a sum of 14 by selecting the 0th index in both operations and we cannot obtain a sum less than 14.
After 1st operation, A = [2*1, 10] = [2, 10]
After 2nd operation, A = [2*2, 10] = [4, 10]
So, sum = 4 + 10 = 14.
```
