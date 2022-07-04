package GraphTraversal;

import java.util.*;

public class GraphTraversalDemo {

	public static void bfs(int[][] graph, int V, int startVertex) {

		ArrayList<Integer> visited = new ArrayList<>();
		ArrayDeque<Integer> adjQueue = new ArrayDeque<>();

		// Step 1 - Add Start Vertex in the Queue
		adjQueue.addLast(startVertex);

		// Step 2 - Take the Vertex in the front of the Queue
		// Step 2.1 - Remove it from the queue and Add it in the Visited List
		// Step 2.2 - Add all the vertex's adjacent to the queue, if the adjancents
		// aren't in the visited list.

		// Step 3. Keep repeating steps 2 until the queue is empty and all the vertex
		// are visited
		while (visited.size() < V) {
			int vertex = adjQueue.removeFirst();
			visited.add(vertex);
			for (int i = 0; i < V; i++) {
				if (graph[vertex][i] != 0 && visited.contains(i) == false && adjQueue.contains(i) == false) {
					// if its adjancent
					// if its not in the visited list
					// if its not already in the queue
					adjQueue.addLast(i);
				}
			}
		}
	
		//priniting the visited list to get the order
		for (Integer vertex : visited) {
			System.out.println(vertex);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = { { 0, 1, 1, 1, 0, 0 }, { 1, 0, 0, 0, 1, 0 }, { 1, 0, 0, 1, 1, 0 }, { 1, 0, 1, 0, 0, 1 },
				{ 0, 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0 } };

		// no of vertices in the graph -> V
		int V = 6;
		int startVertex = 0; // A
		
		System.out.println("Breadth First Search (BFS): ");
		bfs(graph, V, startVertex);
	}

}
