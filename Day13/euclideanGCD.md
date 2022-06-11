# Find GCD using Euclidean Algorithm

Let's take two numbers as n1 and n2. To find **GCD(n1, n2)** follow the below steps
- **Step 1** : Find the greatest and smallest number among the given two numbers (n1 and n2). Let say greatest number as g and smallest number as s.
- **Step 2** : Find the reminder  r = g%s
- **Step 3** : Check if the reminder is 0 or not
  - **Step 3.1** : If reminder is 0 then return s as the GCD(n1, n2)
  - **Step 3.2** : If reminder is greater than 0 then calculate GCD(s,r)

![Screenshot (607)](https://user-images.githubusercontent.com/70228962/173199373-d137bb55-c500-4f1a-adf5-60e6a5af4b9a.png)

- Click [here](./EuclideanGCD.java) to see the full code
