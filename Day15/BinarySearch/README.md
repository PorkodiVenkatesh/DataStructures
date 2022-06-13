# Binary Search

- Binary Search is a searching algorithm for finding an element's position in a sorted array.
- Binary search can be implemented only on a sorted list of items. If the elements are not sorted already, we need to sort them first.

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

