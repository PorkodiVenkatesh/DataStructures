package Dijkstra;

import java.util.Arrays;
import java.util.Scanner;

public class SingleSourceShortestPath {
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
		
		int V = 7; // no of vertices in graph
		
		//distance[] – stores the shortest distance from source to that vertex
		//visited[] – keeps track whether we visited the array or not
		//parent[] -  keeps track of the parent of each vertex in the shortest path
		//Note: Size of all these arrays would the number of vertices in the graph

		int distance[] = new int[V];
		boolean visited[] = new boolean[V];
		int parent[] = new int[V];
		
		/*
		 * Initialize all with
				distance[i] = ∞ // max value as infinity
				visited [i]  = false
				parent[i] = ∞
		 */
		
		for (int i  =0 ;  i < V; i++) {
			distance[i] = Integer.MAX_VALUE;
			visited[i]  = false;
			parent[i] = Integer.MAX_VALUE;
		}
		
		/*
		 * Get the sourceVertex and then update
				distance[sourceVertex] = 0
				parent[sourceVertex] = -1
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the source vertex: ");
		int sourceVertex = sc.nextInt();
		
		distance[sourceVertex]  = 0; //because i goona start from there so i'm keeping the distance as 0
		parent[sourceVertex]  = -1; //because all of my path goona start from the source vertex, so there won't parent
		
		System.out.println("distance: " + Arrays.toString(distance));
		System.out.println("visited: " + Arrays.toString(visited));
		System.out.println("parent: " + Arrays.toString(parent));
		System.out.println("--------------------------------------------");
		
		//each time we're making one vertex as visited
		// i need to iterate for V times to make all my vertices as visited
		for (int i =1 ; i <= V ; i++) {
			System.out.println("For iteration " + i);
			//step 1 - finding the vertex which has min distance among not visited vertex
			int u = findMin(distance, visited);
			
			
					
			// find the direct edges -> adjancey vertex -> in my graph[u][v]! =0
			for (int v =0 ; v < V; v ++) {
				if (graph[u][v] != 0  && visited [v] == false) { // will consider only the non visited adjancent vertex
				   // 1 -> 2 = u -> v =  0 -> 1 + 1 -> 2 = distance[1] + graph[1][2]  < distance[2]
					if (distance[u] + graph[u][v] < distance[v]) {
						distance[v]  = distance[u] + graph [u][v];
						parent[v] = u;
					}
					
				}
			}
			
			//mark u as visted
			visited[u] = true;
			
			
			System.out.println("distance: " + Arrays.toString(distance));
			System.out.println("visited: " + Arrays.toString(visited));
			System.out.println("parent: " + Arrays.toString(parent));
			System.out.println("--------------------------------------------");
		}
		
		for (int i = 0; i < V ; i++) {
			if (i != sourceVertex) {
				System.out.print(sourceVertex + " --- " + i  + " = " + distance[i] + " path: ");
				
				StringBuffer path = new StringBuffer();
				path.append(i);
				int u = i;
				while (parent[u] != -1) {
					int temp = parent[u];
					path.append('-');
					path.append(temp);
					u = temp;
				}
				
				System.out.println(path.reverse());
				
			}
		}
		


	}

	private static int findMin(int[] distance, boolean[] visited) {
		int min =  Integer.MAX_VALUE;
		int minVertex = -1;
		
		for (int i = 0; i < distance.length ; i++) {
			if (distance[i]  < min && visited[i] == false) {
				min = distance[i];
				minVertex = i;
			}
		}
		System.out.println("min is " + min + " minVertex is  " + minVertex);
		return  minVertex;
	}

}
