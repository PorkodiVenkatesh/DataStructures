## Array Operations: Maximum Absolute Difference

You are given an array A of integers. You have to find the value of X+Y, where:  

X is the maximum absolute difference between two even elements present in the array, and

Y is the maximum absolute difference between two odd elements present in the array. 

### Note
It is always guaranteed that at least two odd and two even elements will be present. 

### Function Description
In the provided code snippet, implement the provided ArrayMaxima() using variables to print the value of X+Y. You can write your code in the space below the phrase “WRITE YOUR LOGIC HERE”. 
There will be multiple test cases running so the Input and Output should match exactly as provided.
The base Output variable result is set to a default value of -404 which can be modified.
Additionally, you can add or remove these output variables. 

### Input Format
The first line contains an integer N denoting the size of the array A

The second line contains N integers denoting the elements of array A.

### Sample Input

7

1 3 6 8 2 6 8

### Constraints
4<= N<=100000 

0<=A[i]<=500 

### Output Format
The output contains a single integer denoting the value of X+Y. 

### Sample Output

8  

### Explanation 
The value of X will be (4-2) = 2.
The value of Y will be (7-1) = 6. 
Hence, the value of x+y will be 2+6 = 8. 
