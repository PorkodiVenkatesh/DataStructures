package Krushal;

import java.util.Arrays;

public class UnionFind {
	public static void findMST(Graph g) {
		
	    int parent[] = new int[g.V];
	    
	    for(int i =0; i < g.V; i++)
	    	parent[i] = -1; 
	    
	    Edge[] MST = new Edge[g.V-1];
	    int mstEdge = 0;
	    
	    //at start all the vertex belongs that own sperate set
	    //S0 = {0}, s1 = {1}
	    System.out.println(Arrays.toString(parent));
	    for (Edge e : g.edges) {
	    	System.out.println("For edge " + e.src + " ---- " + e.dest );
	    	// u -> src
	    	//v -> destn
	    	// find(u) -> Su
	    	int setU = find(parent, e.src);
	    	//find (v) -> Sv
	    	int setV = find(parent, e.dest);
	    	
	    	// su = sv
	    	if (setU == setV) {
	    		System.out.println("This edge forms a cycle");
	    	}
	    	else {
	    		union(parent, setU, setV);
	    		MST[mstEdge] = e;
	    		mstEdge++;
	    		System.out.println("This edge added for MST");
	    	}
	    	System.out.println(Arrays.toString(parent));
	    }
	    
	    System.out.println("MST Edges are");
	    int sum =0;
	    for (Edge e : MST) {
	    	System.out.println(e.src + " ---- " + e.dest + " = " + e.weight);
	    	sum += e.weight;
		}
	    System.out.println("Sum is " + sum);
	    
	}
	 
	private static void union(int[] parent, int setU, int setV) {
		parent[setU] = setV;
		
	}

	public static int find(int[] parent, int i) {
	    	if (parent[i] == -1)
	    		return i;
	    	return find(parent, parent[i]);
	    }
		


}
