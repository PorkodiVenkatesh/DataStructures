import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static void frogJump(String S, int N, int K)
  {

    //this is default OUTPUT. You can change it.
    String result = "-404";
List<Character> list=new ArrayList<>();
char c=0;
int j =0;
for(int i=0;i<N;i++){
  if(j==0 ||j==K){
    if(j==K){
      j=0;
    }
    if(S.charAt(i)>=97 && S.charAt(i)<=122){
      c=(char)(S.charAt(i)-32);
      list.add(c);
    }
    if(S.charAt(i)>=65 && S.charAt(i)<=90){
      c=(char)(S.charAt(i)+32);
      list.add(c);
    }
    j++;
    

  }
  else{
    list.add(S.charAt(i));
    j++;
  }
}
for(char a:list){
  System.out.print(a);
}


    //write your Logic here:


     // return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    String S;
    int N;
    S = sc.next(); 
    N = sc.nextInt();
    
    int K = sc.nextInt(); 

    sc.close ();

    //OUTPUT [uncomment & modify if required]
    frogJump(S,N,K);
  }
}
