package Trees;

public class BinarySearchTree {
	
	public static void insertNode(Node nodeToInsert, Node rootNode) {
		if(nodeToInsert.data < rootNode.data) {
			// goes to the left because its lesser than the root node
			if(rootNode.left == null) {
				rootNode.left = nodeToInsert;
				System.out.println("Inserted " + nodeToInsert.data + " to the left of " + rootNode.data);
			}else {
			insertNode(nodeToInsert, rootNode.left);
			}
		}
		else {
			//goes to the right because its greater than / equal to the root node
			if(rootNode.right == null) {
				rootNode.right = nodeToInsert;
				System.out.println("Inserted " + nodeToInsert.data + " to the right of " + rootNode.data);
			}else {
			insertNode(nodeToInsert, rootNode.right);
			}
		}
	}
	
	public static void preOrder(Node rootNode) {
		if(rootNode == null)
			return;
		
		System.out.println(rootNode.data);
		
		preOrder(rootNode.left);
		preOrder(rootNode.right);
					
	}
	
	public static void postOrder(Node rootNode) {
		if(rootNode == null)
			return;
		
		postOrder(rootNode.left);
		postOrder(rootNode.right);
		
		System.out.println(rootNode.data);
	  
	}
	
	public static void inOrder(Node rootNode) {
		if(rootNode == null)
			return;
		
		inOrder(rootNode.left);
		
		System.out.println(rootNode.data);
		
		inOrder(rootNode.right);
	}
	
	public static int findHeight(Node rootNode) {
		
		int leftHeight = 0;
		int rightHeight = 0;
		
		if(rootNode.left != null) {
			leftHeight = 1 + findHeight(rootNode.left);
		}
		if(rootNode.right != null) {
			rightHeight = 1 + findHeight(rootNode.right);
		}
		
		return Math.max(leftHeight, rightHeight);
	}
	
/*
 * Given a BST, write an efficient function to search a given key in it. 
 * The algorithm should return the parent node of the key and
 *  print if the key is the left or right node of the parent node.
 *   If the key is not present in the BST, 
 * the algorithm should be able to determine that.	
 */
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

}
