## Array Operations: Magic Array

Alex gives an unsorted array to Joe and asks to find the magic array.

A magic array is an array such that for each element from the original array, it stores the count of all the elements to its right which are strictly smaller than the current element.

Write a program to find the magic array of a given array.

## Example 
The given array is [5,1,3,4,2].

For the first element, 5, there are 4 elements to its right that are strictly smaller than it.

For the second element, 1, there are 0 elements to its right that are smaller than it.

For the third element, 3, there is 1 element to its right that is smaller than it.

For the fourth element, 4, there is 1 element to its right that is smaller than it.

For the fourth element, 2, there are 0 elements to its right that are smaller than it.


Hence the magic array will be [4,0,1,1,0].


### Input Format
The first line contains an integer N denoting the size of the array.

The next N lines contain the array elements.

### Sample Input
```
5     -- denotes N
5     --
3     --
4     --  denotes N elements
1     --
2     --
```

### Output Format
The output contains N lines each containing the corresponding element of magic array.
 
### Sample Output
```
4
2
2
0
0
```

### Explanation
The original array is [5,3,4,1,2].

There are 4 elements smaller than 5 on its right.

There are 2 elements smaller than 3 on its right.

There are 2 elements smaller than 4 on its right.

There are 0 elements smaller than 1 on its right.

There are 0 elements smaller than 2 on its right.

So the magical array is [4,2,2,0,0].

Hence the output is

```
4
2
2
0
0
```

### Click [here](./solutions/Question7.java) to see the solution
