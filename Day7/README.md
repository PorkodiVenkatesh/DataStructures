# Queue

- **FIFO Principle**
- Queue is a data structure which has these followings characteristics:
  - It has two ends from where we can insert or remove element 
  - The process of inserting/adding the element in the queue data structure is called **en-queue**. (en-queue = insert/add) 
  - The process of removing/deleting element from the queue data structure is called **de-queue**. (de-queue = delete/remove)

![image](https://user-images.githubusercontent.com/70228962/171203574-c6541f9a-0dd2-4a39-989a-1bc563cd529f.png)

# Types of Queues

## 1. Simple Queue

In Simple Queue
  - Insertion happens at the back/rear/last end of the queue (i.e) en-queue's element at the rear end
  - Deletion happens at the front/first end of the queue (i.e) de-queue's element from the front element

Imagine the below queue:

![image](https://user-images.githubusercontent.com/70228962/171198327-4fe01a75-907c-4d0b-9554-e9b329661a0f.png)

If I want to perform dequeue operation, after that above queue looks like:

![image](https://user-images.githubusercontent.com/70228962/171198611-f26d314d-b7f4-4bd6-86c1-5f0b4e2268bf.png)

Dequeue removes the front element - 46 from the queue. 

Suppose If I want to enqueue the element 83 to the queue, after that above queue looks like:

![image](https://user-images.githubusercontent.com/70228962/171198915-8f81511b-3555-4d2b-96fc-1a35e9cecc0c.png)

Enqueue inserts the element 85 at the back.

## 2. Circular Queue

In a circular queue, the last node is connected to the first node making a circular link, looks like below image:

![image](https://user-images.githubusercontent.com/70228962/171199754-29b7e997-da6f-4133-80b3-54726bb36d46.png)

**Main advantage of a circular queue over a simple queue is better memory utilization.**  
  - If the last position is full and the first position is empty, we can insert an element in the first position. 
  - This action is not possible in a simple queue.

## 3. Priorty Queue

Priority queue makes data retrieval possible only through a pre determined priority number assigned to the data items.

While the deletion is performed in accordance to priority number (the data item with highest priority is removed first), insertion is performed only in the order.

![image](https://user-images.githubusercontent.com/70228962/171200492-60437bc7-f9d4-461f-ac04-f93aff1d31d5.png)

**Applications:**  In CPU Scheduling -> CPU executes the process with has higher priorty first then removes from the waiting queue.

## 4. Double Ended Queue (Deque)

-  Deque allows to insert and delete the element from both ends (front and rear) of the queue.

![image](https://user-images.githubusercontent.com/70228962/171202645-ed14d6b6-b719-45a7-a1f7-de11e6d3087f.png)

# Queue in  in Collection Framework

- Queue is an interface in collection Framework which followa First-in, First-out Principle

![image](https://user-images.githubusercontent.com/70228962/171795635-3b894c2d-ef27-4353-b715-92b7fdc7a081.png)

- **2 Classes in the Collection Framework**
  - **PriorityQueue**
  - **ArrayDeque** -> implements Queue as well as Deque

## ArrayDeque Class
- Internally its a double ended queue
- Implements the Deque Interface in the collection framework
- Methods
  - deque.addFirst()
  - deque.addLast()
  - deque.removeFirst()
  - deque.removeLast()
  - deque.getFirst()
  - deque.getLast()
  - **Note: I can't access any element in the queue using index (i.e.) deque.get(2), deque.get(0) - Not Possible like Set**
  - Click [here](./ArrayDequeDemo.java) to see the code

### Acting as a Stack

- LinkedList and ArrayDeque can act as stack
- That is, when i create an object for LinkedList and ArrayDeque class, I can access the stack Methods - push(element), pop(), peek()
- Why? because push, pop and peek method is there in Deque interface. And LinkedList and ArrayDeque implements Deque Interface, also tells what should do whenever I call push(),pop() or peek() methods
- Click [here](./ActsAsStack.java) to see the code

## HackerRank Problems

- Prb13: [Queue using Two Stacks](https://www.hackerrank.com/challenges/queue-using-two-stacks/problem) - Click [here](./HRPrb13.java) to see the solution
  - **Note: Solve this problem using ArrayDeque** 

## Code Chef Problems

- Prb2: [Practice Makes Perfect](https://www.codechef.com/submit-v2/PRACTICEPERF) - Click [here](./CCPrb2.java) to see the solution
- Prb3: [TodoList](https://www.codechef.com/submit-v2/TODOLIST) - Click [here](./CCPrb3.java) to see the solution
- Prb4: [Testing Robot](https://www.codechef.com/submit-v2/TSTROBOT) - Click [here](./CCPrb3.java) to see the solution

## Geeks for Geeks Problems
- Prb4: [Validate an IP Address](https://practice.geeksforgeeks.org/problems/validate-an-ip-address-1587115621/1/?page=1&company%5b%5d=Microsoft&category%5b%5d=Strings&sortBy=submissions) -  Click [here](./GFGPrb4.java) to see the solution

