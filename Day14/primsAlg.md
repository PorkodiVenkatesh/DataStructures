# Prim's Algorithm

- Prim's Algorithm is a **greedy algorithm** that is used **to find the minimum spanning tree from a graph**. 
- Prim's algorithm finds the subset of edges that includes every vertex of the graph such that the sum of the weights of the edges can be minimized.

Prim's algorithm starts with the single node and explores all the adjacent nodes with all the connecting edges at every step. The edges with the minimal weights causing no cycles in the graph got selected.

## Working of Prim's Algorithm

We start from one vertex and keep adding edges with the minumum weight until we reach our goal. The steps for implementing Prim's algorithm are as follows:
 - **Step 1** -  Initialize the minimum spanning tree with a vertex chosen at random.
 - **Step 2** -  Find all the edges that connect the tree to new vertices, find the minimum and add it to the tree
 - **Step 3** -  Keep repeating step 2 until we get a minimum spanning tree

## Example of Prim's Algorithm

Now, let's see the working of prim's algorithm using an example. It will be easier to understand the prim's algorithm using an example.

Suppose, a weighted graph is -

![image](https://user-images.githubusercontent.com/70228962/173323331-18204ff1-8418-47eb-baac-f31a7ea3dab5.png)

**Step 1** - First, we have to choose a vertex from the above graph. Let's choose B.

![image](https://user-images.githubusercontent.com/70228962/173323411-4ec5ceac-f530-4517-9907-71a944ff42a6.png)

**Step 2** - Now, we have to choose and add the edge from vertex B with minumum. There are two edges from vertex B that are B to C with weight 10 and edge B to D with weight 4. Among the edges, the edge BD has the minimum weight. So, add it to the MST.

![image](https://user-images.githubusercontent.com/70228962/173323786-f6bbed99-6442-4bbf-8f2d-7e24599c2d07.png)

**Step 3** -  Now, again, choose the edge with the minimum weight among all the other edges. In this case, the edges DE and CD are such edges. Add them to MST and explore the adjacent of C, i.e., E and A. So, select the edge DE and add it to the MST.

![image](https://user-images.githubusercontent.com/70228962/173323997-58173b61-7133-4a86-aefc-293f8c073965.png)

**Step 4** - Now, select the edge CD, and add it to the MST.

![image](https://user-images.githubusercontent.com/70228962/173324220-63688a72-39d7-43b6-a27c-ebc450dbdeed.png)

**Step 5** - Now, choose the edge CA. Here, we cannot select the edge CE as it would create a cycle to the graph. So, choose the edge CA and add it to the MST.

![image](https://user-images.githubusercontent.com/70228962/173324386-b8082448-3e30-4d91-a7b4-4ae2db9321eb.png)

So, the graph produced in step 5 is the minimum spanning tree of the given graph. The cost of the MST is given below - **Cost of MST = 4 + 2 + 1 + 3 = 10 units.**

## Prim's Algorithm Complexity

- The time complexity of Prim's algorithm is O(E log V).

## Prim's Algorithm Application

- Laying cables of electrical wiring
- In network designed
- To make protocols in network cycles

## Prims Implementation

- **Input:**  Graph is represented by adjancey Matrix
- **Output:** Edeges in the minimum spanning tree along with its weight 
We use
 - boolean array **mstSet[]** to represent the set of vertices included in MST. 
     - If a value mstSet[v] is true, then vertex v is included in MST, otherwise not. 
 - Array **key[]** is used to store key values of all vertices. 
 - Another array **parent[]** to store indexes of parent nodes in MST. The parent array is the output array which is used to show the constructed MST. 

### Click [here](./MST.java) to see the code. Time Complexity of this program is O(V^2)
