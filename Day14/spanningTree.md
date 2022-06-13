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

![image](https://user-images.githubusercontent.com/70228962/173319376-84dcaa7d-3630-4b2f-a7d3-20d81466dae1.png)

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


