## Longest Prefix and Suffix

A non empty string containing only alphabets.

Print the longest prefix from the input string which is same as suffix.

Prefix and Suffix should not be overlapped.

Print -1 if there is no prefix exist which is also the suffix without overlap.

Note : Do case sensitive comparison.

### Constraints

1 <= Length of String <= 1000


### Input Format :

You will be given string of only alphabets in one line.

### Output Format :

Print longest prefix according to given rules above in one line.

If there is no prefix which is also suffix without overlap then print -1.

## Test Case 1

**Input :**

xxAbcxxAbcxx

**Output :**
xx

**Explanation**

xx in the prefix and xx in the suffix and this is longest one in the input string.

hence output will be xx.

## Test Case 2

**Input :**
Racecar

**Output :** 
-1

**Explanation**
There is no any prefix which is also in suffix. 

**Note :** Comparison should be case sensitive so according to case sensitive rule R and r are two different alphabets in the input string. 
hence output will be -1

