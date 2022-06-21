## Trees

- Non-Linear Data structure
- In hierarchical manner
- consists of nodes connected by edges.
- Tree Example
- Logical Respresentation of Tree

### Click [here](./TreeDataStructurePPT.pdf) to see the content in the PPT

## Tree Terminologies
- Node 
- Edge
- Root Node
- Leaf Nodes/ External Nodes
- Non Leaf Node/ Internal Nodes
- Levels in a Tree
- Parent of a node
- Children of a node
- Sibiling of a node
- Degree of a node
- Path
- Sub Tree
- Height of a node
- Depth of a node
- Height of the tree
- Depth of the tree

### Click [here](./TreeDataStructurePPT.pdf) to see the content in the PPT

## Binary Tree 
- Binary Tree can have 2 children for each element - Right Child and Left Child 
- Types
  - Full Binary Tree
  - Perfect Binary Tree
  - Complete Binary Tree
  - Degenerate or Pathological Tree
  - Balanced Binary Tree
  - Skewed Binary Tree

### Click [here](./TreeDataStructurePPT.pdf) to see the content in the PPT

## Binary Search Tree

- Binary Search Tree can have 2 children for each element.
    - The left subtree of a node contains only nodes with keys lesser than the node’s key.
    - The right subtree of a node contains only nodes with keys greater than the node’s key.
- **BST Implementation - Click [here](./Day16/BST) to see the code**
  - Insertion of a node in an Tree
  - Pre Order, Post Order and In Order Traversal
  - Height or Depth of the Tree

### Click [here](./TreeDataStructurePPT.pdf) to see the content in the PPT
 
## AVL Tree (and its Rotations)

- AVL tree is a self-balancing binary search tree in which each node maintains extra information called a balance factor whose value is either -1, 0 or +1.
- AVL tree got its name after its inventor Georgy Adelson-Velsky and Landis.
- **Balance Factor = (Height of Left Subtree - Height of Right Subtree) or (Height of Right Subtree - Height of Left Subtree)**
- Whenever we do insertion or deletion in a AVL, we have to check the balance factor for all the node
- When the balance factor is other than -1, 0, -1.. then the tree is unbalance
- To make unbalanced to balance, we can perform 4 rotations
  - LL rotation
  - RR rotation
  - LR rotation
  - RL rotation

### Click [here](./AVL%20Tree.pdf) to see the detailed content in the PDF

## Graph Travesal - BFS and DFS Implementation 
- [Breadth First Search](https://github.com/PorkodiVenkatesh/DataStructures/blob/main/Day14/bfs.md) 
- [Depth First Search](https://github.com/PorkodiVenkatesh/DataStructures/blob/main/Day14/dfs.md)

### Click [here](./GraphTraversalDemo.java) to see the full code

## Practice Problems 

1. [Find Nth Prime](./NthPrimePrbStmt.md) - Click [here](./NthPrime.java) to see the solution 
2. Find the factor of given number (for example: input: 8, output: 1, 2, 4, 8) - Click [here](./FactorOfNum.java) to see the solution

## InftQ Problems

1. [Digital OTP]([./](https://github.com/PorkodiVenkatesh/DataStructures/blob/main/InftQProblems/)InftQPrb19.md) - Click [here](./DigitalOTP.java) to see the solution 
2. [Sum of fators](https://github.com/PorkodiVenkatesh/DataStructures/blob/main/InftQProblems/InftQPrb11.md) - Click [here](./SumOfFactors.java) to see the solution 

## Search a Node in BST

### Problem Statement
***Given a BST, write an efficient function to search a given key in it. The algorithm should return the parent node of the key and print if the key is the left or right node of the parent node. If the key is not present in the BST, the algorithm should be able to determine that.***

### Solution
```java
public static void search(Node root, int key, Node parent) {
		if(root == null) {
			System.out.println("key Not Found");
			return;
		}else {
			if (key < root.data) {
				search(root.left, key, root);
			}
			else if(key > root.data){
				search(root.right, key, root);
			}else {
				if(parent == null) {
					System.out.println("key is the root node");
				} else if (key < parent.data) {
					System.out.println("key is in the left of " + parent.data);
				} else {
					System.out.println("key is in the right of " + parent.data);
				}
			}
		}
	}
```
### Click [here](./Day16/BST) to see the full code

## Binary Tree Practice Problem

- You can try also problems in this site - [Techie Delight - Medium](https://medium.com/techie-delight/binary-search-tree-bst-practice-problems-and-interview-questions-ea13a6731098)
