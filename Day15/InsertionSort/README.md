
# Insertion Sort

Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. 

The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

## How Insertion Sort Works?

Consider an example: arr[]: {12, 11, 13, 5, 6}
```
   12   	   11   	   13   	   5   	   6   
   
```   

### First Pass:

Initially, the first two elements of the array are compared in insertion sort.
```
   12   	   11   	   13   	   5   	   6
```

Here, 12 is greater than 11 hence they are not in the ascending order and 12 is not at its correct position. Thus, swap 11 and 12.
So, for now 11 is stored in a sorted sub-array.

```
   11   	   12   	   13   	   5   	   6   
```

### Second Pass:

Now, move to the next two elements and compare them

```
   11   	   12   	   13   	   5   	   6   
```

Here, 13 is greater than 12, thus both elements seems to be in ascending order, hence, no swapping will occur. 12 also stored in a sorted sub-array along with 11

### Third Pass:

Click [here](./InsertionSort.java) to see the code.

- **Time Complexity O(N^2)**
- **Space Complexity O(1)**
