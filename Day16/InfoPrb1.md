# Find Nth Prime

### Problem Statement

You are given a number 'N'. Your task is to find Nth prime number.
A prime number is a number greater than 1 that is not a product of two smaller natural numbers. Prime numbers have only two factors – 1 and the number itself.
Any number greater than 0 is a natural number i.e. natural numbers N = {1, 2, 3, 4,....}
### For example:-
If you are asked to find the 7th prime number, it’ll be 17 because the first 7 prime numbers are 2, 3, 5, 7, 11, 13, 17.
### Note: 1 is not a prime number.
### Follow Up:
Try to solve the problem in O(N).
### Input Format :
The first line of input contains an integer 'Q' representing the number of the queries. Then the queries follow:

The first line of each query contains an integers ‘N’ representing the number of a prime number to be found.
### Output Format :
For each query, return the Nth prime number. 

Print the output of each query in a separate line.
### Note:
You do not need to print anything; it has already been taken care of. Just implement the given function.
### Constraints:
```
1 <= Q <= 100
1 <= N <= 10^4
```
Time Limit: 1 sec
### Sample Input 1:
```
3
5 
2
1
```
### Sample Output 1:
```
11
3
2
```
### Explanation For Sample Input 1:
For the first query, the prime numbers are [2, 3, 5, 7, 11]

For the second query, the prime numbers are [2, 3]

For the third query, the prime number is [2]
### Sample Input 2:
```
3
46
20
13
```
