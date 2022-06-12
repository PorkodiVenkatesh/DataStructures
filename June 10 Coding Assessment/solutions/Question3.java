import java.util.*;
 
public class Main
{
    public static int sumDigits(int a, int b) {
        
        //this is default OUTPUT. You can change it.
        int result = 0;

        //write your Logic here:
        int aF = factorial(a);
        int bF = factorial(b);
        if(aF>bF){
            result = aF/bF;
        }
        else{
            result = bF/aF;
        }
        int sum = sumF(result);
        return sum;
    }
    public static int factorial(int n){
        int i = 2;
        int result = 1;
        while(i<=n){
            result *= i;
            i++;
        }
        return result;
    }
    public static int sumF(int m){
        int n = 0;
        int result = 0;
        while(m!=0){
            n = m%10;
            result += n;
            m /= 10;
        }
        return result;
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        //INPUT [uncomment & modify if required]
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumDigits(a, b));
        sc.close();
    }
}

