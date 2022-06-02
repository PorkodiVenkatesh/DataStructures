package LeetCode;

import java.util.Scanner;

public class testimocha2 {
	
	public static boolean updateAdjancent (int a[][], int r, int c) {
	   
		boolean isAdjancentSame = false;
		for (int  i = 0 ;i < r ; i++) {
			for (int j = 1; j < c; j++) {//starting from 2nd cols
				if ((a[i][j-1] == a[i][j]) && (a[i][j-1] !=0)) {
					a[i][j-1] =0;
					a[i][j] =0;
					isAdjancentSame = true;
				}
			}
		}
		
		return isAdjancentSame;
	}
	
	public static boolean updateZeros (int a[][], int r, int c) {
		   
		boolean isDownZeros = false;
		for (int  i = 1 ;i < r ; i++) {//starting from 2nd row
			for (int j = 0; j < c; j++) {
				if ((a[i][j] == 0) && (a[i-1][j] !=0)) {
					a[i][j] = a[i-1][j];
					a[i-1][j] = 0;
					isDownZeros  = true;
				}
			}
		}
		
		return isDownZeros;
	}
	
	public static void main(String[] args) {
		int r,c;
        Scanner sc=new Scanner(System.in);
        
        r=sc.nextInt();
        c=sc.nextInt();
                        
        int[][] a=new int[r][c];
        
        for(int i=0;i<r;i++)
        {
                for(int j=0;j<c;j++)
                {
                        a[i][j]=sc.nextInt();
                }
        }
                
        //printMatrix(a, r, c);       
        reactorMatrix(a,r,c);
       // printMatrix(a, r, c);
	}

	private static void reactorMatrix(int[][] a, int r, int c) {
		
		boolean isDownZeros = true;
		boolean isAdjancentSame = true;
		
		//printMatrix(a, r, c);
		
		while(isDownZeros || isAdjancentSame ) {
			
			isDownZeros = updateZeros (a, r, c);
			System.out.println("isDownZeros = " +isDownZeros);
			printMatrix(a, r, c);
			isAdjancentSame = updateAdjancent (a,r,c);
			System.out.println("isAdjancentSame = " + isAdjancentSame);
			printMatrix(a, r, c);
		 }
		
		int count = 0;
		 
        for(int i=0;i<r;i++)
        {
                for(int j=0;j<c;j++)
                {
                        if (a[i][j] !=0) {
                        	count++;
                        }
                }
        }
        System.out.println(count);
	}
	
	public static void printMatrix(int[][] a, int r, int c) {
		for(int i=0;i<r;i++)
        {
                for(int j=0;j<c;j++)
                {
                       System.out.print(a[i][j] + " ");
                }
                System.out.println();
        }
	}

}

