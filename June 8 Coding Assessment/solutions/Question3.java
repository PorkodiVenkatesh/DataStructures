import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static void getFinalArray(int N, int M,  int[] A, String S)
  {

    //this is default OUTPUT. You can change it.
    for (int i = 0; i < M; i++) {

      char ch = S.charAt(i);
      int d = N / 2;
      switch (ch) {
        case 'L':
          int st = 0;
          int en = d - 1;
          while (st < en) {

            int temp = A[st];
            A[st] = A[en];
            A[en] = temp;
            st++;
            en--;
          }
          break;
        case 'R':
          int stR = d;
          int enR = N - 1;
          while (stR < enR) {

            int temp = A[stR];
            A[stR] = A[enR];
            A[enR] = temp;
            stR++;
            enR--;
          }
          break;
        case 'S':
          int stS = 0;
          int enS = d;
          while(stS < d || enS < N) {

            int temp = A[stS];
            A[stS] = A[enS];
            A[enS] = temp;
            stS++;
            enS++;
          }
          break;
        case 'A':
          int stA = 0;
          int enA = N - 1;
          while (stA < enA) {

            int temp = A[stA];
            A[stA] = A[enA];
            A[enA] = temp;
            stA++;
            enA--;
          }
          break;
      }
    }
    for (int x : A) System.out.print(x + " ");
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int N = sc.nextInt ();
    int M = sc.nextInt();

    int[] A = new int[N];
    for (int i = 0; i < N; i++)
    {
        A[i] = sc.nextInt ();
    }
    
    String S = sc.next();
    
    sc.close ();

    getFinalArray(N,M,A,S);
  }
}
