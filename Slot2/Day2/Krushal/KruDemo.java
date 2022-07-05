package Krushal2;

import java.util.Collections;
import java.util.Scanner;

public class KruDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many vertices in graph?");
		int V = sc.nextInt();
		
		System.out.println("How many edges in graph?");
		int E = sc.nextInt();
		
		Graph g = new Graph(V, E);
		
		System.out.println("For " + g.E + " edges: ");
		for (int i = 0; i < g.E; i++) {
			Edge e = new Edge();
			//System.out.println("Enter src:");
			e.src = sc.nextInt();
			//System.out.println("Enter dest:");
			e.dest = sc.nextInt();
			//System.out.println("Enter weight:");
			e.weight = sc.nextInt();
			g.edges.add(e);
		}
		
		System.out.println("Printing all the edges:");
		for (Edge e : g.edges) {
			System.out.println(e.src+ "--" + e.dest +" = " + e.weight);
		}
		
		//Step 1: Sort all edges in increasing order of their edge weights
		//all the edges are in g.edges
		//its arraylist, can i use collection.sort()
		Collections.sort(g.edges); // list of Edge objects
		
		System.out.println("Printing all the edges after sorting:");
		for (Edge e : g.edges) {
			System.out.println(e.src+ "--" + e.dest +" = " + e.weight);
		}
		
		UnionFindAlgo.findMST(g);

	}

}
