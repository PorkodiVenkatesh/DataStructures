# Depth First Searching (DFS)

- Depth First Search is a recursive algorithm used for searching all the vertices of a graph data structure
- DFS implementation puts each vertex of the graph into one of two categories- **Visited** and **Not Visited**
- We use **stack** datastructure to do Depth-First Searching
- **Algorithm**
  - **Step 1** - Push Start Vertex to the stack
  - **Step 2** - Take the Vertex in the top of the stack
    - **Step 2.1** - Pop it from the top of the stack and Add it in the Visited List
    - **Step 2.2** - Push all the vertex's adjacent to the stack, if the adjancents aren't in the visited list.
  - **Step 3**. Keep repeating steps 2 until the queue is empty and all the vertex are visitied

## Let's see how the Depth First Search algorithm works with an example

Consider an undirected graph with 6 vertices.  V = {A, B, C, D, E, F} and Start with Vertex A

![image](https://user-images.githubusercontent.com/70228962/173314050-d1476681-f131-4609-8906-90fd0e0123b6.png)

### First Iteration

- **Step 1** - Add Start Vertex **A** in the Queue
- **Step 2** - Take the Vertex **A** 
   - **Step 2.1** - Pop **A** from the top of the stack and Add it in the Visited List
   - **Step 2.2** - Adjancent for Vertex **A** are **B**, **C**, and **D**. Pushing  **B**, **C**, and **D** to the top of the stack
   
![image](https://user-images.githubusercontent.com/70228962/173315307-f1ecbe65-5f5a-47f5-afe9-c6655555ad81.png)

> Note: Just pushing the Adjacents in the Alphabetical Order. Then for upcoming iterations we just goona repeat the step 2 until our stack is empty

### Second Iteration

- **Step 2** - Taking the Vertex **D** which is in the top of  the stack
   - **Step 2.1** - Pop **D** from the stack and Add **D** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **D** are **A**, **C**, and **F**. Pushing only **F** to the top of the stack because the Vertex **A** is already visited and Vertex **C** is already in the stack

![image](https://user-images.githubusercontent.com/70228962/173315781-30ff5b14-02f5-4142-9358-1f71840b0fb9.png)

> Note: Repeating the step 2 again. because our stack has element (NOT EMPTY)

### Third Iteration

- **Step 2** - Taking the Vertex **F** which is in the top of  the stack
   - **Step 2.1** - Pop **F** from the stack and Add **F** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **F** is **D**. No need to push anything to the top of the stack because the Vertex **D** is already visited 

![image](https://user-images.githubusercontent.com/70228962/173316268-f8c80d02-9951-4650-8c17-da17f98d5179.png)

> Note: Repeating the step 2 again. because our stack has element (NOT EMPTY)

### Fourth Iteration

- **Step 2** - Taking the Vertex **C** which is in the top of  the stack
   - **Step 2.1** - Pop **C** from the stack and Add **C** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **C** are **A**, **D** and **E**. Pushing only **E** to the top of the stackbecause the Vertex  **A** and **D** are already visited 

![image](https://user-images.githubusercontent.com/70228962/173316883-92439b08-9194-4b85-8052-44a0b9a5b71c.png)

> Note: Repeating the step 2 again. because our stack has element (NOT EMPTY)

### Fifth Iteration

- **Step 2** - Taking the Vertex **E** which is in the top of  the stack
   - **Step 2.1** - Pop **E** from the stack and Add **E** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **E** are **B** and **C**.  No need to push anything to the top of the stack because the Vertex **C** is already visited and  Vertex **B** is already in the stack

![image](https://user-images.githubusercontent.com/70228962/173317034-2067d0c4-45be-42ae-b1a7-e26d2fed8330.png)

> Note: Repeating the step 2 again. because our stack has element (NOT EMPTY)

### Sixth Iteration

- **Step 2** - Taking the Vertex **B** which is in the top of  the stack
   - **Step 2.1** - Pop **B** from the stack and Add **B** in the Visited List
   - **Step 2.2** - Adjancent for Vertex **B** are **A** and **E**.  No need to push anything to the top of the stack because the Vertex **C** and **E** are already visited 

![image](https://user-images.githubusercontent.com/70228962/173317523-61d52c06-0bdf-487b-9fc1-ae76870e4df8.png)

### Since the stack is empty, we have completed the Depth First Traversal of the graph.

## DFS Algorithm Complexity 

- The time complexity of the DFS algorithm is represented in the form of **O(V + E)**, where **V** is the number of nodes and **E** is the number of edges. 
- The space complexity of the DFS algorithm is **O(V)**.
