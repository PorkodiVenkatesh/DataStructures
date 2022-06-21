package Krushal;

import java.util.Collections;

public class KruAdjanceyMatrixIn2dArrays {
	public static void main(String[] args) {
	int graph[][] = { 
			{0,2,6,0,0,0,0},
			{2,0,0,5,0,0,0},
			{6,0,0,8,0,0,0},
			{0,5,8,0,10,15,0},
			{0,0,0,10,0,6,2},
			{0,0,0,15,6,0,6},
			{0,0,0,0,2,6,0}
	};

	
	Graph g = new Graph(7, 0);
	
	for (int i = 0 ; i < g.V; i++) {
		for(int j = i + 1; j < g.V; j++) {
			if (graph[i][j] != 0) {
				Edge e = new Edge();
				e.src = i;
				e.dest = j;
				e.weight = graph[i][j];
				g.edges.add(e);
				g.E++;
			}
		}
	}
	
	System.out.println("We have " + g.V + " Vertices"
			+ " and " + g.E + " edges");
	
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
