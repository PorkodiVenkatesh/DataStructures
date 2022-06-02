package BigInteger;
import java.math.BigInteger;
public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("12345678");
		BigInteger b2 = BigInteger.valueOf(5);
		
		//b1+b2
		BigInteger sum = b1.add(b2);
		System.out.println("sum = " + sum);
		
		//b1-b2
		BigInteger diff = b1.subtract(b2);
		System.out.println("diff = " + diff);
		
		//b1*b2
		BigInteger prod = b1.multiply(b2);
		System.out.println("prod = " + prod);
		
		//b1/b2
		BigInteger qut = b1.divide(b2);
		System.out.println("qut = " + qut);
		
		//b1%b2
		BigInteger rem = b1.mod(b2);
		System.out.println("rem = " + rem);
		
		//min value between b1 and b2
		BigInteger minValue = b1.min(b2);
		System.out.println("minValue = " + minValue);
		
		//max value between b1 and b2
		BigInteger maxValue = b1.max(b2);
		System.out.println("maxValue = " + maxValue);
						
		
	}

}
