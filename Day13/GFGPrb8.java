public long toh(int N, int from, int to, int aux) {
        // Your code here
        if(N==0) {
			return 0;
		}
		int steps=0;
		steps+=toh(N-1,from,aux,to);
		System.out.println("move disk "+ N+" from rod "+from+" to rod "+to);
		steps++;
		steps+=toh(N-1,aux,to,from);
		
		return steps;

      
    }
