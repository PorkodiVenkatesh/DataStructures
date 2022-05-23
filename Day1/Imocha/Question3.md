## Array Operations: Weird Sum

Alex defines the term 'weird-sum'.

For every element in an array, the 'weird-sum' of that element is calculated as the sum of all other elements in the array, except that element.
 
For example: For the array {2,3,4}:
Weird sum [2] = 3+4 = 7
Weird sum [3] = 2+4 = 6
Weird sum [4] = 2+3 = 5
 
For a given array, he wants you to write a program to find the 'weird-sum' of all the array elements.

### Input Format
The first line contains the size of the array, N
Next N lines contain the elements of the array.

### Sample Input
```
4    -- denotes N
3    --
4    -- denotes N elements
1    --
2    --
```  

### Output Format
The output contains N lines denoting the weird sum of each element on each line.
 
### Sample Output
```
7
6
9
8
```

### Explanation

The array is [3,4,1,2]. 

Weird sum [3] = 4+1+2 = 7 

Weird sum [4] = 3+1+2 = 6 

Weird sum [1] = 3+4+2 = 9 

Weird sum [2] = 3+4+1 = 8 

Similarly, the weird sum of each element is calculated.

Hence the output is:

7

6

9

8
 
### click [here](./solutions/Question3.java) to see the solution
