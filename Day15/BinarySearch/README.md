# Binary Search

- Binary Search is a searching algorithm for finding an element's position in a sorted array.
- Binary search can be implemented only on a sorted list of items. If the elements are not sorted already, we need to sort them first.
- Follows divide and conquer approach.

## Working of Binary Search

Let's consider sorted array **arr[]** and element to search is **k**

- **Step 1:** Intially, **first = 0** and **last = arr.length -1**
- **Step 2:** Find the midIndex, **midIndex = first + (last – first)/2** or **midIndex = (first + last)/2** and get the **midElement = arr[midIndex]**
- **Step 3:** Compare the midElement with K
    - **Step 3.1:** If k is equal to midElement, then **the element is in the array at the `midIndex`**
    - **Step 3.2:** If k is greater than midElement, then k may be present  only in the right half of the array, i.e., after the mid element. So we recur the right half. Repeat the step 2 considering the **first = midIndex + 1** until your first <= last
    - **Step 3.3** If k is lesser than midElement, then k may be present  only in the left half of the array, i.e., before the mid element. So we recur the left half. Repeat the step 2 considering the **last = midIndex - 1** until your first <= last
- **Step 4:**  If first is greater than last, then **the element is not in the array**  

> NOTE:
>  - May be you can ask, I can find the midIndex using this formula **midIndex = (first + last)/2**, why I have use this formula **midIndex = first + (last – first)/2**
> - But if we calculate the middle index like this **midIndex = (first + last)/2** means our code is not 100% correct, it contains bugs.
> - That is, it fails for larger values of int variables low and high. Specifically, it fails if the sum of low and high is greater than the maximum positive int value(2^31 – 1 ).
> - The sum overflows to a negative value and the value stays negative when divided by 2. In java, it throws ArrayIndexOutOfBoundException.
> - So it’s better to use it like this **midIndex = first + (last – first)/2**

## Example

### Consider the below array, arr[] and the element to search is 56, So, K = 56

![image](https://user-images.githubusercontent.com/70228962/173392296-5a79b2c7-9886-482e-8daf-501d22c78c1b.png)

### First Iteration
- first = 0
- last = arr.length -1 = 9 -1 = 8
- midIndex = (first + last)/2 = (0+8)/2 = 8/2 = 4
- midElement = arr[midIndex] = arr[4] = 39
- k == midElement, 56 == 39 , false
- k > midElment, 56 > 39 , true
    - So, k would be in the right half, updating first = midIndex + 1 = 4 + 1 = 5
 
 ![image](https://user-images.githubusercontent.com/70228962/173393461-d6c851bb-13ef-4634-9468-74b01162870e.png)

> Note: Going for next iteration with updated first since first <= last (5 <= 8) is true

### Second Iteration
- first = 5
- last =  8
- midIndex = (first + last)/2 = (5+8)/2 = 13/2 = 6
- midElement = arr[midIndex] = arr[6] = 51
- k == midElement, 56 == 51 , false
- k > midElment, 56 > 59 , true
    - So, k would be in the right half, updating first = midIndex + 1 = 6 + 1 = 7 
    
![image](https://user-images.githubusercontent.com/70228962/173394419-19f80c04-b88f-49c8-aa12-822b1ee517f1.png)

> Note: Going for next iteration with updated first since first <= last (7 <= 8) is true

### Third Iteration
- first =  7
- last =  8
- midIndex = (first + last)/2 = (7+8)/2 = 15/2 = 7
- midElement = arr[midIndex] = arr[7] = 56
- k == midElement, 56 == 56 , true
    - Return **Element is in the array at 7th index**
 
 ![image](https://user-images.githubusercontent.com/70228962/173394909-9098df1a-b6c3-454a-a894-6698b439c449.png)
 
 > NOTE:
 > - If we used linear search for this sorted array, I need iterate for 7 times
 > - But using Binary search, I have iterated only for 3 times
 > - So, it reduces the time complexity
 > - That's why, its better to use binary search for sorted array

## Implementation of Binary Search

There are two ways to implement the binary search algorithm -
### 1. Using Iterative method
```java
public static int binarySearch(int[] arr, int k) {	
	int f = 0;
	int l = arr.length -1;
	while (f <= l) {
            int mid = f + (l -f)/2;  
            if(k == arr[mid]) 
                return mid;
            else if( k > arr[mid])
                f = mid + 1;
            else
                l = mid - 1;
		}
	return -1;
	}
```

### 2. Using Recursion
```java
public static int binarySearchUsingRecursion(int[] arr, int k) {	
	int f = 0;
	int l = arr.length -1;
	while (f <= l) {
            int mid = f + (l -f)/2;  
            if(k == arr[mid]) 
                return mid;
            else if( k > arr[mid])
                return binarySearchUsingRecurison(arr, k, mid +1 , l);
            else
                return binarySearchUsingRecurison(arr, k, f, mid-1);
		}
	return -1;
	}
```
### Click [here](./binarySearch.java) to see the full code

## Time Complexity and Space Complexity of Linear Search

- Best Case Time Complexity: O(1)
- Average Case Time Complexity: O(logn)
- Worst Case Time Complexity: O(logn)
- Space Complexity : O(1)
    
