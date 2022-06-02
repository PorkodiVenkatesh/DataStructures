package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDivisibleBy7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		//Taking the BigInteger as Input
		  BigInteger b1 = sc.nextBigInteger();
		  
		  //getting rem from  dividing by 7 i.e typical n%7 
		  // Why BigInteger.valueOf(7)? I have to convert Integer 2 to the BigInteger because that's when I can perform operations with BigInteger
		  BigInteger rem = b1.mod(BigInteger.valueOf(7)); 
		  
		  //Checking the remainder is 0 or not.. so comparing with BigInteger.ZERO
		  if (rem == BigInteger.ZERO)
		    System.out.println("Divisible by 7");
		  else
		    System.out.println("NOt Divisible by 7");

	}

}
