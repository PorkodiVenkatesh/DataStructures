package Trees;

import java.util.Scanner;
/* https://sbme-tutorials.github.io/gallery/trees/Binary_search_tree.svg
 * 8 //root node
8 //n
3
10
1
6
14
4
7
13
 */

public class BSTDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Enter the root node data: ");
		int rootdata = sc.nextInt();
		Node rootNode = new Node(rootdata);
		
		System.out.println("How many nodes you want to insert after root?");
		int n = sc.nextInt();
		
		System.out.println("Enter " + n + " nodes data:");
		for(int i = 0 ; i < n ; i++) {
			int data = sc.nextInt();
			Node nodeToInsert = new Node(data);
			BinarySearchTree.insertNode(nodeToInsert, rootNode);
		}
		
		System.out.println("PreOrder Traversal");
		BinarySearchTree.preOrder(rootNode);
		
		System.out.println("PostOrder Traversal");
		BinarySearchTree.postOrder(rootNode);
		
		System.out.println("InOrder Traversal");
		BinarySearchTree.inOrder(rootNode);
		
		System.out.println("Height of the Tree or Depth of the Tree: "
				+ BinarySearchTree.findHeight(rootNode));
		
	}

}
