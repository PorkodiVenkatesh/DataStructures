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

}
