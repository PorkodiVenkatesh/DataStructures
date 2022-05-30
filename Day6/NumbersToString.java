package Strings;

public class NumbersToString {
	public static void main(String[] args) {
		
		int i = 123;
		System.out.println("Int");
		System.out.println(i);
		System.out.println(i+5);
		
		System.out.println("Converting int to string using valueof method");
		String s_i1 = String.valueOf(i);
		System.out.println(s_i1);
		System.out.println(s_i1+5);
		
		System.out.println("Converting int to string by concatenation with empty string");
		String s_i2 = i + "";
		System.out.println(s_i2);
		System.out.println(s_i2+5);
			
		
		double d = 123.4;
		System.out.println("double");
		System.out.println(d);
		System.out.println(d+5);
		
		System.out.println("Converting double to string using valueof method");
		String s_d1 = String.valueOf(d);
		System.out.println(s_d1);
		System.out.println(s_d1+5);
		
		
		
		System.out.println("Converting double to string by concatenation with empty string");
		String s_d2 = d + "";
		System.out.println(s_d2);
		System.out.println(s_d2+5);
			
		
	}

}
