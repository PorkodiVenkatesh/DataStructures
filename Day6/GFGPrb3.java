class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
int rotatedmatrix[][] = new int[n][n];
        
        int rM_i =0 , rM_j =0;
        
        for ( int j = n-1; j >=0; j--){
          rM_j =0;
            for(int i =0; i<n ;i++){
              //  System.out.print("i->" + i +" j-> " + j);
                int temp = matrix[i][j];
                rotatedmatrix[rM_i][rM_j] = temp;
               // System.out.println( " " + temp+ "->" + rotatedmatrix[rM_i][rM_j] + " ");
            rM_j++;
                
            }
         rM_i++;
        }
        
        for(int i =0; i < n ; i++){
            for(int j =0; j< n; j++){
                 matrix[i][j] = rotatedmatrix[i][j];
            }
        }
        
    } 
}
