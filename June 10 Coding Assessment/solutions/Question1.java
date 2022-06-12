
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static int primeOrPerfectSquareDivisors(int N)
  {

    //this is default OUTPUT. You can change it.
    int result = 0;
    List<Integer> al = new ArrayList<>();
    List<Integer> pr = new ArrayList<>();
    List<Integer> sq = new ArrayList<>();
    //write your Logic here:
    for(int i = 1; i <= N; i++){
      if(N%i == 0){
          al.add(i);
      }
    }
    int count = 0;
    for(int i = 1; i < al.size(); i++){
        count = 0;
        int n = al.get(i);
        for(int j = 1; j <= n; j++){
          if(n%j == 0){
            count++;
          }
        }
        if(count == 2){
          pr.add(i);
        }
    }
    for(int i : al){
      double root = Math.sqrt(i);
      if(root-Math.floor(root) == 0){
        sq.add(i);
      }
    }
    result = pr.size() * sq.size() ;    

    return result;
  }      
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int N = sc.nextInt ();

    sc.close ();

    //OUTPUT [uncomment & modify if required]
    System.out.print(primeOrPerfectSquareDivisors(N));
  }
}
