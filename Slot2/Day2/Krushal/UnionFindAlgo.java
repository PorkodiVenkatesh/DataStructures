package Krushal2;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionFindAlgo {

	public static void findMST(Graph g) {

		int parent[] = new int[g.V];

		for (int i = 0; i < g.V; i++)
			parent[i] = -1;
		// array to hold your V-1 edges (MST edges)(edges that doesn't form a cycle)
		ArrayList<Edge> MSTEdges = new ArrayList<>();
		int edgeCount = 0;

		System.out.println(Arrays.toString(parent));
		for (Edge e : g.edges) {
			int u = e.src;
			int v = e.dest;

			// find(u)
			int setU = find(parent, u);

			// find(v)
			int setV = find(parent, v);

			// setU == SetV
			// edges forms a cycle
			// not equal do union

			if (setU == setV) {
				System.out.println(e.src + " --- " + e.dest + " forms a cycle ");
			} else {
				union(parent, setU, setV);
				System.out.println(e.src + " --- " + e.dest + " doesn't forms a cycle ");
				if (edgeCount < g.V - 1) {
					MSTEdges.add(e);
					edgeCount++;
					System.out.println("In Mst, we have added " + edgeCount + " edges");
				}
			}

			System.out.println(Arrays.toString(parent));
		}
		
		System.out.println("Printing only the edges in MST");
		for (Edge e : MSTEdges) {
			System.out.println(e.src+ "--" + e.dest +" = " + e.weight);
		}
	}

	private static void union(int[] parent, int setU, int setV) {
		parent[setU] = setV;

	}

	private static int find(int[] parent, int i) {
		if (parent[i] == -1)
			return i;
		return find(parent, parent[i]);
	}

}
