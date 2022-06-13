package Prims;

public class Prims {
	public static void Prim(int G[][], int V) {

		int INF = 9999999;
		int no_edge;
		boolean[] selected = new boolean[V];

		no_edge = 0;
		selected[0] = true;

		System.out.println("Edge : Weight");
		int x = 0; // row
		int y = 0; // col
		while (no_edge < V - 1) {
			int min = INF;
		

			for (int i = 0; i < V; i++) {
				if (selected[i] == true) {
					for (int j = 0; j < V; j++) {
						if (!selected[j] && G[i][j] != 0) {
							if (min > G[i][j]) {
								min = G[i][j];
								x = i;
								y = j;
							}
						}
					}
				}
			}
			System.out.println(x + " - " + y + " : " + G[x][y]);
			selected[y] = true;
			no_edge++;
		}
	}

	public static void main(String[] args) {

		int V = 4;

		int[][] G = { 
				{ 0,3,2,2 }, 
				{ 3,0, 0, 4 }, 
				{ 2,0, 0,8}, 
				{  2,4,8,0}
				 };

		Prim(G, V);
	}
}
