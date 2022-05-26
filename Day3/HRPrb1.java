import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> lines = new ArrayList();

        for (int i = 1; i <= n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int j = 1; j <= d; j++) {
                al.add(sc.nextInt());
            }
            lines.add(al);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--; y--;
              if (y < lines.get(x).size())
                    System.out.println(lines.get(x).get(y));
               else
                   System.out.println("ERROR!");
        }
    }}
