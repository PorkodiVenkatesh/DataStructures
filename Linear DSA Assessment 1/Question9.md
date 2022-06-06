# Queue: Transactions

There are N soccer players standing in a line outside the practice ground to enter.

Each individual is either a striker, midfielder, or defender having priority 3, 2, and 1 respectively.

A striker is given higher priority, followed by a midfielder, followed by a defender.

Execute the transactions of all the strikers first, followed by the midfielder, and the remaining defender after that.

A transaction takes place if the individual is in the first position of the line.

If there are other individuals with lower priority standing before the person with higher priority, then all those individuals should be sent back in the line one by one, which takes 1 unit of work to do so.

It takes 2 units of work to execute a transaction when a person has higher priority as compared to other individuals.

Print the total units of work done to execute all the transactions in the given manner.

## Input Format
The first line of input contains a single integer N, denoting the size of the array.

The second line of input contains N space-separated integers containing either 1, or 2, or 3 denoting the priority of the individuals.

## Sample Input
```
4
1 2 3 1
```
## Constraints
1 < N < 500

Ai = 1 or 2 or 3.

## Output Format
The output contains a single integer denoting the total units of work done to execute all the transactions.

## Sample Output
```
12
```
## Explanation
```
Array after 1st step – {3, 1, 1, 2}, Work done till now = 2; [Send back all the lower priority individuals]
Array after 2nd step – {1, 1, 2}, Work done till now = 4; [Execute transaction]
Array after 3rd step – {2, 1, 1}, Work done till now = 6; [Send back all the lower priority individuals]
Array after 4th step – {1, 1}, Work done till now = 8; [Execute transaction]
Array after 5th step – {1}, Work done till now = 10; [Execute transaction]
Array after 6th step - {}, Work done till now = 12; [Execute transaction]
```

Hence, the output is 12.
