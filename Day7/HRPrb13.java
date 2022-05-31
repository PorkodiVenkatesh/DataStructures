import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
     
     Scanner sc = new Scanner(System.in);
     
     int q = sc.nextInt();
     for(int i = 1; i<=q; i++){
         int choice  = sc.nextInt();//1,2,3
         if (choice == 1){
             //get the data
             //enqueue/adds the data to end of the queue
             int data = sc.nextInt();//42
             queue.add(data); //add, addLast
         }
         else if(choice == 2){
             //deletes the first element
             queue.removeFirst();
         }
         else{
             //print the first element
             System.out.println(queue.getFirst());
             //peek
             //e
         }
     }
     
    
    }
}
