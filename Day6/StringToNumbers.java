package Strings;

public class StringToNumbers{

	public static void main(String[] args) {
		
		String s = "123";
		
		System.out.println(s);
		System.out.println(s+5);
		
		//coverting string to Integer
		Integer i = Integer.parseInt(s);
		System.out.println(i);
		System.out.println(i+5);
		
	    //converting string to Double
		Double d  = Double.parseDouble(s);
		System.out.println(d);
		System.out.println(d+5);
		
		
	}

}
