package Recursions;

public class examples {
	public static void main(String[] args) {
		
		int i1 = fun1(1);
		System.out.println(i1);
//		int i2 = fun2(4,3);
//		System.out.println(i2);
		
		System.out.println(fun2(4,3));
		fun3(25);
	}
	
	public static int fun1(int n)
	{
	    if (n == 4)
	       return n;
	    else 
	    	return 2*fun1(n+1);
	}
	
	static int fun2(int x, int y) 
	{
	  if (x == 0)
	    return y;
	  return fun2(x - 1,  x + y);
	} 
	
	static void fun3(int n)
	{
	  if (n == 0)
	    return;
	 
	  System.out.println(n%2);
	  fun3(n/2);
	}  

}
