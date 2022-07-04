# Weird Algorithm
Consider an algorithm that takes as input a positive integer nn. If nn is even, the algorithm divides it by two, and if nn is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until nn is one. For example, the sequence for n=3n=3 is as follows:
```
3→10→5→16→8→4→2→13→10→5→16→8→4→2→1
```
Your task is to simulate the execution of the algorithm for a given value of nn.

### Input

The only input line contains an integer nn.

### Output

Print a line that contains all values of nn during the algorithm.

### Constraints
	1≤n≤1061≤n≤106
  
## Example

### Input:
```
3
```

### Output:
```
3 10 5 16 8 4 2 1
```
