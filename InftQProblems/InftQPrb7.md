## Password Generation

Given input of array of string in format employee name:employee number separated by commas.

Find maximum digit in the corresponding employee number which is less or equal to the length of employee name and add that place char into the final string.

Note : If there is no any digit which satisfy the condition then add 'X' into the final string.

### Constraints

1 <= Number of Employees <= 100

### Input Format :

First line will be given array of employee name associated with employee number and every employee details will be separated with commas (',').

### Output Format :

Print final generated password according to given rule above.

## Test Case 1

**Input :**

Robert:36787,Tina:68721,Jo:56389

**Output :** 

tiX

**Explanation**

- So first employee name and employee number is **Robert:36787**. Now in the employee number **36787** there is **6** which is maximum and less than or equal to the length of **Robert**. So we will take 6th character of **Robert**. So here at 6th position in **Robert** there is **t** so we will add **t** into the final output string.
- Same we will do with other employee details. Next one is **Tina : 68721** Now in the emp number there is **2** which is maximum and less than or equal to the length of **Tina**. So we will take 2nd character of **Tina**. So here at 2nd position in **Tina** there is **i** so we will add **i** into the final output string.
-  Next employee is **Jo:56389**. So in the employee number there is no any digit which is maximum and less than or equal to length of Jo. So in this case we will add **X** into the final String Output.


Hence final output string i.e generated password will be **tiX**.

## TestCase 2

**Input :**

rhdt:246,ghftd:1246,pihjen:90,lkbnm:67

**Output:**

ttXX


