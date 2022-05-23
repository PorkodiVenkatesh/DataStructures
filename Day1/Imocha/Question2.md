## Array Operations: Mathematical Equations

You are given an equation (A[0]+A[1]+A[2]…......... A[N - 1]+X)/N = Y;

You are given an array of size N where A[0], A[1]……A[N - 1] are array elements (consider 0 based indexing). The value of Y is given.

You have to find the value of X.

### Note
The value of X can be positive, negative, or zero.

### Input Format
The first line contains an integer N denoting the size of the array.

The second line contains array elements of size N.

The third line contains a single integer Y.

### Sample Input
```
5
1 7 3 4 2
6
```

### Constraints
1 <= N<=1000

1<=A[i]<=500

1<=Y<=100
 
### Output Format
The output contains a single integer denoting the value of X.

### Sample Output
```
13
```

###  Explanation
The sum of array elements is 17.

The value of Y is 6 and the value of N is 5.

Hence, X = 6*5-17 = 13

### click [here](./solutions/Question2.java) to see the solution
