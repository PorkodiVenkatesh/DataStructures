# Queue

- **FIFO Principle****
- Queue is a data structure which has these followings characteristics:
  - It has two ends from where we can insert or remove element 
  - The process of inserting/adding the element in the queue data structure is called **en-queue**. (en-queue = insert/add) 
  - The process of removing/deleting element from the queue data structure is called **de-queue**. (de-queue = delete/remove)

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

Suppose If I want to enqueue the element 85 to the queue, after that above queue looks like:

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

# ArrayDeque Class in Collection Framework


