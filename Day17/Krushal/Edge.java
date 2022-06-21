package Krushal;

public class Edge implements Comparable<Edge>{
	
	int src;
	int dest;
	
	int weight;

	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}

}
