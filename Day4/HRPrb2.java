import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        //1. take 3 values for a -> store in it an array a
        int a[] = new int[3];
        for (int i = 0; i < 3 ; i++){
            a[i] = sc.nextInt();
        }
        
        // 2. take 3 values for b -> store in it an array b
       int b[] = new int[3];
        for (int i = 0; i < 3 ; i++){
            b[i] = sc.nextInt();
        }
        
        //3. creating a variable to store the a and b score;
        
        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < 3 ; i++){
            if(a[i] > b[i]){
                aScore++;
            }
            else if(b[i] > a[i]){
                bScore++;
            }
        }
        
        System.out.println(aScore+ " " + bScore);
    }
}
