
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static int countSubstring(String S)
  {
String rex="aeiou";
int len=S.length();
int count=0;
int res =0;
int last=len%3;
for(int i=0;i<len-2;i++){
  count=0;
  for(int j=i;j<i+3;j++){
    String let=String.valueOf(S.charAt(j));
    if(rex.contains(let)){
      count +=1;

    }
    else{count =0;}
  if(count==3){
    res +=1;
    count =0;
  }
  
  }
}
    //this is default OUTPUT. You can change it.
    int result = -404;

    //write your Logic here:


      return res;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    String S = sc.next();
    
    sc.close ();

    //OUTPUT [uncomment & modify if required]
    System.out.print(countSubstring(S));
  }
}
