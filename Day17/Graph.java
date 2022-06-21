package Krushal;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	int V; //no of vertices
	int E; //no of edges
	List<Edge>  edges;  // list of edges 
						// each edge have src dest and weight
	
	Graph(int V, int E){
		this.V = V;
		this.E = E;
		this.edges = new ArrayList<Edge>();
	}
	

}
