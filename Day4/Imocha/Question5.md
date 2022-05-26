## Arrays: Contiguous Subarrays

You are given an array of size N and an integer M.

You have to find the maximum element for every contiguous subarray of size M.

 
### Note

Contiguous subarrays of [1,2,3,4] are [1], [2], [3], [4], [1,2], [2,3], [3,4], [1,2,3], [2,3,4], [1,2,3,4].

You have to print the maximum element for each and every contiguous subarray of size M in order, i.e. the first integer corresponding to maximum from a subarray of indices 1 to M, the second integer corresponding to the maximum from a subarray of indices 2 to M+1 and so on.

### Input Format

The first line of the input contains two space-separated integers N and M.

The next line contains N space-separated array elements.

### Sample Input
```
4 3           -- denotes N and M separated by a space
6 3 2 5     -- denotes N elements
```

### Output Format

Print space-separated integers corresponding to maximum elements of subarrays of size M.

### Sample Output
```
6 5
```

### Explanation
Subarrays of size 3 are {6, 3, 2} and {3, 2, 5} respectively.

And 6 and 5 are the respective maximum elements of the subarrays.

Hence the output is 6 5.

### Click [here](./solutions/Question5.java) to see the solution
