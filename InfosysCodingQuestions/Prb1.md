## Magic Trick

Bob the magician is performing a stage show. He has a pile of N cards much that each card has numbers from 1 to N and each card has a unique number on it

Bob wants to take out the take out the cards in increasing order which means 123... N as a part of his performance However, a cand can be taken out only from the top of the pile.
Three types of operations can be performed by Bob.
- Take a card from the bottom of the pile an move it to the top the cost for this operation is equal to the number written on the card being moved
- Take a card from the top of the pile and move to the bottom the cost for this operation is equal to the number written on the card being moved,
- Take out the required card from the top of the pile: This operation is free of cost

You are given the value of N and also an array AR which shows the order of cards in the pile from top to bottom.

Find the minimum cost Bob has to play in order to complete the performance . Since this cost can be large return the result Modulo 10^9/7.

NOTE: The array AR is always a permutation of numbers from 1 to N.

### Input Format
The first line contains an integer N, denoting the number of cards. Each line i of the N subsequent lines(where 0<=i <N) containes an integer describing AR[i], which is the order of the cards from top to bottom.

### Example: 
```
	Sample Input                                  Sample Output 	
		3                                                             3
		 3
		 2
		 1 
.........................................................................................
		5                                                              15
		3
		5
		1
		4
		2
  ```
