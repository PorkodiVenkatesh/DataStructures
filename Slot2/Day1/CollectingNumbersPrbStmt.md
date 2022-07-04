## Collecting Numbers II
You are given an array that contains each number between 1…n1…n exactly once. Your task is to collect the numbers from 11 to nn in increasing order.

On each round, you go through the array from left to right and collect as many numbers as possible.

Given mm operations that swap two numbers in the array, your task is to report the number of rounds after each operation.

### Input

The first line has two integers nn and mm: the array size and the number of operations.

The next line has nn integers x1,x2,…,xnx1,x2,…,xn: the numbers in the array.

Finally, there are mm lines that describe the operations. Each line has two integers aa and bb: the numbers at positions aa and bb are swapped.

### Output

Print mm integers: the number of rounds after each swap.

### Constraints

•	1≤n,m≤2⋅1051≤n,m≤2⋅105
•	1≤a,b≤n1≤a,b≤n

## Example

### Input:
```
5 3
4 2 1 5 3
2 3
1 5
2 3
```

### Output:
```
2
3
4
```
