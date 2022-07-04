package Trees2;

public class BinarySearchTree {
	
	public static void insertNode(Node nodeToInsert, Node rootNode) {
		if (nodeToInsert.data < rootNode.data) {
			// lesser so goes to the left of the rootNode
			if (rootNode.left == null) {
				rootNode.left = nodeToInsert;
				System.out.println("Inserted " + nodeToInsert.data + " to the left of the " + rootNode.data);
			}else {
				insertNode(nodeToInsert, rootNode.left);
			}
			
		}else {
			//greater so goes to right of the root Node
			if(rootNode.right == null) { // if its null 
				rootNode.right = nodeToInsert;
				System.out.println("Inserted " + nodeToInsert.data + " to the right of the " + rootNode.data);
			}else {
				insertNode(nodeToInsert, rootNode.right);
			}			
		}
	}
	
	public static void preOrder(Node rootNode) {
		 if (rootNode == null) {
			return; // when my rootNode is null
		 }
		 System.out.println(rootNode.data); // visting the root
		 
		 preOrder(rootNode.left); // visit all the left
		 
		 preOrder(rootNode.right); //visit all the right
	}
	
	
	public static void postOrder(Node rootNode) {
		if (rootNode == null) {
			return; // when my rootNode is null
		 }
		postOrder(rootNode.left); //visit left
		
		postOrder(rootNode.right); //visit right
		
		System.out.println(rootNode.data); //visit the root
	}
	
	public static void inOrder(Node rootNode) {
		if (rootNode == null) {
			return; // when my rootNode is null
		 }
		inOrder(rootNode.left); //visit left
		
		System.out.println(rootNode.data); //visit the root
		
		inOrder(rootNode.right); //visit right
		
		
	}
	
	public static int findHeight(Node rootNode) {
		int lh = 0; // no left child
		int rh = 0; // no right child
		
		if (rootNode.left != null) { // 1 -> Traversing that one edge
			lh = 1 + findHeight(rootNode.left);
		}
		if(rootNode.right != null) {
			rh = 1 + findHeight(rootNode.right);
		}
		
		return Math.max(lh, rh); // then we  get the height from the deepest leaf node
	}

}
