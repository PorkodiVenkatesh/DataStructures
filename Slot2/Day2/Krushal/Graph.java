package Krushal2;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	int V; // no of vertices
	int E; // no of edges
	List<Edge>  edges; // edges which has src, destn and weight
	
	Graph(int V, int E){
		this.V = V;
		this.E = E;
		this.edges = new ArrayList<>();
	}

}
