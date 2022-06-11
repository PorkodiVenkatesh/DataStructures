import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static String secretWord(int N, String S)
  {

    //this is default OUTPUT. You can change it.
    String result = "";
    char [] ch = new char[N];
    for(int i=0;i<N;i++)
    {
      ch[i]=S.charAt(i);
    }
    for(int i=0;i<N;i++)
    {
      ch[i]=(char)(122-(int)(ch[i]-97));
    }
    for(int i=0;i<N;i++)
    {
      result +=ch[i];
    }

    //write your Logic here:


      return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int N = sc.nextInt ();
    String S = sc.next();
    
    sc.close ();

    //OUTPUT [uncomment & modify if required]
    System.out.print(secretWord(N,S));
  }
}
