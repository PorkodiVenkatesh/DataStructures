# Breadth First Searching (BFS)

- Breadth-First Search is a recursive algorithm used for searching all the vertices of a graph data structure
- BFS implementation puts each vertex of the graph into one of two categories- **Visited** and **Not Visited**
- **Algorithm**
  **Step 1**. Start by putting any one of the graph's vertices at the back of a queue.
  **Step 2**. Take the front item of the queue and add it to the visited list.
  **Step 3**. Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the back of the 
  queue.
  **Step 4**. Keep repeating steps 2 and 3 until the queue is empty.

## Let's see how the Breadth First Search algorithm works with an example

Consider an undirected graph with 6 vertices.  V = {A, B, C, D, E, F}

![image](https://user-images.githubusercontent.com/70228962/173300449-06b16faf-02ca-429b-ab73-ec70d7386d56.png)

### First Iteration
  
