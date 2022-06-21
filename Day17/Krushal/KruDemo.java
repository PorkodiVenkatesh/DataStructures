package Krushal;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KruDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many vertices in the graph?");
		int V = sc.nextInt();
		
		System.out.println("How many edges in the graph?");
		int E = sc.nextInt();
		
		Graph g = new Graph(V, E);
		
	
		System.out.println("Enter src,dest and weight for " + E + " edges");
		for (int i =0 ; i < E; i++) {		
			Edge e = new Edge();
			System.out.println("Enter src:");
			e.src = sc.nextInt();
			System.out.println("Enter dest:");
			e.dest = sc.nextInt();
			System.out.println("Enter weight");
			e.weight = sc.nextInt();		
			g.edges.add(e);
		}
		
		System.out.println("Printing all the edges");
		for ( Edge e : g.edges) {
			System.out.println(e.src + " ---- " + e.dest + " = " + e.weight);
		}
		
		Collections.sort(g.edges);
		
		System.out.println("Printing after sorting all the edges");
		for ( Edge e : g.edges) {
			System.out.println(e.src + " ---- " + e.dest + " = " + e.weight);
		}
		
		UnionFind.findMST(g);

	}

}
