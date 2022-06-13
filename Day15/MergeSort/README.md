
# Merge Sort

Merge Sort is one of the most popular sorting algorithms that is based on the principle of Divide and Conquer approach

Merge sort repeatedly breaks down a list into several sublists until each sublist consists of a single element and merging those sublists in a manner that results into a sorted list.


## How Merge Sort Works?

Let us consider an arr=[14,7,3,12,9,11,6,2];

Divide the unsorted list into n sublists, each comprising 1 element. 

Repeatedly merge sublists to produce newly sorted sublists until there is only 1 sublist remaining. 

<img width="420" alt="i1" src="https://user-images.githubusercontent.com/82796751/173374500-4b565ff5-e362-4e83-9272-bf495a34da36.PNG">

The first element of both lists is compared. If sorting in ascending order, the smaller element among two becomes a new element of the sorted list. This procedure is repeated until both the smaller sublists are empty and the newly combined sublist covers all the elements of both the sublists.

<img width="445" alt="i2" src="https://user-images.githubusercontent.com/82796751/173374511-554e0cb4-fe86-4d6c-a429-4b214189d164.PNG">


Click [here](./MergeSort.java) to see the code.

- **Time Complexity O(N log N)**
- **Space Complexity O(1)**
