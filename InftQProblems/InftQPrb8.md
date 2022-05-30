## Bracket Validator

A non empty string containing only brackets (,),{,},[,] .

Print output based on following.

- If Input string is properly nested (means balanced ) then print 0.
- 
- If Input string is not properly nested (means not balanced),then print position of bracket of input string from where it is not balanced.
- Position start from 1.


Note : A bracket string is said to be balanced when every opening of any bracket will have their corresponding closing bracket. For Better understanding refer input and output section.

### Constraints

1 <= Length of String <= 1000

### Input Format :

You will be given bracket of string in one line.

### Output Format :

Print Output in a single line according to given rules above.

## Test Case 1

**Input :**

{([])}[]

**Output :** 
0

**Explanation**

Because every opening bracket has a corresponding closing bracket.

hence output will be 0.

## Test Case 2

**Input :**

([)()]

**Output :** 
3

**Explanation**

At 2nd position there is opening bracket. At 3rd position there is closing of another bracket.

hence it is not properly nested means not balanced.
