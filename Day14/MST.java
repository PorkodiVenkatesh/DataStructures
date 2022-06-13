package LeetCode;

//A Java program for Prim's Minimum Spanning Tree (MST) algorithm.

class MST {

	void primMST(int graph[][], int V) {
		// Array to store constructed MST
		int parent[] = new int[V];

		// Key values used to pick minimum weight edge in cut
		int key[] = new int[V];

		// To represent set of vertices included in MST
		Boolean mstSet[] = new Boolean[V];

		// Initialize all keys as INFINITE
		for (int i = 0; i < V; i++) {
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}

		// Always include first 1st vertex in MST.
		key[0] = 0; // Make key 0 so that this vertex is
		// picked as first vertex
		parent[0] = -1; // First node is always root of MST

		// The MST will have V vertices
		for (int count = 0; count < V - 1; count++) {

			// A utility function to find the vertex with minimum key
			// value, from the set of vertices not yet included in MST
			int min = Integer.MAX_VALUE, min_index = -1;

			for (int v = 0; v < V; v++)
				if (mstSet[v] == false && key[v] < min) {
					min = key[v];
					min_index = v;
				}

			// Pick thd minimum key vertex from the set of vertices
			// not yet included in MST
			int u = min_index;

			// Add the picked vertex to the MST Set
			mstSet[u] = true;

			// Update key value and parent index of the adjacent
			// vertices of the picked vertex. Consider only those
			// vertices which are not yet included in MST
			for (int v = 0; v < V; v++)

				// graph[u][v] is non zero only for adjacent vertices of m
				// mstSet[v] is false for vertices not yet included in MST
				// Update the key only if graph[u][v] is smaller than key[v]
				if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
					parent[v] = u;
					key[v] = graph[u][v];
				}
		}

		// print the constructed MST
		System.out.println("Edge \tWeight");
		for (int i = 1; i < V; i++)
			System.out.println(parent[i] + " - " + i + "\t" + key[i]);
	}

	public static void main(String[] args) {

		MST t = new MST();
		int V = 5;
		// adjacency matrix representation of the graph
		int graph[][] = new int[][] { 
			{ 0, 0, 3, 0, 0 }, 
			{ 0, 0, 10, 4, 0 }, 
			{ 3, 10, 0, 2, 6 }, 
			{ 0, 4, 2, 0, 1 },
			{ 0, 0, 6, 1, 0 }};

		// Print the solution
		t.primMST(graph, V);
	}
}
