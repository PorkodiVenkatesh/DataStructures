# Array Operations: Final Array

Given an array A of even size N, perform M operations on it and print the array. 

An operation is defined as: 

An operation of type "A" is defined as reversing the array. 

An operation of type "L" is defined as reversing the left half of the array. 

An operation of type "R" is defined as reversing the right half of the array. 

An operation of type "S" is defined as swapping the two halves of the array.

Print the required array after performing M operations on it. 


### Input Format 
The first line contains two integers N and M denoting the size of the array A and the number of operations respectively.
The second line contains N integers denoting the array A.
The third line contains the operation type.

### Sample Input 
```
4 4           -- denotes the size of array N and the number of operations M
1 2 3 4     -- denotes the array A
LRSR      -- denotes the operation type
```

### Constraints 
```
1 <= N <= 50 
1 <= M <= 5000
```

### Output Format  
The output contains the final array after M operations. 

### Sample Output 
```
4 3 1 2 
```

### Explanation 
```
As the operations are described in the picture, we simply follow them.
After L operation: 
2 1 3 4 
After R operation: 
2 1 4 3 
After S operation: 
4 3 2 1 
After R operation: 
4 3 1 2
Hence, the array becomes 4 3 1 2.
```

### Click [here](./solutions/Question3.java) to see the solution
