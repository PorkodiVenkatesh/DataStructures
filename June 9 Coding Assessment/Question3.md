# Strings: Find the Phone Number

A string S is given. Extract the 10 digit phone number from the string S.
It is guaranteed that there is only a SINGLE occurrence of contiguous 10 digits and there is NO contiguous occurrence of 11 digits or more.
Print the 10 digits of the phone number from the extracted string S.
In case there is no 10 digit number, print -1.

### Note
If the 10 digit number present in the string starts from 0, then it cannot be considered as a phone number.

 
### Input Format
The first line contains a string S.

### Sample Input
```
Ijoamhueiash989656mpyonsnueberi1234567890 -- denotes the string S
 ```
 
### Constraints
```
0< S.length() < 107
```

### Output Format
The output contains the 10 digit phone number present in the string.

### Sample Output
```
1234567890
```

### Explanation
```
The string S "Ijoamhueiash989656mpyonsnueberi1234567890" becomes "1234567890" after the extraction of numbers.
Hence, the output is 1234567890.
```

### Click [here](./solutions/Question3.java) to see the solution
