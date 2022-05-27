import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        
         LinkedList<Integer> list = new LinkedList<>();
         for(int i = 0; i < n ; i++){
             list.add(sc.nextInt());
         }
         
         int q = sc.nextInt();
         for(int i = 0; i < q; i++){
             String s = sc.next();
             switch(s){
                 case "Insert" :
                    int indexToInsert = sc.nextInt();
                    int value = sc.nextInt();
                    list.add(indexToInsert, value);   
                    break;
                 case "Delete":
                    int indexToDelete = sc.nextInt();
                    list.remove(indexToDelete);
                    break;
             }
         }
         
         for (Integer num : list) {
             System.out.print(num + " ");
         }
    }
}
