# Sub arrays

-   section or part of array
-  An array that is inside another array. 
-  For example, consider the array [1, 2, 3, 4], 
    - The subarrays are (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).
    - There are 10 non-empty sub-arrays. 
- In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays.
- Code: Click [here](./SubArrayDemo.java) to see the full code.
```java
 // Prints all subarrays in arr[0..n-1]
    static void subArray(int arr[])
    {
        int n = arr.length;
        // Pick starting point
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
           
        }
    }
```

### Subsequence

- Subsequences are not required to occupy consecutive positions within the original sequences. 
- For example, consider the array [1, 2, 3, 4], 
      - They are (1), (2), (3), (4), (1,2), (1,3),(1,4), (2,3), (2,4), (3,4), (1,2,3), (1,2,4), (1,3,4), (2,3,4), (1,2,3,4). 
      - There are 15 sub-sequences
- More generally, we can say that for a sequence of size n, we can have ((2 powerof(n))-1) non-empty sub-sequences in total. 

# Why LinkedList

Firstly, let’s define an array. An array is a collection of homogenous values. It has a fixed size which is defined upon initialization. Also, the values are stored in continuous memory locations. Based on these properties, can you see any disadvantages of arrays? 

One of the disadvantages of arrays is that memory could be wasted. As a programmer, you do not always know how much memory to allocate. For example, you are building an application that will ask users for inputs which will then be stored in an array. Since you do not know how many inputs the user will make, you initialize an array with one million indexes as you presume that one million inputs will be sufficient for any user. What if the user only inputs a hundred thousand elements into the array? Then, 90% of the allocated space is wasted. 

Here we can go for ArrayList and LinkedList where size is dynamic. 

Remember ArrayList is internally an array, elements are continuous stored in the memory. But, In LinkedList We can keep elements present in everywhere in the memory and elements are connected together. 

For instance, if we want to insert an element into the front or middle of the arraylist, the first step is we need to check if any element present on the given position. The next step is to open space for the new element by shifting every element after the desired index. Likewise, for deletion, shifting is required after removing an element.  Insertion and deletion are slow in arrays. 

![image](https://user-images.githubusercontent.com/70228962/170506973-dcf23db5-1431-4164-baeb-d2b3582fc29f.png)

Shifiting takes time... 

That is when a Linked List comes into the picture. A linked list is another approach to collecting similar data. Unlike an arraylist, elements in a linked list are not in consecutive memory locations. A linked list is a collection of connected nodes. A node consists of data and the address of the next node.  

![image](https://user-images.githubusercontent.com/70228962/170507040-2994bde0-5752-4c7f-abca-575bd9d23c2a.png)

In linked Lists, inserting and deleting an element in between is faster, because only the address needs to be updated accordingly. 

![image](https://user-images.githubusercontent.com/70228962/170507186-4a03db1b-d2b2-49e3-b40d-d9d2fed63cb8.png)


## When to Choose Arrays, ArrayList and LinkedList

- Arrays suited to small lists, where the size is known. 
- ArrayList can be used for large lists of data where the size is not sure or changes over time. 
    - Where insertion at end  and transerval is higher
- LinkedList also can be used for large lists of data where the size is not sure or changes over time. 
    - Where insertion and deletion in between is higher

## Real world Applications - Linked List

- **Image viewer** – Previous and next images are linked, hence can be accessed by next and previous button. 
- **Previous and next page in web browser** – We can access previous and next URL searched in web browser by pressing back and next button since, they are linked as linked list. 
- **Music Player** – Songs in the music player are linked to the previous and next songs. You can play songs either from the start or end of the list. 

# Types of Linked List 

1. Singly Linked List 
2. Circular Linked List 
3. Doubly Linked List 
4. Circular Doubly List 

## Singly Linked List 

Each node of the singly linked list contains a data field and an address field that contains the reference of the next node. 

**Structure of Node:**

![image](https://user-images.githubusercontent.com/70228962/170503066-0ea0488d-7125-4b53-8534-35dd7abf7977.png)

The nodes are connected to each other in the format below where the value of the next variable of the last node is NULL i.e., next = NULL, which indicates the end of the linked list. 

![image](https://user-images.githubusercontent.com/70228962/170503202-4fdd3f5a-8a9c-4c92-a710-679ea301fe57.png)

## Doubly Linked List

Each node of the doubly linked list contains a data field and 2 address field that stores the reference of the previous and next node.

**Structure of the node**

![image](https://user-images.githubusercontent.com/70228962/170503808-2aeda886-a729-4f2a-bacc-419f4092a0a6.png)

The nodes are connected to each other in the below format where 
    - the value of the next variable of the last node is NULL i.e., next = NULL, which indicates the end of the linked list.
    - the value of the previous variable of the first node is NULL i.e., prev = NULL, which indicates the first of the linked list
    
![image](https://user-images.githubusercontent.com/70228962/170503988-61c240a8-2388-4150-b079-0c2926d46381.png)

## Circular Linked List

Same as Singly Linked List, but the last node points to the first head node forming a circle.

The structure of the node in the Circular Linked List is (same as Singly Linked List)

![image](https://user-images.githubusercontent.com/70228962/170503066-0ea0488d-7125-4b53-8534-35dd7abf7977.png)

The nodes are connected to each other in the below format where the value of the next variable of the last node points the first node (HEAD node) i.e. lastNode.next = HEAD

![image](https://user-images.githubusercontent.com/70228962/170504398-0a0bd3c0-ff16-43fd-b1d5-b21dabeab61a.png)

## Circular Doubly Linked List

Same as Doubly Linked List, but the last node points to the first head node forming a circle.

The structure of the node in the Circular Doubly Linked List (same as Singly Linked List)

![image](https://user-images.githubusercontent.com/70228962/170503808-2aeda886-a729-4f2a-bacc-419f4092a0a6.png)

The nodes are connected to each other in the below format where 
    - the value of the next variable of the last node points the first node (HEAD node)
    - the value of the previous variable of the first node points the last node

![image](https://user-images.githubusercontent.com/70228962/170504726-349fc334-a411-426c-ad62-0943a4b10604.png)

# LinkedList in Collection Framework

- LinkedList is a class in the java.util package
- Internally uses **doubly linked list**

![image](https://user-images.githubusercontent.com/70228962/170507795-386d2826-5b47-403c-9b57-827bb8c14915.png)

- Click [here](./LinkedListDemo.java) to see the code

## LinkedList VS ArrayList Class in the Collection Framework

- ArrayList internally uses a dynamic array to store its elements. LinkedList uses Doubly Linked List to store its elements.
- ArrayList is slow as array manipulation is slower. LinkedList is faster being node based as not much bit shifting required.
- ArrayList implements only List. LinkedList implements List as well as Deque. Linked can act as a queue/stacks as well.
- ArrayList is faster in storing and accessing data. LinkedList is faster in manipulation of data.
- Click [here](./LinkedListVsArrayList.java) to see the code where we have compared the LinkedList and Arraylist
        - Finding out which is faster/slower based on the operations like
                - Insertion at the End
                - Transerval
                - Insertion in the Middle
                - Deletion in the Middle
         - **Conclusion: ArrayList is faster in insertion at the end and transerval. LinkedList is faster in the Insertion and deletion in the middle.**
    

## HackerRank 

Prb 1 - [Java Arraylist](https://www.hackerrank.com/challenges/java-arraylist/problem) - Click [here](./HRPrb1.java) to see the solution

