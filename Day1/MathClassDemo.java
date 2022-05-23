package ArraysAndArrayList;

public class MathClassDemo {
	public static void main(String[] args) {
		//Math is an inbuilt class in java (helps some of the mathematical operations)
	//Math -> java.lang package -> lang is a default package imported jVm
		
		//Inputs and Output of all methods in the Math is double
		
		
		 System.out.println(Math.PI);
		 
		 double powOF2 = Math.pow(2, 5);
		 System.out.println(powOF2);
		 
		 // if you want in int
		 //casting
		 // double -> int
		 // large -> smaller
		 
		 System.out.println((int)powOF2);
		 
		 
		double sqrt = Math.sqrt(81);
		
		System.out.println(sqrt);
		System.out.println((int) sqrt);
		
		
		// you can use if else also
		// for finding the min of 2 nums
		int min = Math.min(5, 8);
		
		int max = Math.max(5, 8);
		
		System.out.println(min);
		System.out.println(max);
		
		
	
	}

}
