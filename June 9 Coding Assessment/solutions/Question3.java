import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static void findPhoneNumber(String S)
  {

    
    int result = -404;
int len =S.length();
int count=0;
char[]arr=new char[10];
for(int i=0;i<len;i++){
  if(S.charAt(i)=='0'){
    System.out.println(-1);
    break;
  }
  if(S.charAt(i)>='a'&&S.charAt(i)<='z' || S.charAt(i)>='A' && S.charAt(i)<='z'){
    count=0;
    continue;
  }
  else{
    arr[count]=S.charAt(i);
    count +=1;
   if(count==10){
     for(int j=0;j<10;j++){
       System.out.print(arr[j]);
     }
     break;
   }
  }
}
  


    
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    String S = sc.next();
    
    sc.close ();

   findPhoneNumber(S);
  }
}
