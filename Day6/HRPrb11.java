import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
                int q  = sc.nextInt();
                Integer maxElmt = Integer.MIN_VALUE;
                Stack<Integer> stack = new Stack<>();
                
                for (int i = 0; i< q; i++){
                    int choice = sc.nextInt();
                    switch(choice){
                        case 1 : 
                            int x = sc.nextInt();
                            stack.push(x);
                            if(x > maxElmt) {
                                maxElmt = x;
                            }
                            break;
                        case 2:
                             int popElmt = stack.pop();
                             if(popElmt == maxElmt) {
                                 if(stack.empty()) {
                                     maxElmt = Integer.MIN_VALUE;
                                 }
                                 else {
                                     maxElmt = Collections.max(stack);
                                 }
                        
                             }
                             break;
                        case 3:
                            System.out.println(maxElmt);
                            break;
                    }
                    
                }
        
    }
}
