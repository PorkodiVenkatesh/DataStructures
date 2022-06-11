## Strings: Secret Word

Alice and her friends are playing a detective game.

Here two detectives want to exchange the secret information they have gathered, but another detective Bob is trying to intercept their emails. Hence, Alice came up with an idea.

For every letter in her word, she counts its position from the beginning in the English alphabet (a = 1; e = 5; etc.) and replaces it with the letter at the same position from the end (a = z; y = b; etc.).

Given a string of length N, print the final string that Alice will write in her secret email.
 

### Input Format
The first line contains an integer N.

The second line contains a string of lowercase English letters of length N.

### Sample Input
```
5            --denotes N the length of the string.
abaca    --denotes string S.
```

### Constraints
 1 <= N <= 100
 
### Output Format
The output contains the final string that Alice will write in her email.
 
### Sample Output
```
zyzxz
``` 
### Explanation
In the given input string, a will be replaced by z, b by y, and c by x.
  
Hence, the result is zyzxz.

### Click [here](./solutions/Question1.java) to see the solution
