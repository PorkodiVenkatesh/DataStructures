# Spanning Tree

A spanning tree is a sub-graph of an undirected connected graph, which includes all the vertices of the graph with a minimum possible number of edges.

> The total number of spanning trees with **n vertices that can be created from a complete graph** is equal to n^(n-2).

## Conditions of Spanning Tree

- The number of vertices in the spanning tree would be the same as the number of vertices in the original graph
- The number of edges in the spanning tree would be equal to the number of edges minus 1. i.e., **`E = V-1`**
- The spanning tree should not contain any cycle.
- The spanning tree should not be disconnected.

## Example 

Consider the below graph

![image](https://user-images.githubusercontent.com/70228962/173321073-f631e077-87fa-4570-8bae-09fd5aa8e629.png)

The above graph contains 5 vertices. As we know, the vertices in the spanning tree would be the same as the graph; therefore, V` is equal 5. The number of edges in the spanning tree would be equal to (5 - 1), i.e., 4. The following are the possible spanning trees:

### Spanning Tree 1

![image](https://user-images.githubusercontent.com/70228962/173319468-361617e7-245a-4124-a7af-dfbc49e650b4.png)

### Spanning Tree 2

![image](https://user-images.githubusercontent.com/70228962/173319496-353ee1b3-9f04-4e71-b681-84b3c5e0a868.png)

### Spanning Tree 3

![image](https://user-images.githubusercontent.com/70228962/173319521-d81f586e-ff18-4cbf-9c4b-e72a98748375.png)

### Spanning Tree 4

![image](https://user-images.githubusercontent.com/70228962/173319558-16c746bd-273b-452a-a2b8-f83f24edf2fa.png)

# Mininum Spanning Tree (MST)

The minimum spanning tree is a spanning tree whose sum of the edges is minimum. Consider the below graph that contains the edge weight:

The following are the spanning trees that we can make from the above graph.

- The first spanning tree is a tree in which we have removed the edge between the vertices 1 and 5 shown as below:
    - The sum of the edges of the above tree is (1 + 4 + 5 + 2): 12
- The second spanning tree is a tree in which we have removed the edge between the vertices 1 and 2 shown as below:
    - The sum of the edges of the above tree is (3 + 2 + 5 + 4) : 14
- The third spanning tree is a tree in which we have removed the edge between the vertices 2 and 3 shown as below:
    - The sum of the edges of the above tree is (1 + 3 + 2 + 5) : 11
- The fourth spanning tree is a tree in which we have removed the edge between the vertices 3 and 4 shown as below:
    - The sum of the edges of the above tree is (1 + 3 + 2 + 4) : 10. 

### The edge cost 10 is minimum so it is a minimum spanning tree. So, the Minimum Spanning Tree is

![image](https://user-images.githubusercontent.com/70228962/173319558-16c746bd-273b-452a-a2b8-f83f24edf2fa.png)


