package Trees2;

import java.util.Scanner;

public class BSTDemo {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the data for the root Node");
		int data = sc.nextInt();
		
		Node rootNode  = new Node(data);
		
		
		System.out.println("How many nodes you want to insert?");
		int n = sc.nextInt();
		
		for (int i =0 ; i < n; i++) {
			System.out.println("Enter the data");
			int d = sc.nextInt();
			Node nodeToInsert = new Node(d);
			BinarySearchTree.insertNode(nodeToInsert, rootNode);
		}
		System.out.println("Insertion done!!");
		
	}

}
