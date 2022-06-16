
# Insertion Sort

Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. 

The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

## How Insertion Sort Works?

Consider an example: arr[] = {12, 11, 13, 5, 6}

![image](https://user-images.githubusercontent.com/70228962/174133245-fc1dd8e6-2020-457f-a91c-3c453567c088.png)


### First Pass:

- Initially, the first two elements of the array are compared in insertion sort.

![image](https://user-images.githubusercontent.com/70228962/174133298-696ab9f0-de68-4587-93c0-8f5f15d5b5b3.png)


- Here, 12 is greater than 11 hence they are not in the ascending order and 12 is not at its correct position. Thus, swap 11 and 12.
- So, for now 11 is stored in a sorted sub-array.

![image](https://user-images.githubusercontent.com/70228962/174133366-9f8a0117-9d87-4c88-ad4f-15ef2544cbde.png)


### Second Pass:

- Now, move to the next two elements and compare them

![image](https://user-images.githubusercontent.com/70228962/174133470-03349a84-63ca-4953-a17f-2fd716c86dde.png)

- Here, 13 is greater than 12, thus both elements seems to be in ascending order, hence, no swapping will occur. 12 also stored in a sorted sub-array along with 11

### Third Pass:

- Now, two elements are present in the sorted sub-array which are 11 and 12
- Moving forward to the next two elements which are 13 and 5

![image](https://user-images.githubusercontent.com/70228962/174133753-38837f5e-67f7-4f51-8a8f-66fe637f038f.png)

- Both 5 and 13 are not present at their correct place so swap them
  
![image](https://user-images.githubusercontent.com/70228962/174133859-8f898b92-f13f-4ae6-bae5-cea1a9188109.png)
  
- After swapping, elements 12 and 5 are not sorted, thus swap again

![image](https://user-images.githubusercontent.com/70228962/174133904-5b1e3ac2-081f-4a84-b5ec-af5bb78ca121.png)
  
- Here, again 11 and 5 are not sorted, hence swap again

![image](https://user-images.githubusercontent.com/70228962/174134649-19e124f8-1e20-4976-b427-3cfa47d77060.png)

Here, it is at its correct position

### Fourth Pass:

- Now, the elements which are present in the sorted sub-array are 5, 11 and 12
- Moving to the next two elements 13 and 6

![image](https://user-images.githubusercontent.com/70228962/174134703-54809e24-6759-4759-9e93-963f36f67342.png)

- Clearly, they are not sorted, thus perform swap between both
 
![image](https://user-images.githubusercontent.com/70228962/174134744-44115338-fe0a-4147-94ea-c8c193c7ea36.png)

- Now, 6 is smaller than 12, hence, swap again

![image](https://user-images.githubusercontent.com/70228962/174134804-62061769-03c8-48a4-88d7-e9a52b051657.png)

- Here, also swapping makes 11 and 6 unsorted hence, swap again
 
![image](https://user-images.githubusercontent.com/70228962/174134845-df0cdd9c-7633-4da1-beba-b513a40cdc75.png)

Finally, the array is completely sorted.

### Click [here](./InsertionSort.java) to see the code.

## Time and Space Complextiy of Insertion Sort

- **Time Complexity O(N^2)**
- **Space Complexity O(1)**
