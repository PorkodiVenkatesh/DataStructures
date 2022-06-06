# 2D-Array: Reactor Simulator

A reactor simulator simulates matter and antimatter interacting with each other inside a reactor.
The cross-section of the reactor is represented as a 2D matrix.

## Steps
1. 0 represents empty space.
2. A positive integer represents a matter/antimatter mix of a particular element of 1 unit weight.
3. A 1 unit weight mix will not react on its own unless it comes in contact with another mix of the same element.
4. **Contact is adjancent left!**
5. Once they come in contact with each other of the same element, they eliminate each other, resulting in free space.
6. Due to gravity, the other units above this free space would then move down to occupy the space.
The reaction occurs stepwise.

### Write a program to find the number of units of mixes that are remaining after all the steps.

## Example
Consider an array denoting matters.
``` 
    1000
    2213
    (Step 1 - here the adjacent 2 will eliminate each other and make empty space)
    1000
    2213
    (The remaining array will be)
    1000
    0013
    (Step 2 - due to gravity 1 will come down)
    0000
    1013
``` 

Hence, the number of elements that remain in the reactor is 3.

## Input Format
The first line contains an integer N denoting the number of rows in the reactor.
The next line contains an integer M denoting the number of columns in the reactor.
Each line i of the N subsequent lines (where 0 ≤ i < N) contains M space-separated integers each describing the unit mixes present in row i.
 
### Sample Input
```
2
4
3 2 1 4
2 1 2 2
```

## Output Format
The output contains a single integer denoting the number of elements that remain in the reactor once all reactions are done.

### Sample Output
```
2
```
## Explanation
``` 
After Step 1, the adjacent 2 will eliminate each other and the matrix is:
    3 2 1 4
    2 1 0 0
During Step 2, the particles come down, and the matrix is:
    3 2 0 0
    2 1 1 4
During Step 3, the adjacent 1 will eliminate each other and the matrix is:
    3 2 0 0
    2 0 0 4
During Step 4, the particles come down, and the matrix is:
    3 0 0 0
    2 2 0 4
During Step 5, the adjacent 2 will eliminate each other and make empty space, the matrix is:
    3 0 0 0
    0 0 0 4
During Step 6 operation, the particles come down, and the matrix is:
    0 0 0 0
    3 0 0 4 
After this no further operation takes place.
``` 
Hence, the output is 2.

### Click [here](./solutions/Question8.java) to see the solution
