
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static int countSubarray(int N,int K,int[]A)
  {

    //this is default OUTPUT. You can change it.
    int result = 0;

    //write your Logic here:
    for (int i = 0; i < N; i++) {

      for (int j = i; j < N; j++) {

        int sum = 0;
        
        for (int m = i; m <= j; m++) {

          sum += A[m];
        }
        
        if (sum == K) {

          result++;
        }
      }
    }

      return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int N = sc.nextInt ();
    int K = sc.nextInt ();
    
    int[] A = new int[N];
    for (int i = 0; i < N; i++)
    {
        A[i] = sc.nextInt ();
    }
    
    sc.close ();

    //OUTPUT [uncomment & modify if required]
    System.out.print(countSubarray(N,K,A));
  }
}
