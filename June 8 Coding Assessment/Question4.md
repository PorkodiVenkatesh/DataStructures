# Array Operations: Count Subarrays

Given an array of positive integers, count the number of subarrays in the array such that the sum of all elements in the subarray is equal to K. 

### Note
A subarray is defined as a contiguous part of an array that can be obtained by removing some or no elements from the beginning and end of the array.

### Example 
Given an array of 5 elements: [5, 5, 4, 1, 9] and K= 10

There are 3 subarrays with a sum equal to 10.
 

### Input Format
The first line of input contains 2 space-separated integers N and K.
The next line contains N space-separated integers denoting the array.

### Sample Input
```
5 10 
5 5 5 5 5
```

### Constraints
```
1 <= N <= 105
1 <= K <= 109
1 <= A[i] <= 104
```

### Output Format
The output contains a single integer denoting the count of K sum subarrays.

### Sample Output
```
4
```

### Explanation
```
The subarrays formed are:
1. Index 0 to Index 1
2. Index 1 to Index 2
3. Index 2 to Index 3
4. Index 3 to Index 4
Hence, the output is 4.
```
### Click [here](./solutions/Question4.java) to see the solution
