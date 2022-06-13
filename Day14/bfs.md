# Breadth First Searching (BFS)

- Breadth-First Search is a recursive algorithm used for searching all the vertices of a graph data structure
- BFS implementation puts each vertex of the graph into one of two categories- **Visited** and **Not Visited**
- Algorithm
  1. Start by putting any one of the graph's vertices at the back of a queue.
  2. Take the front item of the queue and add it to the visited list.
  3. Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the back of the 
  queue.
  4. Keep repeating steps 2 and 3 until the queue is empty.
