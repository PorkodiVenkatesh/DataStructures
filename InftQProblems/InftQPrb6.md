## String Rotation

You will be given some pair of string and number.

Each pair will be separated with comma and in every pair string is associated with the number separated with colon(':').

Apply these rules on given input data.

**Rule 1 :** If sum of squares of corresponding digits is even then rotate the string left by 1 position.

**Rule 2 :** If sum of squares of digits is odd then rotate the string right by 2 position.

### Constraints

1 <= Number of pairs <= 100

### Input Format :

First line will be given pairs separated with comma(',') and in each pair string will be associated with number separated with colon(':').

### Output Format :

Print rotated string of every pair separated with space.

## Test Case 1

**Input :**

rhdt:246,ghftd:1246

**Output :** 

trdt ftdgh

**Explanation**

Finding sum of squares of every digits of first pair _2*2+4*4+6*6=56_ which is even so rotate rhdt left by 1 position so after rotating by one position so it will become trhd.

Finding sum of squares of every digits of second pair _1*1+2*2+4*4+6*6=57_ which is odd then rotate ghftd right by 2 position so it will become ftdgh.

Hence output will be trhd ftdgh.

## Test case 2

**Input:** 

rhdt:246,ghftd:1246,pihjen:90,lkbnm:67

**Output:**

trhd ftdgh hjenpi bnmlk

