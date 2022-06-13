# Breadth First Searching (BFS)

- Breadth-First Search is a recursive algorithm used for searching all the vertices of a graph data structure
- BFS implementation puts each vertex of the graph into one of two categories- **Visited** and **Not Visited**
- We use **Queue** datastructure to do Breadth-First Searching
- **Algorithm**
  - **Step 1** - Add Start Vertex in the Queue
  - **Step 2** - Take the Vertex in the front of the Queue 
    - **Step 2.1** - Remove it from the queue and Add it in the Visited List
    - **Step 2.2** - Add all the vertex's adjacent to the queue, if the adjancents aren't in the visited list.
  - **Step 3**. Keep repeating steps 2 until the queue is empty and all the vertex are visitied

## Let's see how the Breadth First Search algorithm works with an example

Consider an undirected graph with 6 vertices.  V = {A, B, C, D, E, F} and Start with Vertex A

![image](https://user-images.githubusercontent.com/70228962/173300449-06b16faf-02ca-429b-ab73-ec70d7386d56.png)

### First Iteration

- **Step 1** - Add Start Vertex **A** in the Queue
- **Step 2** - Take the Vertex **A** 
   - **Step 2.1** - Remove **A** from the queue and Add **A** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **A** are **B**, **C**, and **D**. Adding  **B**, **C**, and **D** to the back of the Queue.
        
![image](https://user-images.githubusercontent.com/70228962/173302349-6ddec5f2-4b4b-49c3-a391-fa1009c035f4.png)

> Note: Just Adding the Adjacents in the Alphabetical Order. Then for upcoming iterations we just goona repeat the step 2 until our queue is empty

### Second Iteration

- **Step 2** - Taking the Vertex **B** which is in the Front of the queue 
   - **Step 2.1** - Remove **B** from the queue and Add **B** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **B** are **A**, and **E**. Adding  only **E** to the back of the Queue because the Vertex **A** is already visited
        
![image](https://user-images.githubusercontent.com/70228962/173303142-168bea5b-daa8-47ec-a100-028a12ef2051.png)

> Note: Repeating the step 2 again. because our queue has element (NOT EMPTY)

### Third Iteration

- **Step 2** - Taking the Vertex **C** which is in the Front of the queue 
   - **Step 2.1** - Remove **C** from the queue and Add **C** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **C** are **A**, **D** and **E**. No need to add any vertex because the Vertex **A** is already visited and Vertices **D** and and **E** are already in the queue.

![image](https://user-images.githubusercontent.com/70228962/173303832-1f0725f0-8eb0-4c89-884d-a69b06c7cbe6.png)

> Note: Repeating the step 2 again. because our queue has element (NOT EMPTY)

### Fourth Iteration

- **Step 2** - Taking the Vertex **D** which is in the Front of the queue 
   - **Step 2.1** - Remove **D** from the queue and Add **D** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **D** are **A**, **C** and **F**. Adding  only **F** to the back of the Queue because the Vertices **A** and **C** are already visited

![image](https://user-images.githubusercontent.com/70228962/173304294-ff88a606-dfe6-4cdd-a4a9-a91ddc99f562.png)

> Note: Repeating the step 2 again. because our queue has element (NOT EMPTY)

### Fifth Iteration

- **Step 2** - Taking the Vertex **E** which is in the Front of the queue 
   - **Step 2.1** - Remove **E** from the queue and Add **E** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **E** are **B** and **C**. No need to add any vertex because the Vertices **B** and **C** are already visited

![image](https://user-images.githubusercontent.com/70228962/173304614-c0692b1d-9b56-4439-8ebe-99d444b66bb4.png)

> Note: Repeating the step 2 again. because our queue has element (NOT EMPTY)

### Sixth Iteration

- **Step 2** - Taking the Vertex **F** which is in the Front of the queue 
   - **Step 2.1** - Remove **F** from the queue and Add **F** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **F** are **D**. No need to add any vertex because the Vertices **D** is already visited

![image](https://user-images.githubusercontent.com/70228962/173304809-b5e8a322-a905-4ccc-b21c-51399f47a4ac.png)

### Since the queue is empty, we have completed the Breadth First Traversal of the graph.

## BFS Algorithm Complexity 

- The time complexity of the BFS algorithm is represented in the form of **O(V + E)**, where V is the number of nodes and E is the number of edges. 
- The space complexity of the BFS algorithm is **O(V)**.
