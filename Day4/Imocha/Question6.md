## Array Operations: Occurrence of Minimum Element

You are given array Arr of N integers.

Print the total number of subarrays of Arr which have exactly one occurrence of the minimum element of the whole array. 

 
### Note
Subarray is a contiguous part of array from index i to j inclusive, such that 0<=i<=j<=N-1
There can be multiple occurrences of any element.
 
### Input Format
The first line contains an integer N.
The second line contains N space-separated integers of Arr.

### Sample Input
```
5                -- denotes N
1 2 1 4 1    -- denotes Arr[]
```

### Constraints
1 <= N <= 1000

-109<=Arr[i]<=109

### Output Format
The output should return the total number of subarrays of the array in which the minimum element of the array occurs exactly once.

### Sample Output
8         
 
### Explanation
For sample test case Arr is [1,2,1,4,1]

The minimum element in the whole array is 1.

Following are the subarrays of given array – 
```
[1], [1,2], [1,2,1], [1,2,1,4], [1,2,1,4,1],
[2], [2,1], [2,1,4], [2,1,4,1],
[1], [1,4], [1,4,1],
[4], [4,1],
[1]
```
Out of the above subarrays, the subarrays that have “1” exactly once are 
```
[1], [1,2]
[2,1], [2,1,4]
[1], [1,4]
[4,1]
[1]
````
The count of the above subarrays is 8.

Note: [1,2,1] is not counted as 1 is appearing twice in the array.

Hence, the output is 8. 

### Click [here](./solutions/Question6.java) to see the solution
