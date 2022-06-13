# Breadth First Searching (BFS)

- Breadth-First Search is a recursive algorithm used for searching all the vertices of a graph data structure
- BFS implementation puts each vertex of the graph into one of two categories- **Visited** and **Not Visited**
- **Algorithm**
 - **Step 1** - Add Start Vertex in the Queue
 - **Step 2** - Take the Vertex in the front of the Queue 
   - **Step 2.1** - Remove it from the queue and Add it in the Visited List
   - **Step 2.1** - Add all the vertex's adjacent to the queue, if the adjancents aren't in the visited list.
 - **Step 3**. Keep repeating steps 2 until the queue is empty and all the vertex are visitied

## Let's see how the Breadth First Search algorithm works with an example

Consider an undirected graph with 6 vertices.  V = {A, B, C, D, E, F} and Start with Vertex A

![image](https://user-images.githubusercontent.com/70228962/173300449-06b16faf-02ca-429b-ab73-ec70d7386d56.png)

### First Iteration
 
