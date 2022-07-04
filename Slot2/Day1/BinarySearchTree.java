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

}
