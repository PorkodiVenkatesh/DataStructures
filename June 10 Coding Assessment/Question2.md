# Mathematics: Perfect Square Difference

You are given an integer N. Consider the array from 1 to N (inclusive).

Find the number of pairs having their difference equal to a perfect square.
 

### Input Format
The first line contains an integer N.
 

### Sample Input
```
10 -- denotes an integer N
``` 

### Constraints
```
1 <= N <= 1010
```

### Output Format
```
The output contains the number of pairs having a perfect square difference.
```

### Sample Output
```
16
```
 

### Explanation
```
Given: N = 10
The array will be [1,2,3,4,5,6,7,8,9,10].
Pairs with difference 1 are (1,2), (2,3) .. upto (9,10). Number of pairs = 9
Pairs with difference 4 are (1,5), (2,6)... up to (6,10). Number of pairs = 6
Pair with difference 9 is (1,10). Number of pairs = 1
There will be no pair with a difference of 16 and above.
Therefore, total number of required pairs = 9 + 6 + 1 = 16.
Hence, the output is 16.
```

### Click [here](./solutions/Question2.java) to see the solution
