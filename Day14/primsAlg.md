# Prim's Algorithm

- Prim's Algorithm is a **greedy algorithm** that is used **to find the minimum spanning tree from a graph**. 
- Prim's algorithm finds the subset of edges that includes every vertex of the graph such that the sum of the weights of the edges can be minimized.

Prim's algorithm starts with the single node and explores all the adjacent nodes with all the connecting edges at every step. The edges with the minimal weights causing no cycles in the graph got selected.

## Working of Prim's Algorithm

We start from one vertex and keep adding edges with the lowest weight until we reach our goal. The steps for implementing Prim's algorithm are as follows:
  **Step 1** -  Initialize the minimum spanning tree with a vertex chosen at random.
  **Step 2** -  Find all the edges that connect the tree to new vertices, find the minimum and add it to the tree
  **Step 3** -  Keep repeating step 2 until we get a minimum spanning tree

