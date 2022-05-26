import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n-> no of rows and cols -> square
        
        int a[][] = new int[n][n];
        
        for(int i = 0; i < n ; i++){
            for(int j = 0; j<n ; j++){
                a[i][j] = sc.nextInt();
            } 
        }
     
      int sumLD = 0;
      int sumRD = 0;
      
      //Leftdiagonal
      for (int i = 0; i < n ; i++) { // rows      
             for (int j = 0; j < n; j++) {
             if(i == j)//1 -> 0,0  5 -> 1,1 9 -> 2,2
                 //i and j are equal for all of my diagonal elements
                sumLD += a[i][j]; //sumLD = sumLD+ a[i][j]
             }
            
         }
     
     //Right Diagonal
     int i =0;
    int j = n -1;
              while( ( i <= n -1) && (j >= 0)) {
                  
                  sumRD += a[i][j];
            
                  i++;
                  j--;
         }

     int diff = sumLD - sumRD;
     
    if(diff < 0){
        diff *=-1;
    }
    
    System.out.println(diff);
    
    }
}
