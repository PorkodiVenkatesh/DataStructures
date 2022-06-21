package Dijkstras;

import java.util.Arrays;

public class DijkstrasDemo {
	public static void main(String[] args) {

		int graph[][] = { 
				{ 0, 2, 6, 0, 0, 0, 0 }, 
				{ 2, 0, 0, 5, 0, 0, 0 },
				{ 6, 0, 0, 8, 0, 0, 0 },
				{ 0, 5, 8, 0, 10, 15, 0 }, 
				{ 0, 0, 0, 10, 0, 6, 2 }, 
				{ 0, 0, 0, 15, 6, 0, 6 },
				{ 0, 0, 0, 0, 2, 6, 0 } 
				};

		int V = 7;

		int distance[] = new int[V];
		boolean visited[] = new boolean[V];
		int parent[] = new int[V];

		for (int i = 0; i < V; i++) {
			distance[i] = Integer.MAX_VALUE;
			visited[i] = false;
			parent[i] = Integer.MAX_VALUE;
		}

		int sourceVertex = 0;

		distance[sourceVertex] = 0;
		parent[sourceVertex] = -1;

		for (int i = 1; i <= V; i++) {
			System.out.println("For iteration: " + i);
			// step 1
			int u = findMin(distance, visited);

			// step 2
			for (int v = 0; v < V; v++) {
				if (graph[u][v] != 0) {
					if (visited[v] == false) {

						if (distance[u] + graph[u][v] < distance[v]) {
							distance[v] = distance[u] + graph[u][v];
							parent[v] = u;
						}

					}
				}
			}

			// step 3
			visited[u] = true;

			System.out.println(Arrays.toString(distance));
			System.out.println(Arrays.toString(visited));
			System.out.println(Arrays.toString(parent));
			System.out.println("----------------------------------");
		}

		for (int i = 0; i < V; i++) {
			if (i != sourceVertex) {
				System.out.print(sourceVertex + " ---- " + i + " = " + distance[i] + " path = ");

				StringBuffer sb = new StringBuffer();
				sb.append(i);

				int u = i;
				while (parent[u] != -1) {
					int temp = parent[u];
					sb.append('-');
					sb.append(temp);
					u = temp;
				}

				System.out.println(sb.reverse());
			}

		}

	}

	private static int findMin(int[] distance, boolean[] visited) {
		int min = Integer.MAX_VALUE;
		int minVertex = -1;

		for (int i = 0; i < distance.length; i++) {
			if (distance[i] < min && visited[i] == false) {
				min = distance[i];
				minVertex = i;
			}
		}

		System.out.println("min is " + min + " minVertex is " + minVertex);

		return minVertex;
	}

}
