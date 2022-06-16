
# Selection Sort

The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. 
## How Selection Sort Works?

Set the first element as minimum.

<img width="250" alt="i1" src="https://user-images.githubusercontent.com/82796751/173366788-69e2132c-64df-4065-b4f7-eeca0129c6b0.PNG">

Compare minimum with the second element. If the second element is smaller than minimum, assign the second element as minimum.

Compare minimum with the third element. Again, if the third element is smaller, then assign minimum to the third element otherwise do nothing. The process goes on until the last element.

![image](https://user-images.githubusercontent.com/70228962/174135748-905bf3b9-86ee-44b1-a187-1c5b34592437.png)

After each iteration, minimum is placed in the front of the unsorted list.

<img width="265" alt="i3" src="https://user-images.githubusercontent.com/82796751/173366892-ae6b13f8-2489-4131-aaaf-ed6fce6f5f4b.PNG">

For each iteration, indexing starts from the first unsorted element. Step 1 to 3 are repeated until all the elements are placed at their correct positions.

**First Pass :**

<img width="344" alt="i4" src="https://user-images.githubusercontent.com/82796751/173366910-50e3eb02-6757-41ec-8db4-ea2f84e26dd8.PNG">

**Second Pass :**

<img width="328" alt="i5" src="https://user-images.githubusercontent.com/82796751/173366928-a6000cd7-8ed4-42f8-8623-9ba532026431.PNG">

**Third Pass :**

<img width="341" alt="i6" src="https://user-images.githubusercontent.com/82796751/173366965-6f816f94-7f3e-47db-80d5-a0c99ff69513.PNG">

**Fourth Pass :**

<img width="347" alt="i7" src="https://user-images.githubusercontent.com/82796751/173366981-7aafd911-5261-4799-a015-c4452e81e915.PNG">


Click [here](./SelectionSort.java) to see the code.

- **Time Complexity O(N^2)**
- **Space Complexity O(1)**
