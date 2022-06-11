# Stacks: Check Work Status

There are N people whose names and work status are given.

If the work status is 1, the job is complete; append that name in stack A.

If the work status is 0, the job is incomplete; append that name in stack B.

Assign the person from the ith level of stack A to help the person at the ith level of stack B.

Print the name of the person who has completed the job and then print the name of the person who has not completed the job after a space.
 
### Note
N will be always an even number. The number of people who have finished the job will be always N/2.

### Input Format
The first line of the input contains an integer N, denoting the total number of people.
Each of the following N lines will contain team member’s name and their work status.
 
### Sample Input
```
4                 -- denotes the total number of people N.
Jacob 1
John 1
Brendon 0
Mike 0
```

### Constraints
```
4<= N <= 10
‘a’<= name[i]<=’z’
```

### Output Format
The output contains the name of the person who has completed the job and then the name of the person who has not completed the job after a space.

### Sample Output
```
John Mike
Jacob Brendon
```   
### Explanation
Jacob’s and John’s work status is 1, so they’re placed in stack A.

Brendon’s and Mike’s job status is 0, so they’re placed in stack B.

After placing all the members in a particular stack based on their work status, we pop out and print the topmost element from stack A and after giving space, we pop out and print the topmost element of stack B.

### Click [here](./solutions/Question2.java) to see the solution
