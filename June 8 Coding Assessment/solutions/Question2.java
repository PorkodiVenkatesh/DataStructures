import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static String taskComplete(int N, String[] name,int[] work)
  {

    //this is default OUTPUT. You can change it.
    String result =" ";
    Stack<String> A= new Stack<>();
    Stack<String> B = new Stack<>();
    for(int i=0;i<N;i++)
    {
      if(work[i]==1)
      {
        A.push(name[i]);
      }
      else
      {
        B.push(name[i]);
      }
    }
    for(int i=0;i<N/2;i++)
    {
      result +=A.pop()+" "+B.pop()+"\n";
    }

    //write your Logic here:


      return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int N = sc.nextInt(); 
    
    String name[] = new String[N];
    int work[] = new int[N];
    for(int i=0;i<N;i++)
    {
        name[i] = sc.next(); 
        work[i] = sc.nextInt();
    }

    sc.close ();

    //OUTPUT [uncomment & modify if required]
    System.out.print(taskComplete(N,name,work));
  }
}
