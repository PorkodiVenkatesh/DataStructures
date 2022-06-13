
# Bubble Sort

Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are not in the intended order.

Just like the movement of air bubbles in the water that rise up to the surface, each element of the array move to the end in each iteration. Therefore, it is called a bubble sort.


## How Bubble Sort Works?

Let us say, we have an array of length n. To sort this array we do the above step (swapping) for n - 1 passes.
In simple terms, first, the largest element goes at its extreme right place then, second largest to the last by one place, and so on. In the ith pass, the ith largest element goes at its right place in the array by swappings.

### Example : 

Suppose we have an array arr=[6,3,2,4,1,5]

**In First Pass :**

![1](https://user-images.githubusercontent.com/82796751/173231236-faa41421-4d17-42be-a433-1167997461c7.gif)

**In Second Pass :**

![2](https://user-images.githubusercontent.com/82796751/173231239-76efaca1-5f34-4c08-86d7-3d26afaf5e56.gif)

**In Third Pass :**

![3](https://user-images.githubusercontent.com/82796751/173231240-e02a006b-aa4d-44b5-8b2f-938ca62e5790.gif)

**In Fourth Pass :**

![4](https://user-images.githubusercontent.com/82796751/173231244-fdfecfe5-aac7-43b9-8fdc-d4ea3f86ca13.gif)

**In Fifth Pass :**

![5](https://user-images.githubusercontent.com/82796751/173231251-55f1210a-9634-4197-aa6e-c916802b1b37.gif)

Click [here](./BubbleSort.java) to see the code.

- **Time Complexity O(N^2)**
- **Space Complexity O(1)**

