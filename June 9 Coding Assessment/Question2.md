# Strings: Frog Jump

Pepe the frog possesses magical powers.
Whichever letter of the word Pepe steps upon, the case of that character changes.
Given a string of N letters and the distance K units that the frog can jump at a time, find the modified version of that string. 

### Note
The word may consist of both upper and lowercase letters.
Pepe always steps on the first letter and then takes the jump of K units.

### Input Format
The first line of input contains a string S (the word) and N denoting the number of letters in the word.
The second line of input contains an integer K denoting the number of units the frog jumps.

### Sample Input
```
AppLe  5                 --denotes the string S and N
2                            --denotes K.
 ```
### Constraints
```
1 <= N <= 100.
1 <= K <= N.
```

### Output Format
The output contains the modified version of the string.

### Sample Output
```
apPLE
 ``` 
### Explanation
```
Pepe is seated on the first letter "A" and hence changes it to "a".
The number of units that the frog jumps each time is 2 units.
Therefore, after the first jump, Pepe lands on the 3rd character "p" and changes it to "P".
Similarly, after the second jump, he lands on the 5th character "e" and changes it to "E".
Hence, the modified string is apPLE.
```

### Click [here](./solutions/Question2.java) to see the solution
